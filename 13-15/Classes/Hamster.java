package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Hamster extends Pet{

    /**
     * Поле "Список команд"
     */
    private ArrayList <String> commandList;

    public ArrayList<String> getCommandList() {
        return commandList;
    }

    public void setCommandList(ArrayList<String> commandList) {
        this.commandList = commandList;
    }

    public Hamster (String name, String dateOfBirthday, String typeAnimal, ArrayList <String> commandList)
    {
        super.name = name;
        super.dateOfBirthday = dateOfBirthday;
        super.typeAnimal = typeAnimal;
        this.commandList = commandList;
    }

    @Override
    public String toString() {
        return "Hamster: " + super.name + ", date of birthday: " + super.dateOfBirthday + ", type: " + super.typeAnimal;
    }
        //return "Hamster: " + super.name + ", date of birthday: " + super.dateOfBirthday + ", type: " + super.typeAnimal + ", commands: " + commandList;

    @Override
    public void addCommand() {
        System.out.println("Введите название команды, котрой вы обучили животное: ");
        Scanner in = new Scanner(System.in);
        String newCommand = in.nextLine();
        commandList.add(newCommand);
    }

    @Override
    public void printCommand() {
        for (int i = 0; i < commandList.size(); i++) {
            System.out.print(commandList.get(i) + " ");
        }
        System.out.println("");
    }

}
package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAnimal {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    private ArrayList<Animal> listAnimal = new ArrayList<>();

    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }
    /**
     * Метод добавления новой команды, выполняемой животным, в список
     */
    public void addToListAnimal(ArrayList<Animal> listAnimal, Animal animal)
    {
        listAnimal.add(animal);
    }

    /**
     * Метод вывода команд, выполняемых животным
     */
    public void printListCommand(Animal animal)
    {
        animal.printCommand();
    }

    /**
     * Метод добавления новой команды, выполняемой животным
     */
    public void addNewCommand(Animal animal)
    {
        animal.addCommand();
    }

    /**
     * Метод добавления нового животного
     */
    public Animal addNewAnimal()
    {
        ArrayList <String> commands = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        String name = in.next();
        System.out.println("Введите дату рождения в формате гггг-мм-дд: ");
        String date = in.next();
        System.out.println("Введите команды, которые может выполнять животное: ");
        String com;
        while (true) {
            System.out.println("Введите команду: ");
            String command = in.next();
            commands.add(command);
            System.out.println("Введите команду: ");
            System.out.println("Введите 0, если ввод команд окончен. Введите любое значение, чтобы продолжить.");
            com = in.next();
            if (com.equals("0"))
            try {
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: выбрано некорректное действие.");
            }
        
        }

        while (true) {
            System.out.println("Выберите тип животного: 1 - Pets (домашние животные), 2 - Pack animal (вьючные животные): ");
            String type = in.next();
            if (type.equals("1") || type.equals("2"))
                try
                {
                    if (Integer.parseInt(type) == 1) 
                    {
                        String typeAnimal = "Pets";
                        while (true) {
                            System.out.println("Выберите животное: 1 - Dog, 2 - Cat, 3 - Hamster");
                            String classAnimal = in.next();
                            if (classAnimal.equals("1") || classAnimal.equals("2") || classAnimal.equals("3"))
                                try
                                {
                                    if (Integer.parseInt(classAnimal) == 1) 
                                    {
                                        Dog newDog = new Dog(name, date, typeAnimal, commands);
                                        return newDog;
                                    }

                                    if (Integer.parseInt(classAnimal) == 2) 
                                    {
                                        Cat newCat = new Cat(name, date, typeAnimal, commands);
                                        return newCat;
                                    }

                                    if (Integer.parseInt(classAnimal) == 3) 
                                    {
                                        Hamster newHamster = new Hamster(name, date, typeAnimal, commands);
                                        return newHamster;
                                    }
                                }
                                catch (NumberFormatException e) {
                                    System.out.println("Ошибка: выбрано некорректное действие.");
                                    
                                }
                        }
                    }
                    if (Integer.parseInt(type) == 2) 
                    {
                        String typeAnimal = "PackAnimal";
                        while (true) {
                            System.out.println("Выберите животное: 1 - Horse, 2 - Camel, 3 - Donkey");
                            String classAnimal = in.next();
                            if (classAnimal.equals("1") || classAnimal.equals("2") || classAnimal.equals("3"))
                            try{
                                if (Integer.parseInt(classAnimal) == 1) 
                                {
                                    Horse newHorse = new Horse(name, date, typeAnimal, commands);
                                    return newHorse;
                                }

                                if (Integer.parseInt(classAnimal) == 2) 
                                {
                                    Camel newCamel = new Camel(name, date, typeAnimal, commands);
                                    return newCamel;
                                }

                                if (Integer.parseInt(classAnimal) == 3) 
                                {
                                    Donkey newDonkey = new Donkey(name, date, typeAnimal, commands);
                                    return newDonkey;
                                }
                            }
                            catch (NumberFormatException e) {
                                System.out.println("Ошибка: выбрано некорректное действие.");
                            }

                        }
                        
                    }
                    return null;
                }
                catch (NumberFormatException e) {
                    System.out.println("Ошибка: выбрано некорректное действие.");
                }
        }
    }
}
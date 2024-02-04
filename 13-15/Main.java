import java.util.ArrayList;
import java.util.Scanner;
import Classes.Camel;
import Classes.Cat;
import Classes.Dog;
import Classes.Donkey;
import Classes.Hamster;
import Classes.Horse;
import Classes.ListAnimal;

public class Main {
    public static void main(String[] args) 
    {
        int counter = 0;

        ArrayList<String> commandFido = new ArrayList<>();
        commandFido.add("Sit");
        commandFido.add("Stay");
        commandFido.add("Fetch");
        Dog fido = new Dog("Fido", "2020-01-01", "Pets", commandFido);

        ArrayList<String> commandBuddy = new ArrayList<>();
        commandBuddy.add("Sit");
        commandBuddy.add("Paw");
        commandBuddy.add("Bark");
        Dog buddy = new Dog("Buddy", "2018-12-10", "Pets", commandBuddy);

        ArrayList<String> commandBella = new ArrayList<>();
        commandBella.add("Sit");
        commandBella.add("Stay");
        commandBella.add("Roll");
        Dog bella = new Dog("Bella", "2019-11-11", "Pets", commandBella);

        ArrayList<String> commandWhiskers = new ArrayList<>();
        commandWhiskers.add("Sit");
        commandWhiskers.add("Pounce");
        Cat whiskers = new Cat("Whiskers", "2019-05-15", "Pets", commandWhiskers);

        ArrayList<String> commandSmudge = new ArrayList<>();
        commandSmudge.add("Sit");
        commandSmudge.add("Pounce");
        commandSmudge.add("Scratch");
        Cat smudge = new Cat("Smudge", "2020-02-20", "Pets", commandSmudge);

        ArrayList<String> commandOliver = new ArrayList<>();
        commandOliver.add("Meow");
        commandOliver.add("Scratch");
        commandOliver.add("Jump");
        Cat oliver = new Cat("Oliver", "2020-06-30", "Pets", commandOliver);

        ArrayList<String> commandHammy = new ArrayList<>();
        commandHammy.add("Roll");
        commandHammy.add("Hide");
        Hamster hammy = new Hamster("Hammy", "2021-03-10", "Pets", commandHammy);

        ArrayList<String> commandPeanut = new ArrayList<>();
        commandPeanut.add("Roll");
        commandPeanut.add("Spin");
        Hamster peanut = new Hamster("Peanut", "2021-03-10", "Pets", commandPeanut);

        ArrayList<String> commandThunder = new ArrayList<>();
        commandThunder.add("Trot");
        commandThunder.add("Canter");
        commandThunder.add("Gallop");
        Horse thunder = new Horse("Thunder", "2015-07-21", "PackAnimal", commandThunder);

        ArrayList<String> commandStorm = new ArrayList<>();
        commandStorm.add("Trot");
        commandStorm.add("Canter");
        Horse storm = new Horse("Storm", "2014-05-05", "PackAnimal", commandStorm);

        ArrayList<String> commandBlaze = new ArrayList<>();
        commandBlaze.add("Trot");
        commandBlaze.add("Jump");
        commandBlaze.add("Gallop");
        Horse blaze = new Horse("Thunder", "2015-07-21", "PackAnimal", commandBlaze);

        ArrayList<String> commandSandy = new ArrayList<>();
        commandSandy.add("Walk");
        commandSandy.add("Carry Load");
        Camel sandy = new Camel("Sandy", "2016-11-03", "PackAnimal", commandSandy);

        ArrayList<String> commandDune = new ArrayList<>();
        commandDune.add("Walk");
        commandDune.add("Sit");
        Camel dune = new Camel("Sandy", "2018-12-12", "PackAnimal", commandDune);

        ArrayList<String> commandSahara = new ArrayList<>();
        commandSahara.add("Walk");
        commandSahara.add("Run");
        Camel sahara = new Camel("Sandy", "2015-08-14", "PackAnimal", commandSahara);

        ArrayList<String> commandEeyore = new ArrayList<>();
        commandEeyore.add("Walk");
        commandEeyore.add("Carry Load");
        Donkey eeyore = new Donkey("Sandy", "2017-09-18", "PackAnimal", commandEeyore);

        ArrayList<String> commandBurro = new ArrayList<>();
        commandBurro.add("Walk");
        commandBurro.add("Carry Load");
        Donkey burro = new Donkey("Sandy", "2017-09-18", "PackAnimal", commandBurro);

        ListAnimal l1 = new ListAnimal();

        l1.addToListAnimal(l1.getListAnimal(), fido);
        l1.addToListAnimal(l1.getListAnimal(), buddy);
        l1.addToListAnimal(l1.getListAnimal(), bella);
        l1.addToListAnimal(l1.getListAnimal(), whiskers);
        l1.addToListAnimal(l1.getListAnimal(), smudge);
        l1.addToListAnimal(l1.getListAnimal(), oliver);
        l1.addToListAnimal(l1.getListAnimal(), hammy);
        l1.addToListAnimal(l1.getListAnimal(), peanut);
        l1.addToListAnimal(l1.getListAnimal(), thunder);
        l1.addToListAnimal(l1.getListAnimal(), storm);
        l1.addToListAnimal(l1.getListAnimal(), blaze);
        l1.addToListAnimal(l1.getListAnimal(), sandy);
        l1.addToListAnimal(l1.getListAnimal(), dune);
        l1.addToListAnimal(l1.getListAnimal(), sahara);
        l1.addToListAnimal(l1.getListAnimal(), eeyore);
        l1.addToListAnimal(l1.getListAnimal(), burro);

        counter = l1.getListAnimal().size();
        while (true ) {
        
            System.out.println("Добро пожаловать на ферму! Выберите действие:");
            System.out.println("1 - Посмотреть список животных, 2 - Получить общее количество животных, 3  - Добавить животное, 4 - Посмотреть команды, выполняемые животным, 5 - Обучить животное новой команде, 0 - выход");
            Scanner in = new Scanner(System.in);
            System.out.print("Введите действие: ");
            String input = in.next();
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("0"))
                try
                {
                    int action = Integer.parseInt(input);
                    if (action == 1)
                    {
                        for (int i = 1; i <= l1.getListAnimal().size(); i+=1)
                        {
                            System.out.println(i + " " + l1.getListAnimal().get(i-1));
                        }
                    }

                    if (action == 2)
                    {
                        System.out.println("Общее количество животных на ферме: " + counter);
                    }

                    if (action == 3)
                    {
                        l1.getListAnimal().add(l1.addNewAnimal());
                        counter = counter + 1;
                    }

                    if (action == 4)
                    {
                        for (int i = 1; i <= l1.getListAnimal().size(); i+=1)
                        {
                            System.out.println(i + " " + l1.getListAnimal().get(i-1));
                        }
                        while (true) {
                            System.out.println("Введите номер животного, чьи команды вы хотите посмотреть: ");
                            String number = in.next();
                            if (Integer.parseInt(number) >= 0 && Integer.parseInt(number) < l1.getListAnimal().size())
                            try{
                                l1.printListCommand(l1.getListAnimal().get(Integer.parseInt(number) - 1));
                                break;
                            }
                            catch (NumberFormatException e) {
                                System.out.println("Ошибка: выбрано некорректное действие.");
                            }
                        }
                        
                    }

                    if (action == 5)
                    {
                        for (int i = 1; i <= l1.getListAnimal().size(); i+=1)
                        {
                            System.out.println(i + " " + l1.getListAnimal().get(i-1));
                        }
                        while (true) {
                            System.out.println("Введите номер животного, которого хотите обучить новой команде: ");
                            String number = in.next();
                            if (Integer.parseInt(number) >= 0 && Integer.parseInt(number) < l1.getListAnimal().size())
                            try{
                                l1.addNewCommand(l1.getListAnimal().get(Integer.parseInt(number)-1));
                                break;
                            }
                            catch (NumberFormatException e) {
                                System.out.println("Ошибка: выбрано некорректное действие.");
                            }
                        }
                    }

                    if (action == 0)
                    {
                        System.out.println("До свидания! Будем ждать вас на нашей ферме!");
                        break;
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Ошибка: выбрано некорректное действие.");
                }
                else
                {
                    System.out.println("Ошибка: выбрано некорректное действие.");
                }
                    
        }
    }
}
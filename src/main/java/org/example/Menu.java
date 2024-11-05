package org.example;

import org.example.DB.DataBase;
import org.example.Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected Scanner scanner = new Scanner(System.in);
    protected DataBase dataBase = new DataBase();
    protected Pets pets = new Pets();
    protected PackAnimals packAnimals = new PackAnimals();
    protected ArrayList<String> list = new ArrayList<>();

    public Menu() {
    }

    public Menu(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    //    public void generalMenu(){
//        while (true){
//            System.out.println("Выберите действие");
//            System.out.println( "1 - Добавить животное, " +
//                                "2 - Список команд животного и обучение животного новым командам " +
//                                "3 - Всего животных " +
//                                "4 - Список всех животных по дате рождения, " +
//                                "5 - Список домашних животных, " +
//                                "6 - Список вьючных животных, " +
//                                "0 - Выход из программы");
//            String ch = scanner.nextLine();
//            switch (ch){
//                case "1":
//                    menuSelectAnimal.selectAnimal();
//                    continue;
//
//                case "2":
//                    System.out.println("Выберите тип животного: 1 - Домашнее животное, 2 - Вьючное животное");
//                    String select = scanner.nextLine();
//                    System.out.println("Введите Id животного");
//                    String id = scanner.nextLine();
//
//                    while (true){
//                        System.out.println("Выберите действие: 1 - Просмотр команд животного, 2 - Добавить новую команду, 0 - Выход в предыдущее меню");
//                        String command = scanner.nextLine();
//                        switch (select){
//                            case "1":
//                                switch (command){
//                                    case "1":
//                                        System.out.println("Действующие команды: ");
//                                        dataBase.listCommands(id, "pets");
//                                        continue;
//                                    case "2":
//                                        System.out.println("Выберите новые команды");
//                                        String newCommands = scanner.nextLine();
//                                        dataBase.addCommand(id, newCommands, "pets");
//                                        continue;
//                                    case "0":
//                                        break;
//                                    default:
//                                        System.out.println("Сделайте корректный выбор");
//                                }
//                                break;
//                            case "2":
//                                switch (command){
//                                    case "1":
//                                        System.out.println("Действующие команды: ");
//                                        dataBase.listCommands(id, "packAnimals");
//                                        continue;
//                                    case "2":
//                                        System.out.println("Добавить новую команду");
//                                        String newCommands = scanner.nextLine();
//                                        dataBase.addCommand(id, newCommands, "packAnimals");
//                                        continue;
//                                    case "0":
//                                        continue;
//                                    default:
//                                        System.out.println("Сделайте корректный выбор");
//                                }
//                                break;
//                            default:
//                                System.out.println("Сделайте корректный выбор");
//                        }
//                        break;
//                    }
//
//                case "3":
//                    System.out.println(pets.getCount() + packAnimals.getCount());
//                    continue;
//                case "4":
//                    dataBase.listAnimalByDateOfBirth();
//                    continue;
//                case "5":
//                    dataBase.printDB("pets");
//                    continue;
//                case "6":
//                    dataBase.printDB("packAnimals");
//                    continue;
//                case "0":
//                    System.out.println("Выход из программы");
//                    return;
//                default:
//                    System.out.println("Сделайте корректный выбор");
//            }
//        }
//    }

//    public void selectAnimal(){
//        while (true){
//            System.out.println("Выберите животное");
//            System.out.println( "1 - Собака, " +
//                    "2 - Кошка, " +
//                    "3 - Хомяк, " +
//                    "4 - Лошадь, " +
//                    "5 - Верблюд, " +
//                    "6 - Осел, " +
//                    "0 - Вернуться в предыдущее меню");
//            String ch = scanner.nextLine();
//            switch (ch){
//                case "1":
//                    list = dataAnimal("pets");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Dog dog = new Dog(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(dog, "pets");
//                    continue;
//                case "2":
//                    list = dataAnimal("pets");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Cat cat = new Cat(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(cat, "pets");
//                    continue;
//                case "3":
//                    list = dataAnimal("pets");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Hamster hamster = new Hamster(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(hamster, "pets");
//                    continue;
//                case "4":
//                    list = dataAnimal("packAnimals");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Horse horse = new Horse(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(horse, "packAnimals");
//                    continue;
//                case "5":
//                    list = dataAnimal("packAnimals");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Camel camel = new Camel(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(camel, "packAnimals");
//                    continue;
//                case "6":
//                    list = dataAnimal("packAnimals");
//                    if (list.size() != 3){
//                        return;
//                    }
//                    Donkey donkey = new Donkey(list.get(0), list.get(1), list.get(2));
//                    dataBase.addAnimal(donkey, "packAnimals");
//                    continue;
//                case "0":
//                    System.out.println("Вернуться в предыдущее меню");
//                    return;
//                default:
//                    System.out.println("Сделайте корректный выбор");
//            }
//        }
//    }
//
//    private ArrayList<String> dataAnimal(String flag) {
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            System.out.println("Имя животного");
//            String name = scanner.nextLine();
//            list.add(name);
//            System.out.println("Дата рождения животного в формате 'dd-mm-yyyy'");
//            String birthday = scanner.nextLine();
//
//            try {
//                String[] arrTemp = birthday.split("-");
//                int temp1 = Integer.parseInt(arrTemp[0]);
//                int temp2 = Integer.parseInt(arrTemp[1]);
//                int temp3 = Integer.parseInt(arrTemp[2]);
//
//                if (birthday.charAt(2) == '-' && birthday.charAt(5) == '-') {
//                    if (temp1 > 0 && temp1 < 31 && temp2 > 0 && temp2 < 13 && temp3 > 999 && temp3 < 10000){
//                        list.add(birthday);
//                    }
//                    else {
//                        System.out.println("Не правильный формат даты");
//                        break;
//                    }
//                }
//
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.out.println("Не правильный формат даты");
//                break;
//            }
//
//            String commands = "";
//            if (flag.equals("pets")) {
//                commands = pets.addCommands();
//                list.add(commands);
//                return list;
//            } else if (flag.equals("packAnimals")) {
//                commands = packAnimals.addCommands();
//                list.add(commands);
//                return list;
//            }
//        }
//        return list;
//    }
}


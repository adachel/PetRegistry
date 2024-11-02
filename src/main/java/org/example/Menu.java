package org.example;


import org.example.DB.DataBase;
import org.example.Models.Animal;
import org.example.Models.Dog;
import org.example.Models.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    DataBase dataBase = new DataBase();
    Pets pets = new Pets();

    public Menu() {
    }

    public void generalMenu(){
        while (true){
            System.out.println("Выберите действие");
            System.out.println( "1 - Добавить животное, " +
                                "2 - Список команд животного и обучение животного новым командам " +
                                "3 - пусто " +
                                "4 - Список всех животных по дате рождения, " +
                                "5 - Список домашних животных, " +
                                "6 - Список вьючных животных, " +
                                "0 - Выход из программы");
            String ch = scanner.next();
            switch (ch){
                case "1":
                    selectAnimal();
                    continue;
                case "2":
                    System.out.println("Выберите тип животного: 1 - Домашнее животное, 2 - Вьючное животное");
                    String select = scanner.next();
                    System.out.println("Введите Id животного");
                    String id = scanner.next();
                    System.out.println("Выберите действие: 1 - Просмотр команд животного, 2 - Добавить новую команду");
                    String command = scanner.next();
                    switch (select){
                        case "1":
                            switch (command){
                                case "1":
                                    dataBase.listCommands(id, "pets");
                                    continue;
                                case "2":
                                    System.out.println("Выберите новые команды");
                                    String newCommands = scanner.next();
                                    dataBase.addCommand(id, newCommands, "pets");
                                    continue;
                                default:
                                    System.out.println("Сделайте корректный выбор");
                            }
                            break;
                        case "2":
                            switch (command){
                                case "1":
                                    dataBase.listCommands(id, "packAnimals");
                                    continue;
                                case "2":
                                    System.out.println("Добавить новую команду");
                                    String newCommands = scanner.next();
                                    dataBase.addCommand(id, newCommands, "packAnimals");
                                    continue;
                                default:
                                    System.out.println("Сделайте корректный выбор");
                            }
                            break;
                        default:
                            System.out.println("Сделайте корректный выбор");
                    }
                    continue;
                case "3":
                    System.out.println("пусто");
                    continue;
                case "4":
                    dataBase.listAnimalByDateOfBirth();
                    continue;
                case "5":
                    dataBase.printDB("pets");
                    continue;
                case "6":
                    dataBase.printDB("packAnimals");
                    continue;
                case "0":
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }

    public void selectAnimal(){
        while (true){
            System.out.println("Выберите животное");
            System.out.println( "1 - Собака, " +
                    "2 - Кошка, " +
                    "3 - Хомяк, " +
                    "4 - Лошадь, " +
                    "5 - Верблюд, " +
                    "6 - Осел, " +
                    "0 - Вернуться в предыдущее меню");
            String ch = scanner.next();
            switch (ch){
                case "1":
                    ArrayList<String> list = dataAnimal();
                    Dog dog = new Dog(list.get(0), list.get(1), list.get(2));
                    dataBase.addAnimal(dog, "pets");
                    continue;
                case "2":
                    System.out.println("Выбрал кошку");
                    continue;
                case "3":
                    System.out.println("Выбрал хомяка");
                    continue;
                case "4":
                    System.out.println("Выбрал лошадь");
                    continue;
                case "5":
                    System.out.println("Выбрал верблюда");
                    continue;
                case "6":
                    System.out.println("Выбрал осла");
                    continue;
                case "0":
                    System.out.println("Вернуться в предыдущее меню");
                    return;
                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }

    private ArrayList<String> dataAnimal(){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Имя животного");
        String name = scanner.next();
        list.add(name);
        System.out.println("Дата рождения животного");
        String birthday = scanner.next();
        list.add(birthday);
        String commands = pets.addCommands();
        list.add(commands);
        return list;
    }
}

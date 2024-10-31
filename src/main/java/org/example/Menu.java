package org.example;


import org.example.DB.DataBase;
import org.example.Models.Animal;
import org.example.Models.Dog;
import org.example.Models.Pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    DataBase dataBase = new DataBase();

    public Menu() {
    }

    public void generalMenu(){
        while (true){
            System.out.println("Выберите действие");
            System.out.println( "1 - Добавить животное, " +
                                "2 - Список команд животного, " +
                                "3 - Обучение животного, " +
                                "4 - Список животных по дате рождения, " +
                                "5 - Список всех домашних животных, " +
                                "6 - Количество домашних животных, " +
                                "0 - Выход из программы");
            String ch = scanner.next();
            switch (ch){
                case "1":
                    selectAnimal();
                    continue;
                case "2":
                    System.out.println("Список команд животного");
                    continue;
                case "3":
                    System.out.println("Обучение животного");
                    continue;
                case "4":
                    System.out.println("Список животных по дате рождения");
                    continue;
                case "5":
                    System.out.println(dataBase.toString());
                    continue;
                case "6":
                    Pets pets = new Pets();
                    System.out.println(pets.getCount());
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
                    System.out.println("Имя собаки");
                    String name = scanner.next();
                    System.out.println("Дата рождения собаки");
                    String birthday = scanner.next();
                    Dog dog = new Dog();
                    ArrayList<String> commands = dog.addCommands();
                    dog = new Dog(name, birthday, commands);
                    dataBase.addAnimal(dog);
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
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }
}

package org.example.Menu;

import org.example.CommandsPets;
import org.example.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private DataBase dataBase = new DataBase();

    public void generalMenu(){
        System.out.println("1 - Добавить животное, 2 - Просмотр всех животных");
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                animalMenu();
                break;
            case 2:
                System.out.println("Просмотр всех животных");
                break;
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void animalMenu(){
        System.out.println("1 - Домашние животные, 2 - Вьючные животные");
        int animal = scanner.nextInt();
        switch (animal){
            case 1:
                petsMenu();
                break;
            case 2:
                packAnimalsMenu();
                break;
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void petsMenu(){
        ArrayList<Object> petsBase = dataBase.Pets;
        System.out.println("1 - Собака, 2 - Кошка, 3 - Хомяк");
        int pets = scanner.nextInt();
        switch (pets){
            case 1:
                System.out.println("Имя собаки");
                String name = scanner.toString();
                System.out.println("День рождения собаки");
                String birthday = scanner.toString();

                break;
            case 2:
                System.out.println("Кошка");
                break;
            case 3:
                System.out.println("Хомяк");
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void packAnimalsMenu(){
        System.out.println("1 - Лошадь, 2 - Верблюд, 3 - Осел");
        int packAnimals = scanner.nextInt();
        switch (packAnimals){
            case 1:
                System.out.println("Лошадь");
                break;
            case 2:
                System.out.println("Верблюд");
                break;
            case 3:
                System.out.println("Осел");
                break;
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public ArrayList<CommandsPets> selectCommandsPets(){
        ArrayList<CommandsPets> commandsPets = new ArrayList<>();
        System.out.println( "Выберите команды из списка:" +
                            "1 - Sit, " +
                            "2 - Stay, " +
                            "3 - Fetch, " +
                            "4 - Pounce, " +
                            "5 - Roll, " +
                            "6 - Hide, " +
                            "7 - Paw, " +
                            "8 - Bark, " +
                            "9 - Scratch, " +
                            "10 - Spin, " +
                            "11 - Meow, " +
                            "12 - Jump, " +
                            "0 - Завершить выбор");
        int packAnimals = scanner.nextInt();
        switch (packAnimals){
            case 1:
                commandsPets.add(CommandsPets.Sit);
                break;
            case 2:
                commandsPets.add(CommandsPets.Stay);
                break;
            case 3:
                commandsPets.add(CommandsPets.Fetch);
                break;
            case 4:
                commandsPets.add(CommandsPets.Pounce);
            case 5:
                commandsPets.add(CommandsPets.Roll);
                break;
            case 6:
                commandsPets.add(CommandsPets.Hide);
                break;
            case 7:
                commandsPets.add(CommandsPets.Paw);
                break;
            case 8:
                commandsPets.add(CommandsPets.Bark);
            case 9:
                commandsPets.add(CommandsPets.Scratch);
                break;
            case 10:
                commandsPets.add(CommandsPets.Spin);
                break;
            case 11:
                commandsPets.add(CommandsPets.Meow);
                break;
            case 12:
                commandsPets.add(CommandsPets.Jump);
                break;
            case 0:
                return commandsPets;
            default: System.out.println("Сделайте корректный выбор");
        }
        return commandsPets;
    }



}

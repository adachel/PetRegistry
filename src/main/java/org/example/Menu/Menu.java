package org.example.Menu;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public void GeneralMenu(){
        System.out.println("1 - Добавить животное, 2 - Просмотр всех животных");
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                AnimalMenu();
                break;
            case 2:
                System.out.println("Просмотр всех животных");
                break;
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void AnimalMenu(){
        System.out.println("1 - Домашние животные, 2 - Вьючные животные");
        int animal = scanner.nextInt();
        switch (animal){
            case 1:
                PetsMenu();
                break;
            case 2:
                PackAnimalsMenu();
                break;
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void PetsMenu(){
        System.out.println("1 - Собака, 2 - Кошка, 3 - Хомяк");
        int pets = scanner.nextInt();
        switch (pets){
            case 1:
                System.out.println("Собака");
                break;
            case 2:
                System.out.println("Кошка");
                break;
            case 3:
                System.out.println("Хомяк");
            default: System.out.println("Сделайте корректный выбор");
        }
    }

    public void PackAnimalsMenu(){
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
}

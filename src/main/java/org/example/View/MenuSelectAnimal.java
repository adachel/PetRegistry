package org.example.View;

import org.example.Controller.Controller;
import org.example.Models.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MenuSelectAnimal extends Menu {

    public MenuSelectAnimal(Controller controller) {
        super(controller);
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

            String ch = scanner.nextLine();

            switch (ch){
                case "1":
                    list = dataAnimal("pets");
                    try {
                        Dog dog = new Dog((String)list.get(0), (LocalDate)list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(dog, "pets");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "2":
                    list = dataAnimal("pets");
                    try {
                        Cat cat = new Cat((String) list.get(0), (LocalDate) list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(cat, "pets");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "3":
                    list = dataAnimal("pets");
                    try {
                        Hamster hamster = new Hamster((String) list.get(0), (LocalDate) list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(hamster, "pets");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "4":
                    list = dataAnimal("packAnimals");
                    try {
                        Horse horse = new Horse((String) list.get(0), (LocalDate) list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(horse, "packAnimals");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "5":
                    list = dataAnimal("packAnimals");
                    try {
                        Camel camel = new Camel((String) list.get(0), (LocalDate) list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(camel, "packAnimals");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "6":
                    list = dataAnimal("packAnimals");
                    try {
                        Donkey donkey = new Donkey((String) list.get(0), (LocalDate) list.get(1), (ArrayList<String>) list.get(2));
                        controller.addAnimal(donkey, "packAnimals");
                    }catch (Exception e){
                        System.out.println("Введите корректные данные");
                    }
                    continue;

                case "0":
                    System.out.println("Вернуться в предыдущее меню");
                    return;

                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }

    private ArrayList<Object> dataAnimal(String flag) {
        ArrayList<Object> list = new ArrayList<>();
        while (true) {
            System.out.println("Имя животного");
            String name = scanner.nextLine();
            list.add(name);
            System.out.println("Дата рождения животного в формате 'dd-mm-yyyy'");
            String birthday = scanner.nextLine();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(birthday, formatter);
                list.add(date);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Не правильный формат даты");
                break;
            }

            ArrayList<String> commands;
            if (flag.equals("pets")) {
                commands = pets.addCommands();
                list.add(commands);
                return list;
            } else if (flag.equals("packAnimals")) {
                commands = packAnimals.addCommands();
                list.add(commands);
                return list;
            }
        }
        return list;
    }
}

package org.example.View;

import org.example.DB.DataBase;
import org.example.Models.*;
import org.example.View.Menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MenuSelectAnimal extends Menu {

    public MenuSelectAnimal(DataBase dataBase) {
        super(dataBase);
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
                    if (list.size() != 3){
                        return;
                    }
                    Dog dog = new Dog(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(dog, "pets");
                    continue;

                case "2":
                    list = dataAnimal("pets");
                    if (list.size() != 3){
                        return;
                    }
                    Cat cat = new Cat(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(cat, "pets");
                    continue;

                case "3":
                    list = dataAnimal("pets");
                    if (list.size() != 3){
                        return;
                    }
                    Hamster hamster = new Hamster(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(hamster, "pets");
                    continue;

                case "4":
                    list = dataAnimal("packAnimals");
                    if (list.size() != 3){
                        return;
                    }
                    Horse horse = new Horse(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(horse, "packAnimals");
                    continue;

                case "5":
                    list = dataAnimal("packAnimals");
                    if (list.size() != 3){
                        return;
                    }
                    Camel camel = new Camel(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(camel, "packAnimals");
                    continue;

                case "6":
                    list = dataAnimal("packAnimals");
                    if (list.size() != 3){
                        return;
                    }
                    Donkey donkey = new Donkey(list.get(0), list.get(1), list.get(2));
                    super.dataBase.addAnimal(donkey, "packAnimals");
                    continue;

                case "0":
                    System.out.println("Вернуться в предыдущее меню");
                    return;

                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }

    private ArrayList<String> dataAnimal(String flag) {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Имя животного");
            String name = scanner.nextLine();
            list.add(name);
            System.out.println("Дата рождения животного в формате 'dd-mm-yyyy'");
            String birthday = scanner.nextLine();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(birthday, formatter);
                String strData = formatter.format(date);
                list.add(strData);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Не правильный формат даты");
                break;
            }

            String commands = "";
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

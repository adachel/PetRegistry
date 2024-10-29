package org.example;

import org.example.DB.DataBase;
import org.example.Models.Dog;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Temp temp = new Temp();
    DataBase dataBase = new DataBase();

    public Menu() {}

    public void generalMenu(){
        while (true){
            System.out.println("1 - Добавить животное, 2 - Просмотр списка животных, 0 - Выход");
            String ch = scanner.next();
            try {
                switch (Integer.parseInt(ch)) {
                    case 1:
                        boolean flag = true;
                        while (flag){
                            System.out.println("1 - Собака, 2 - Кот, 3 - Хомяк, 4 - Лошадь, 5 - Верблюд, 6 - Осел, 0 - Выход");
                            String animal = scanner.next();
                            try {
                                switch (Integer.parseInt(animal)) {
                                    case 1:
                                        temp.addAnimal();
                                        Dog dog = new Dog(temp.getName(), temp.getBirthday(), temp.getCommands());
                                        dataBase.addDBDog(dog);
                                        break;
                                    case 0:
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Сделайте корректный выбор");
                                }
                            }
                            catch (Exception e) {
                                System.out.println("Сделайте корректный выбор");
                            }
                        }
                        break;
                    case 2:
                        System.out.println(dataBase.toString());
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Сделайте корректный выбор");
                }
            }
            catch (Exception e) {
                System.out.println("Сделайте корректный выбор");
            }

        }

    }
}

package org.example;

import org.example.Models.Animal;
import org.example.Models.Dog;
import org.example.Models.Pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    public void generalMenu(){
        System.out.println("1 - Добавить собаку, 2 - Просмотр БД'Pets'");
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                Dog dog = new Dog();
                Pets pets = new Pets(createAnimal(dog));
        }
    }

    public Animal createAnimal(Animal animal){
        System.out.println("Имя животного");
        animal.setName(scanner.next());
        System.out.println("Дата рождения животного");
        animal.setBirthday(scanner.next());
        System.out.println("Команды животного");
        ArrayList<String> commands = new ArrayList<>();

        while (true){
            if (scanner.next().equals("q")){
                break;
            }
            commands.add(scanner.next());
            animal.setCommands(commands);
        }
        return animal;
    }






}

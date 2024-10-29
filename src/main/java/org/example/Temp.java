package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Temp {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private String birthday;
    private ArrayList<String> commands = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public Temp() {}

    public void addAnimal(){
        System.out.println("Имя животного");
        name = scanner.next();
        System.out.println("День рождения животного");
        birthday = scanner.next();
        System.out.println("Введите команды животного, 0 - закончить ввод команд");
        while (true){
            String ch = scanner.next();
            if (ch.equals(String.valueOf(0))){
                return;
            }
            else {
                commands.add(ch);
            }
        }
    }
}

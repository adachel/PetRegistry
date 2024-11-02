package org.example.Models;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private String birthday;
    private String commands;
    private Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCommands() {
        return commands;
    }

    public Animal() {}

    public Animal(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Animal(String name, String birthday, String commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public String addCommands(){
        System.out.println("Введите команды, выполняемые животным, 0 - Закончить ввод команд");
        String command = scanner.nextLine();
        if (command.isEmpty()){
            commands = " ";
        }
        else commands = command;
        return commands;
    }

    @Override
    public String toString() {
        return name + ";" + birthday + ";" + commands;
    }
}

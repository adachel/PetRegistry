package org.example.Models;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private LocalDate birthday;
    private String commands;
    private final Scanner scanner = new Scanner(System.in);

    public Animal() {}

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Animal(String name, LocalDate birthday, String commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public String addCommands(){
        System.out.println("Введите команды, выполняемые животным");
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

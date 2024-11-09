package org.example.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private LocalDate birthday;
    private ArrayList<String> commands;
    private final Scanner scanner = new Scanner(System.in);

    public Animal() {}

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Animal(String name, LocalDate birthday, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public ArrayList<String> addCommands(){
        ArrayList<String> listCommands = new ArrayList<>();
        System.out.println("Введите команды, выполняемые животным, 0 - Завершить ввод команд");
        while (true){
            String command = scanner.nextLine();
            if (command.equals("0")){
                break;
            }
            listCommands.add(command);
            continue;
        }
        return listCommands;
    }

    @Override
    public String toString() {
        return name + ";" + birthday + ";" + commands;
    }
}

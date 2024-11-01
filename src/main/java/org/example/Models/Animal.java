package org.example.Models;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private String birthday;
    private ArrayList<String> commands = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public String getBirthday() { return birthday; }

    public void setBirthday(String birthday) { this.birthday = birthday; }

    public ArrayList<String> getCommands() { return commands; }

    public void setCommands(ArrayList<String> commands) { this.commands = commands; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Animal() {}

    public Animal(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Animal(String name, String birthday, ArrayList<String> commands) {
        this.birthday = birthday;
        this.commands = commands;
        this.name = name;
    }





    public void addCommands(){
        System.out.println("Введите команды, выполняемые животным, 0 - Закончить ввод команд");
        while (true){
            String command = scanner.next();
            if (command.equals("0")){
                return;
            }
            commands.add(command);
        }
    }

    @Override
    public String toString() {
        return "name= " + name + ", " + "birthday= " + birthday + ", " + "commands= " + commands;
    }
}

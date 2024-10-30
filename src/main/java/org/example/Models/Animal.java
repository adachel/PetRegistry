package org.example.Models;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private String birthday;
    private ArrayList<String> commands;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public Animal() {
    }

    public Animal(String birthday, ArrayList<String> commands, String name) {
        this.birthday = birthday;
        this.commands = commands;
        this.name = name;
    }
    abstract void addAnima(Animal animal);

    abstract void printAnimal();
}

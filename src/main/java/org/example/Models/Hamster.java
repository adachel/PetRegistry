package org.example.Models;

import java.util.ArrayList;

public class Hamster {
    private String name;
    private String birthday;
    private ArrayList<String> commands;
    private int count;

    public Hamster(String name, String birthday, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
        count++;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", commands=" + commands +
                '}';
    }
}

package org.example.Models;

import java.util.ArrayList;

public class Horse {
    private String name;
    private String birthday;
    private ArrayList<String> commands;
    private int count;

    public Horse(String name, String birthday, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
        count++;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", commands=" + commands +
                '}';
    }
}

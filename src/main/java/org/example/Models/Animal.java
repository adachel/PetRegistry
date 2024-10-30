package org.example.Models;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private String birthday;
    private ArrayList<String> commands;



    public Animal(String birthday, ArrayList<String> commands, String name) {
        this.birthday = birthday;
        this.commands = commands;
        this.name = name;
    }
}

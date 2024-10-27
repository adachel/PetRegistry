package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {
    private String name;
    private String birthday;
    private ArrayList<CommandsPets> commands;

    public Dog(String name, String birthday, ArrayList<CommandsPets> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", commands=" + commands +
                '}';
    }
}

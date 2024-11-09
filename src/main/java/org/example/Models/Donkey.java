package org.example.Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkey extends PackAnimals{

    private int id;

    public Donkey() {}

    public Donkey(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Donkey(String name, LocalDate birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Donkey";
        return id + ";" + type + ";" + super.toString();
    }
}

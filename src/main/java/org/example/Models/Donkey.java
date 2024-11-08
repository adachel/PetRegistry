package org.example.Models;

import java.time.LocalDate;

public class Donkey extends PackAnimals{

    private int id;

    public Donkey() {}

    public Donkey(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Donkey(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Donkey";
        return id + ";" + type + ";" + super.toString();
    }
}

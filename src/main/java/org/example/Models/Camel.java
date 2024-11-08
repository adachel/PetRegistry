package org.example.Models;

import java.time.LocalDate;

public class Camel extends PackAnimals{

    private int id;

    public Camel() {}

    public Camel(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Camel(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Camel";
        return id + ";" + type + ";" + super.toString();
    }
}

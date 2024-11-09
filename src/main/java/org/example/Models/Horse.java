package org.example.Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends PackAnimals {

    private int id;

    public Horse() {}

    public Horse(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Horse(String name, LocalDate birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Horse";
        return id + ";" + type + ";" + super.toString();
    }
}

package org.example.Models;

import java.time.LocalDate;

public class Hamster extends Pets {

    private int id;

    public Hamster() {}

    public Hamster(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Hamster(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Hamster";
        return id + ";" + type + ";" + super.toString();
    }
}

package org.example.Models;

import java.time.LocalDate;

public class Dog extends Pets {

    private int id;

    public Dog() {}

    public Dog(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Dog(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Dog";
        return id + ";" + type + ";" + super.toString();
    }
}

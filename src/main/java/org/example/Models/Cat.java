package org.example.Models;

import java.time.LocalDate;

public class Cat extends Pets {

    private int id;

    public Cat() {
    }

    public Cat(String name, LocalDate birthday) {
        super(name, birthday);
        this.id = super.getCount();
    }

    public Cat(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        this.id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Cat";
        return id + ";" + type + ";" + super.toString();
    }
}

package org.example.Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamster extends Pets {

    private int id;

    public Hamster() {}

    public Hamster(String name, LocalDate birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Hamster(String name, LocalDate birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }

    @Override
    public String toString() {
        String type = "Hamster";
        return id + ";" + type + ";" + super.toString();
    }
}

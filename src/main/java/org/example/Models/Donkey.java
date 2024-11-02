package org.example.Models;

public class Donkey extends PackAnimals{

    private int id;

    public Donkey() {}

    public Donkey(String name, String birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Donkey(String name, String birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }


    @Override
    public String toString() {
        String type = "Donkey";
        return id + ";" + type + ";" + super.toString();
    }
}
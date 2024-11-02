package org.example.Models;

public class Camel extends PackAnimals{

    private int id;

    public Camel() {}

    public Camel(String name, String birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Camel(String name, String birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }


    @Override
    public String toString() {
        String type = "Camel";
        return id + ";" + type + ";" + super.toString();
    }
}
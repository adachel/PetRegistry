package org.example.Models;

public class Dog extends Pets {

    private int id;

    public Dog() {}

    public Dog(String name, String birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Dog(String name, String birthday, String commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }


    @Override
    public String toString() {
        String type = "Dog";
        return id + ";" + type + ";" + super.toString();
    }
}

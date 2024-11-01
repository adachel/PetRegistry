package org.example.Models;

import org.example.IFunction;

import java.util.ArrayList;

public class Dog extends Pets {

    private int id;

    public Dog() {}

    public Dog(String name, String birthday) {
        super(name, birthday);
        id = super.getCount();
    }

    public Dog(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        id = super.getCount();
    }


    @Override
    public String toString() {
        return "[" + "Id= " + id + ", " + "Type= " + "Dog " + ", " + " " + super.toString() + ']';

    }
}

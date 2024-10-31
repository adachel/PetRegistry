package org.example.Models;

import org.example.IFunction;

import java.util.ArrayList;

public class Dog extends Pets {

    public Dog(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }

    public Dog() {}

    @Override
    public String toString() {
        return "[Dog: " + super.toString() + ']';
    }
}

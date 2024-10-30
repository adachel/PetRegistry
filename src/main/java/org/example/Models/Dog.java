package org.example.Models;

import java.util.ArrayList;

public class Dog extends Pets {

    public Dog(String name, String birthday, ArrayList<String> commands) {
        super(birthday, commands, name);
    }
}

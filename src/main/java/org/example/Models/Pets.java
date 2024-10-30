package org.example.Models;

import java.util.ArrayList;

public class Pets extends Animal{
    private Dog dog;
    private Cat cat;
    private Hamster hamster;
    private int count;


    public Pets(String birthday, ArrayList<String> commands, String name) {
        super(birthday, commands, name);
        count++;
    }

    public Pets(Dog dog, String name, String birthday, ArrayList<String> commands) {
        super(birthday, commands, name);
        this.dog = dog;
        count++;
    }

    public Pets(Cat cat, String name, String birthday, ArrayList<String> commands) {
        super(birthday, commands, name);
        this.cat = cat;
        count++;
    }

    public Pets(Hamster hamster, String name, String birthday, ArrayList<String> commands) {
        super(birthday, commands, name);
        this.hamster = hamster;
        count++;
    }
}

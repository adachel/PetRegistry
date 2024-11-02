package org.example.Models;

import java.util.ArrayList;

public class PackAnimals extends Animal {
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public PackAnimals() {
    }

    public PackAnimals(String name, String birthday) {
        super(name, birthday);
        count++;
    }

    public PackAnimals(String name, String birthday, String commands) {
        super(name, birthday, commands);
        count++;
    }
}

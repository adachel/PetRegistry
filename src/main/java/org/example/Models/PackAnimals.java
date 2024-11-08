package org.example.Models;

import java.time.LocalDate;

public class PackAnimals extends Animal {
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public PackAnimals() {
    }

    public PackAnimals(String name, LocalDate birthday) {
        super(name, birthday);
        count++;
    }

    public PackAnimals(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        count++;
    }
}

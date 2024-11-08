package org.example.Models;

import java.time.LocalDate;

public class Pets extends Animal{
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public Pets() {}

    public Pets(String name, LocalDate birthday) {
        super(name, birthday);
        count++;
    }

    public Pets(String name, LocalDate birthday, String commands) {
        super(name, birthday, commands);
        count++;
    }
}

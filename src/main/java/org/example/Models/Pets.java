package org.example.Models;

import java.time.LocalDate;
import java.util.ArrayList;

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

    public Pets(String name, LocalDate birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        count++;
    }
}

package org.example.Models;

import java.util.ArrayList;

public class Pets extends Animal{
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public Pets() {}

    public Pets(String name, String birthday) {
        super(name, birthday);
        count++;
    }

    public Pets(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        count++;
    }


}

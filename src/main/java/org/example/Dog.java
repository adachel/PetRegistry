package org.example;

import javax.xml.crypto.Data;

public class Dog {
    String name;
    Data birthday;
    CommandsPets[] commands;

    public Dog(String name, Data birthday, CommandsPets[] commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}

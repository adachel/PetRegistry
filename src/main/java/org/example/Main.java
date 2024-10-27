package org.example;

import org.example.Menu.Menu;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.GeneralMenu();

        ArrayList<CommandsPets> commandsPets = new ArrayList<>();
        commandsPets.add(CommandsPets.Fetch);
        commandsPets.add(CommandsPets.Bark);



        Dog dog = new Dog("qqq", "12.12.2020", commandsPets);
        String res = dog.toString();
        System.out.println(res);
    }
}
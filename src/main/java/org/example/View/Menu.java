package org.example.View;

import org.example.DB.DataBase;
import org.example.Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected Scanner scanner = new Scanner(System.in);
    protected DataBase dataBase = new DataBase();
    protected Pets pets = new Pets();
    protected PackAnimals packAnimals = new PackAnimals();
    protected ArrayList<String> list = new ArrayList<>();

    public Menu() {
    }

    public Menu(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}


package org.example.View;

import org.example.Controller.Controller;
import org.example.Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected Scanner scanner = new Scanner(System.in);
    protected Controller controller = new Controller();
    protected Pets pets = new Pets();
    protected PackAnimals packAnimals = new PackAnimals();
    protected ArrayList<Object> list = new ArrayList<>();

    public Menu() {
    }

    public Menu(Controller controller) {
        this.controller = controller;
    }
}


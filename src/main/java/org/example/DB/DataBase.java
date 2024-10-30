package org.example.DB;

import org.example.IFunction;
import org.example.Models.Animal;
import org.example.Models.Pets;

import java.util.ArrayList;

public class DataBase implements IFunction {
    private ArrayList<Pets> petsDB;

    public DataBase() {
    }

    @Override
    public void addAnimal(Animal animal, String name, String birthday, ArrayList<String> commands) {

    }

    @Override
    public void listCommands() {

    }

    @Override
    public void addCommand() {

    }

    @Override
    public void listAnimalByDateOfBirth() {

    }
}

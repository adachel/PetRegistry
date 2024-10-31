package org.example.DB;

import org.example.IFunction;
import org.example.Models.Animal;
import org.example.Models.PackAnimals;
import org.example.Models.Pets;

import java.util.ArrayList;

public class DataBase implements IFunction {
    private ArrayList<Pets> petsDB = new ArrayList<>();
    private ArrayList<PackAnimals> packAnimalsDB;

    public DataBase() {
    }

    @Override
    public void addAnimal(Pets pets) {
        petsDB.add(pets);
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


    @Override
    public String toString() {
        return "petsDB=" + petsDB;
    }
}

package org.example.DB;

import org.example.IFunction;
import org.example.Models.Animal;
import org.example.Models.PackAnimals;
import org.example.Models.Pets;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Pets> petsDB;
    private ArrayList<PackAnimals> packAnimalsDB;


    public DataBase() {
    }

    public ArrayList<Pets> getPetsDB() {
        return petsDB;
    }

    public ArrayList<PackAnimals> getPackAnimalsDB() {
        return packAnimalsDB;
    }


    public String toStringPets() {
        return "DataBase{" +
                "petsDB=" + petsDB +
                '}';
    }
}

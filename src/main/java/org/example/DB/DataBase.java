package org.example.DB;

import org.example.Models.Cat;
import org.example.Models.Dog;
import org.example.Models.Hamster;
import org.example.Models.Horse;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Cat> cats = new ArrayList<>();
    private ArrayList<Hamster> hamsters = new ArrayList<>();
    private ArrayList<Horse> horses = new ArrayList<>();
    private ArrayList<Dog> camels = new ArrayList<>();
    private ArrayList<Dog> donkeys = new ArrayList<>();

    public DataBase() {}

    public void addDBDog(Dog animal){
        dogs.add(animal);
    }

    public void addDBCat(Cat animal){
        cats.add(animal);
    }

    public void addDBCHamster(Hamster animal){
        hamsters.add(animal);
    }

    public void addDBCHorse(Horse animal){
        horses.add(animal);
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "dogs=" + dogs +
                '}';
    }
}

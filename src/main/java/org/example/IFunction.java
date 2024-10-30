package org.example;

import org.example.Models.Animal;
import org.example.Models.Pets;

import java.util.ArrayList;

public interface IFunction {
    void addAnimal(Animal animal, String name, String birthday, ArrayList<String> commands);
    void listCommands();
    void addCommand();
    void listAnimalByDateOfBirth();

}

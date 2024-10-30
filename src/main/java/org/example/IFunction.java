package org.example;

import org.example.Models.Animal;
import org.example.Models.Pets;

import java.util.ArrayList;

public interface IFunction<T> {
    void addAnimalPets(T animal);
    void addAnimalPackAnimals(T animal);
    void listCommands();
    void addCommand();
    void listAnimalByDateOfBirth();

}

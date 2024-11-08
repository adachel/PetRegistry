package org.example.Controller;

import org.example.Models.Animal;

public interface IFunction {
    void addAnimal(Animal animal, String flag);
    void printDB(String flag);
    void listCommands(String Id, String flag);
    void addCommand(String id, String newCommand, String flag);
    void listAnimalByDateOfBirth();
}

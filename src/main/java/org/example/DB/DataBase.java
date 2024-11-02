package org.example.DB;

import org.example.IFunction;
import org.example.Models.Animal;
import org.example.Models.PackAnimals;
import org.example.Models.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataBase implements IFunction {
    private final ArrayList<HashMap<String, String>> petsDB = new ArrayList<>();
    private final ArrayList<HashMap<String, String>> packAnimalsDB = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getPetsDB() {
        return petsDB;
    }

    public ArrayList<HashMap<String, String>> getPackAnimalsDB() {
        return packAnimalsDB;
    }

    public DataBase() {
    }

    @Override
    public void addAnimal(Animal animal, String flag) {
        if (flag.equals("pets")){
            petsDB.add(strToMap(animal));
        }
        else if (flag.equals("packAnimals")){
            packAnimalsDB.add(strToMap(animal));
        }
    }

    @Override
    public void printDB(String flag) {
        if (flag.equals("pets")){
            for (HashMap<String, String> list: petsDB){
                System.out.println(list);
            }
        }
        else if (flag.equals("packAnimals")){
            for (HashMap<String, String> list: packAnimalsDB){
                System.out.println(list);
            }
        }
    }

    @Override
    public void listCommands(String id, String flag) {
        if (flag.equals("pets")){
            for (HashMap<String, String> list: petsDB){
                if (id.equals(list.get("Id"))){
                    System.out.println(list.get("commands"));
                }
            }
        }
        else if (flag.equals("packAnimals")){
            for (HashMap<String, String> list: packAnimalsDB){
                if (id.equals(list.get("Id"))){
                    System.out.println(list.get("commands"));
                }
            }
        }
    }

    @Override
    public void addCommand(String id, String newCommand, String flag) {
        if (flag.equals("pets")){
            for (HashMap<String, String> list: petsDB){
                if (id.equals(list.get("Id"))){
                    String command = list.get("commands");
                    String commands = command + "," + newCommand;
                    list.put("commands", commands);
                }
            }
        }
        else if (flag.equals("packAnimals")){
            for (HashMap<String, String> list: packAnimalsDB){
                if (id.equals(list.get("Id"))){
                    String command = list.get("commands");
                    String commands = command + "," + newCommand;
                    list.put("commands", commands);
                }
            }
        }
    }

    @Override
    public void listAnimalByDateOfBirth() {
        ArrayList<HashMap<String, String>> resultBD = new ArrayList<>(petsDB);
        resultBD = new ArrayList<>(packAnimalsDB);
        for (HashMap<String, String> elem: resultBD){
            System.out.println(elem);
        }
    }




    private LinkedHashMap<String, String> strToMap(Animal animal){
        String str = String.format(String.valueOf(animal));
        String[] arr = str.split(";");
        LinkedHashMap<String, String> elem = new LinkedHashMap<>();
        elem.put("Id", arr[0]);
        elem.put("Type", arr[1]);
        elem.put("name", arr[2]);
        elem.put("birthday", arr[3]);
        elem.put("commands", arr[4]);
        return elem;
    }
}

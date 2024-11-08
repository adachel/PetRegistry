package org.example.Controller;

import org.example.DB.DataBase;
import org.example.Models.Animal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Controller implements IFunction {

    private final DataBase dataBase = new DataBase();

    public Controller() {
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    @Override
    public void addAnimal(Animal animal, String flag) {
        if (flag.equals("pets")){
                dataBase.getPetsDB().add(strToMap(animal));
        }
        if (flag.equals("packAnimals")){
                dataBase.getPackAnimalsDB().add(strToMap(animal));
        }
    }

    @Override
    public void printDB(String flag) {
        if (flag.equals("pets")){
            for (HashMap<String, Object> list: dataBase.getPetsDB()){
                System.out.println(list);
            }
        }
        if (flag.equals("packAnimals")){
            for (HashMap<String, Object> list: dataBase.getPackAnimalsDB()){
                System.out.println(list);
            }
        }
    }

    @Override
    public void listCommands(String id, String flag) {
        if (flag.equals("pets")){
            if (!dataBase.getPetsDB().isEmpty()){
                for (HashMap<String, Object> list: dataBase.getPetsDB()){
                    if (id.equals(list.get("Id"))){
                            System.out.println(list.get("commands"));
                    }
                }
            }
            else System.out.println("Команды не заданы");
        }
        if (flag.equals("packAnimals")){
            if (!dataBase.getPackAnimalsDB().isEmpty()){
                for (HashMap<String, Object> list: dataBase.getPackAnimalsDB()){
                    if (id.equals(list.get("Id"))){
                        System.out.println(list.get("commands"));
                    }
                }
            }
            else System.out.println("Команды не заданы");
        }
    }

    @Override
    public void addCommand(String id, String newCommand, String flag) {
        if (flag.equals("pets")){
            for (HashMap<String, Object> list: dataBase.getPetsDB()){
                if (id.equals(list.get("Id"))){
                    String command = (String) list.get("commands");
                    String commands = command + "," + newCommand;
                    list.put("commands", commands);
                }
            }
        }
        if (flag.equals("packAnimals")){
            for (HashMap<String, Object> list: dataBase.getPackAnimalsDB()){
                if (id.equals(list.get("Id"))){
                    String command = (String) list.get("commands");
                    String commands = command + "," + newCommand;
                    list.put("commands", commands);
                }
            }
        }
    }

    @Override
    public void listAnimalByDateOfBirth() {
        ArrayList<HashMap<String, Object>> resultBD = new ArrayList<>();
        resultBD.addAll(dataBase.getPetsDB());
        resultBD.addAll(dataBase.getPackAnimalsDB());
        for (int i = 0; i < resultBD.size() - 1; i++) {
            for (int j = 0; j < resultBD.size() - 1; j++) {
                LocalDate date1 = (LocalDate) resultBD.get(j).get("birthday");
                LocalDate date2 = (LocalDate) resultBD.get(j + 1).get("birthday");

                int dif = date2.compareTo(date1);
                if (dif > 0){
                    Collections.swap(resultBD, j, j + 1);
                }
            }
        }
        for (HashMap<String, Object> elem: resultBD){
            System.out.println(elem);
        }
    }


    private LinkedHashMap<String, Object> strToMap(Animal animal){
        String str = String.format(String.valueOf(animal));
        String[] arr = str.split(";");
        LinkedHashMap<String, Object> elem = new LinkedHashMap<>();
        elem.put("Id", arr[0]);
        elem.put("Type", arr[1]);
        elem.put("name", arr[2]);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(arr[3], formatter);
        elem.put("birthday", date);

        elem.put("commands", arr[4]);
        return elem;
    }
}

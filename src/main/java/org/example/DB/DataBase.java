package org.example.DB;

import org.example.Models.Animal;
import java.text.SimpleDateFormat;
import java.util.*;


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

            int a = petsDB.size();

            if (!petsDB.isEmpty()){
                for (HashMap<String, String> list: petsDB){
                    if (id.equals(list.get("Id"))){
                        System.out.println(list.get("commands"));
                    }
                }
            }
            else System.out.println("Команды не заданы");

        }
        else if (flag.equals("packAnimalsDB")){
            if (!packAnimalsDB.isEmpty()){
                for (HashMap<String, String> list: packAnimalsDB){
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
        ArrayList<HashMap<String, String>> resultBD = new ArrayList<>();
        resultBD.addAll(petsDB);
        resultBD.addAll(packAnimalsDB);
        for (int i = 0; i < resultBD.size() - 1; i++) {
            for (int j = 0; j < resultBD.size() - 1; j++) {
                try {
                    String q1 = resultBD.get(j).get("birthday");
                    String q2 = resultBD.get(j + 1).get("birthday");

                    SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");

                    Date date1 = format1.parse(q1);
                    Date date2 = format2.parse(q2);

                    int dif = date2.compareTo(date1);
                    if (dif > 0){
                        Collections.swap(resultBD, j, j + 1);
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Не правильный формат даты");
                    return;
                }
            }
        }
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

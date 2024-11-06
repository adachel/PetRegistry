package org.example.View;

import org.example.DB.DataBase;

import java.util.ArrayList;
import java.util.HashMap;


public class MenuCommands extends Menu{
    public MenuCommands(DataBase dataBase) {
        super(dataBase);
    }
    public void selectCommands(){
        while (true){
            System.out.println("Тип животного: " +
                    "1 - Домашнее животное, " +
                    "2 - Вьючное животное, " +
                    "0 - Выход в предыдущее меню");
            String select = scanner.nextLine();

            switch (select){
                case "1":
                    selectAction("pets");
                    continue;
                case "2":
                    selectAction("packAnimals");
                    continue;
                case "0":
                    break;
                default:
                    System.out.println("Сделайте корректный выбор: домашнее или вьючное");
                    continue;
            }
            break;
        }
    }

    private void selectAction(String flag){
        String id;
        while (true){
            System.out.println("Выберите действие: ");
            System.out.println( "1 - Просмотр команд животного, " +
                    "2 - Добавить новую команду, " +
                    "0 - Выход в предыдущее меню");
            String command = scanner.nextLine();
            switch (command){
                case "1":
                    System.out.println("Действующие команды: ");
                    id = inputID(flag);
                    super.dataBase.listCommands(id, flag);
                    continue;
                case "2":
                    id = inputID(flag);
                    System.out.println("Введите новые команды");
                    String newCommands = scanner.nextLine();
                    super.dataBase.addCommand(id, newCommands, flag);
                    continue;
                case "0":
                    break;
                default:
                    System.out.println("Сделайте корректный выбор");
                    continue;
            }
            break;
        }

    }

    private String inputID(String flag){
        ArrayList<HashMap<String, String>> arr;
        StringBuilder arrId = new StringBuilder();
        String result = "";
        System.out.println("Введите Id животного из списка: ");
        if (flag.equals("pets")){
            arr = super.dataBase.getPetsDB();
            for (HashMap<String, String> elem: arr){
                arrId.append(elem.get("Id")).append(",");
                System.out.println("  " + elem.get("Id") + " " + elem.get("name"));
            }
        }
        if (flag.equals("packAnimals")){
            arr = super.dataBase.getPackAnimalsDB();
            for (HashMap<String, String> elem: arr){
                arrId.append(elem.get("Id")).append(",");
                System.out.println("  " + elem.get("Id") + " " + elem.get("name"));
            }
        }
        String id = scanner.nextLine();
        if (arrId.toString().contains(id)){
            result = id;
        }
        else System.out.println("Такого нет в списке");
        return result;
    }
}

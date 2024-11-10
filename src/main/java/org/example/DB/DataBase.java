package org.example.DB;

import java.util.*;

public class DataBase {
    private final ArrayList<HashMap<String, Object>> petsDB = new ArrayList<>();
    private final ArrayList<HashMap<String, Object>> packAnimalsDB = new ArrayList<>();
    public ArrayList<HashMap<String, Object>> getPetsDB() {
        return petsDB;
    }
    public ArrayList<HashMap<String, Object>> getPackAnimalsDB() {
        return packAnimalsDB;
    }
    public DataBase() {
    }

}

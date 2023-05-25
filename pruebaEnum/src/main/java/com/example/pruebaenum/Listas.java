package com.example.pruebaenum;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private final List<String> stringList;

    public Listas() {
        this.stringList = new ArrayList<>();
    }

    public List<String> getStringList() {
        return stringList;
    }


    public void añadirString(String string){
        stringList.add(string);
    }
}

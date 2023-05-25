package com.example.pruebaenum;

public enum ListasController {

    INSTANCE;

   private final Listas listas;

    ListasController(){
        listas=new Listas();
    }

    public Listas getListas() {
        return listas;
    }
}

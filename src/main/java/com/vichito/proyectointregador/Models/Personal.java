package com.vichito.proyectointregador.Models;

public class Personal {
    String nombre;
    String apellido;
    int ID;

public Personal(int ID,String nombre, String apellido){
this.nombre = nombre;
this.apellido = apellido;
this.ID = ID;
}

public Personal(String nombre, String apellido, int ID){
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

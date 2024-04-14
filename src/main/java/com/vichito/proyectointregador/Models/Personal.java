package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class Personal {
    private String nombre;
    private String apellido;
    private int ID;

    private ArrayList<Usuarios> listaUsuario;

    private ArrayList<Empleados> listaEmpleados;

    public Personal(){
        listaUsuario = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
    }

    public ArrayList<Usuarios> getListaUsuario(){ return listaUsuario;}

    public ArrayList<Empleados> getListaEmpleados() { return listaEmpleados;}


    public Personal(String nombre, String apellido, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public boolean addUsuarios(Usuarios usuarios){
        boolean status;
        status = listaUsuario.add(usuarios);
        return status;
    }


    public boolean addEmpleados(Empleados empleados){
        boolean status;
        status = listaEmpleados.add(empleados);
        return status;
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

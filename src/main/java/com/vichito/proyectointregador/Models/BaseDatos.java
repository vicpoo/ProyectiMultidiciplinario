package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class BaseDatos {

    private ArrayList<BaseDatos> listaDatos;
    public BaseDatos(){ listaDatos = new ArrayList<>();}

    public ArrayList<BaseDatos> getListaDatos(){ return listaDatos;}

    private String empleados;

    public BaseDatos(String empleados){ this.empleados = empleados;}
    public String getEmpleados(){ return  empleados;}

    public void setEmpleados(String empleados){ this.empleados = empleados;}

}

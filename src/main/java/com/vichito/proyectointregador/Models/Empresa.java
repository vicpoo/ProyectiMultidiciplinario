package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Usuarios> listaUsuario = new ArrayList<>();

    private ArrayList<Empleados> listaEmpleados = new ArrayList<>();

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
}

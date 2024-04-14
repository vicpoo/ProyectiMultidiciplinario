package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class Inventario {

    private Empleados empleados;
    private EquiposComputo equiposComputo;

    public Inventario(EquiposComputo equiposComputo, Empleados empleados){
        this.empleados = empleados;
        this.equiposComputo = equiposComputo;
    }

    public Inventario() {

    }

    public Empleados getEmpleados(){
     return empleados;
    }

    public EquiposComputo getEquiposComputo(){
      return equiposComputo;
    }


}

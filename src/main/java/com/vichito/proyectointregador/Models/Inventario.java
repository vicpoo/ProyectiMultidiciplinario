package com.vichito.proyectointregador.Models;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Inventario {


    private ArrayList<Inventario> listaInvetario;

    public Inventario() { listaInvetario = new ArrayList<>();
    }

    public ArrayList<Inventario> getListaInvetario() { return  listaInvetario;
    }




    private String empleados;
    private String equiposComputo;

    public Inventario(String equiposComputo, String empleados){
        this.empleados = empleados;
        this.equiposComputo = equiposComputo;
    }

    public String getEmpleados(){
     return empleados;
    }

    public String getEquiposComputo(){
      return equiposComputo;
    }

    public void setEmpleados(String empleados){
        this.empleados = empleados;
    }

    public void setEquiposComputo (String equiposComputo){
        this.equiposComputo = equiposComputo;
    }


}

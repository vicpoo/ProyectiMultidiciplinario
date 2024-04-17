package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class InventarioJefe {

    private ArrayList<InventarioJefe> listaInventarioJefe;
    public InventarioJefe() { listaInventarioJefe = new ArrayList<>();}
    public ArrayList<InventarioJefe> getListaInventarioJefe(){ return listaInventarioJefe;}

    private String empleados;
    private String equiposComputo;

    public InventarioJefe(String equiposComputo, String empleados){
        this.empleados = empleados;
        this.equiposComputo = equiposComputo;
    }

    public String getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String empleados) {
        this.empleados = empleados;
    }

    public String getEquiposComputo() {
        return equiposComputo;
    }

    public void setEquiposComputo(String equiposComputo) {
        this.equiposComputo = equiposComputo;
    }
}

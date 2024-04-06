package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class EquiposComputo {

    String marca;
    String modelo;
    int NumeroSerie;
    String TipoEquipo;


    public EquiposComputo(String marca, String modelo , int NumeroSerie , String TipoEquipo){

    }

    ArrayList<EquiposComputo> listaEquipo = new ArrayList<>();

    public EquiposComputo(String tipoEquipo, String modelo, String marca, int numeroSerie) {
    }

    public EquiposComputo() {

    }

    public boolean addEquiposComputo(EquiposComputo equiposComputo){
        boolean status;
        status = listaEquipo.add(equiposComputo);
        return status;
    }

}

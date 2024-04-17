package com.vichito.proyectointregador.Models;

import java.util.ArrayList;
import java.util.List;

public class EquiposComputo {

    String marca;
    String modelo;
    String NumeroSerie;
    String TipoEquipo;

    private ArrayList<EquiposComputo> listaEquipos;
    public EquiposComputo() { listaEquipos = new ArrayList<>();}

    public ArrayList<EquiposComputo> getlistaEquipos() { return listaEquipos;}

    public EquiposComputo(String tipoEquipo, String modelo, String marca, String numeroSerie) {
        this.TipoEquipo = tipoEquipo;
        this.modelo = modelo;
        this.marca = marca;
        this.NumeroSerie = numeroSerie;
    }



    public boolean addEquiposComputo(EquiposComputo equiposComputo) {
        boolean status;
        status = listaEquipos.add(equiposComputo);
        return status;
    }

    public EquiposComputo buscarPorNumeroSerie(int numeroSerie){
        for (EquiposComputo equipo : listaEquipos){
            if (equipo.getNumeroSerie().equals(numeroSerie)){
                return equipo;
            }
        }
        return null;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        NumeroSerie = numeroSerie;
    }

    public String getTipoEquipo() {
        return TipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        TipoEquipo = tipoEquipo;
    }

    public String toString() {
        return "Equipo de cómputo: Marca=" + marca + ", Modelo=" + modelo + ", Número de Serie=" + NumeroSerie + ", Tipo de Equipo=" + TipoEquipo;
    }
}

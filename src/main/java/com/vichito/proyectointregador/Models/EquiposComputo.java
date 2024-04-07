package com.vichito.proyectointregador.Models;

import java.util.ArrayList;
import java.util.List;

public class EquiposComputo {

    String marca;
    String modelo;
    int NumeroSerie;
    String TipoEquipo;


    public EquiposComputo(String marca, String modelo, int NumeroSerie, String TipoEquipo) {

    }

    ArrayList<EquiposComputo> listaEquipo = new ArrayList<>();

    public EquiposComputo(String tipoEquipo, String modelo, String marca, int numeroSerie) {
    }

    public EquiposComputo() {

    }

    public boolean addEquiposComputo(EquiposComputo equiposComputo) {
        boolean status;
        status = listaEquipo.add(equiposComputo);
        return status;
    }

    public EquiposComputo buscarPorNumeroSerie(int numeroSerie){
        for (EquiposComputo equipo : listaEquipo){
            if (equipo.getNumeroSerie() == numeroSerie){
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

    public int getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        NumeroSerie = numeroSerie;
    }

    public String getTipoEquipo() {
        return TipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        TipoEquipo = tipoEquipo;
    }

    public ArrayList<EquiposComputo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<EquiposComputo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public String toString() {
        return "Equipo de cómputo: Marca=" + marca + ", Modelo=" + modelo + ", Número de Serie=" + NumeroSerie + ", Tipo de Equipo=" + TipoEquipo;
    }
}

package com.vichito.proyectointregador.Models;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<DataBase> listaData;
    public DataBase(){ listaData = new ArrayList<>();}

    public ArrayList<DataBase> getListaData(){ return listaData;}



    private String usuarios;

    public DataBase(String usuarios){
        this.usuarios = usuarios;
    }

    public String getUsuarios(){
        return usuarios;
    }

    public void setUsuarios(String usuarios){
      this.usuarios = usuarios;
    }
}

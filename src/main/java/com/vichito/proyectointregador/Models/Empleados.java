package com.vichito.proyectointregador.Models;

public class Empleados extends Personal{
    String Direccion;
    String Area;
    String Email;

    public Empleados(String nombre, String apellido , int ID, String Direccion, String Area, String Email){
     super(nombre,apellido,ID);
     this.Direccion = Direccion;
     this.Area = Area;
     this.Email = Email;
    }
}

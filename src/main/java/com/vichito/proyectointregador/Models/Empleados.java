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

    public Empleados(int ID, String nombre, String apellido, String direccion, String area, String email) {
        super(ID, nombre, apellido);
        Direccion = direccion;
        Area = area;
        Email = email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

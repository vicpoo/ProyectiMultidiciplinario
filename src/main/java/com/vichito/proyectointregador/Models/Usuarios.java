package com.vichito.proyectointregador.Models;

public class Usuarios extends Personal{
    String Usuario;

    public Usuarios(String nombre,String apellido, int ID, String Usuario){
     super(nombre,apellido,ID);
     this.Usuario = Usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
}

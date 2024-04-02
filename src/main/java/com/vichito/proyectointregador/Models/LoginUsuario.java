package com.vichito.proyectointregador.Models;

public class LoginUsuario {
    private String user;
    private String password;
    private String userUsuario = "noble";
    private String passUsuario = "06";

    public boolean checkLoginUsuario(String user1, String password){
        return user1.equals(userUsuario) && password.equals(passUsuario);
    }
}

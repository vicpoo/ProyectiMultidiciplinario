package com.vichito.proyectointregador.Models;

public class Login {
    private String user;
    private String password;
    private String userjefe = "jefe";
    private String passJefe = "117";

    public boolean checkLogin(String user, String password){
        return user.equals(userjefe) && password.equals(passJefe);
    }
}

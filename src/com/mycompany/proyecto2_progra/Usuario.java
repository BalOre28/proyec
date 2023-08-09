/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_progra;

public class Usuario {
    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private String correo;
    private int puntos;
    

    public Usuario(String usuario, String contra, String nombre,int puntos) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.puntos=puntos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    


    
}

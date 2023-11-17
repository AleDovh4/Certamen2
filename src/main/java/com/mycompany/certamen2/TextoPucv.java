/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class TextoPucv extends Libro{
    
    private String escuela;

    public TextoPucv(String escuela, String titulo, String autor, String precio, String codigo) {
        super(titulo, autor, precio, codigo);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }


    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Pertenece a la escuela de :"+this.escuela);
        
    }
}

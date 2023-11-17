/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class LibroAcademico extends Libro{
    
    private String Tematica;

    public LibroAcademico(String Tematica, String titulo, String autor, String precio, String codigo) {
        super(titulo, autor, precio, codigo);
        this.Tematica = Tematica;
    }

    public String getTematica() {
        return Tematica;
    }

    public void setTematica(String Tematica) {
        this.Tematica = Tematica;
    }

    
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Su area abordada es: "+this.Tematica);
    }
    
    
    
}

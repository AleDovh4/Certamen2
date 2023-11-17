/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class Novela extends Libro{
    
    private String tipoNovela;

    public Novela(String tipoNovela, String titulo, String autor, String precio, String codigo) {
        super(titulo, autor, precio, codigo);
        this.tipoNovela = tipoNovela;
    }

    public String getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }
    
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Novela de : "+this.tipoNovela);
    }
    
}

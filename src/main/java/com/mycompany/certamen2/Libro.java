/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 * klasdkls
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String precio;
    private String codigo;
    private ArrayList<Libro> libros;

    public Libro(String titulo, String autor, String precio, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Libro() {
        this.libros = new ArrayList<Libro>();
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    public Libro busca_Libro(String codigo)
    {
        int a =2;
        for(int i = 0; i< this.libros.size(); i++)
        {
            if(codigo.equals(libros.get(i).getCodigo()))
            {
                return libros.get(i);
            }
        }
        return null;
    }
    
    public void mostrarDatos()
    {
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.precio);
    }
    
    public void insertarDatos()
    {
        libros.add(new TextoPucv("Informatica","Computadores", "Mercado", "20.000", "0"));
        libros.add(new Novela("Historica","Revolucion" ,"Judith","199.000","1"));
        libros.add(new LibroAcademico("Astronomia", "La Luna","Tomas","25.000","2"));
        libros.add(new TextoPucv("Industrial", "Industria","Pedro","10.000","3"));
        libros.add(new Novela("Romatica","El amor","Yo", "75.000","4"));
    }
    
}

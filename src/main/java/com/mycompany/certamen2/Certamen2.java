/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Certamen2 {

    public static void main(String[] args) {
        
        Libro libros = new Libro();
        libros.insertarDatos();
       
        Libro nuevo= libros.busca_Libro("2");
        nuevo.mostrarDatos();
    }
}

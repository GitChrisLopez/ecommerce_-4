/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 *
 * @author Adrián
 */
public class Carrito {
    
    int id;
    double total;
    List<LibroCarrito> libros;

    public Carrito(int id, double total, List<LibroCarrito> libros) {
        this.id = id;
        this.total = total;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<LibroCarrito> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroCarrito> libros) {
        this.libros = libros;
    }
}

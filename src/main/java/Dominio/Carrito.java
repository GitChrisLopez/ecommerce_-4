
package Dominio;

import java.util.List;

/**
 *
 * @author Adrián
 */
public class Carrito {
    
    private int id;
    private double total;
    private List<LibroCarrito> libros;

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

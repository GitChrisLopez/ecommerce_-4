package dominio;

import java.util.List;

/**
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 */
public class Carrito {

    private int id;
    private double total;
    private List<LibroCarrito> libros;

    /**
     * Contructor de la clase Carrito
     *
     * @param id el ID del carrito
     * @param total el Costo total de los productos
     * @param libros La lista de libros en el carrito
     */
    public Carrito(int id, double total, List<LibroCarrito> libros) {
        this.id = id;
        this.total = total;
        this.libros = libros;
    }

    /**
     * Obtiene el ID del objeto en el carrito
     *
     * @return el ID del objeto
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que obtiene el costo total de los objetos en el carrito
     *
     * @return el corto total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Metodo que declara el costo total del carrito
     *
     * @param total el costo total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo que obtiene la lista de libros dentro del carrito
     *
     * @return los libros en el carrito
     */
    public List<LibroCarrito> getLibros() {
        return libros;
    }

    /**
     * Metodo que declara los libros dentro del carrito
     *
     * @param libros la lista de libros
     */
    public void setLibros(List<LibroCarrito> libros) {
        this.libros = libros;
    }
}

package dominio;


/*
@author Oscar Adrián Castán López
 */
public class LibroCarrito {

    private Long id;
    private int cantidad;
    private double precioUnitario;

    
    /**
     * Constructor de la clase LibroCarrito
     * @param id el ID de la lista con los libros
     * @param cantidad la cantidad de un mismo libro
     * @param precioUnitario el precio de libro por unidad
     */
    public LibroCarrito(Long id, int cantidad, double precioUnitario) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Metodo que obtiene el ID del LibroCarrito
     * @return 
     */
    public Long getId() {
        return id;
    }
    
    /**
     * Método que consigue la cantidad de objetos.
     */

    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo que declara la cantidad de libros que hay
     * @param cantidad  la cantidad de libros a declarar
     */
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Método que obtiene el precio unitario del libro
     * @return 
     */
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    /**
     * Metodo que declara el precio unitario de el Libro
     * @param precioUnitario el precio a declarar
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}

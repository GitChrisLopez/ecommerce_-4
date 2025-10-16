
package dominio;


public class LibroCarrito {
    
    private Long id;
    private int cantidad;
    private double precioUnitario;

    public LibroCarrito(Long id, int cantidad, double precioUnitario) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}

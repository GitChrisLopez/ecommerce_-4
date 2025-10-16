
package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Libro {

    private Long id;
    private String titulo;
    private String isbn;
    private double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private Categoria categoria;
    private String editorial;
    private int noPaginas;
    private LocalDateTime fechaPublicacion;
    private List<Resenia> resenias;

    public Libro(Long id, String titulo, String isbn, double precio, String descripcion, int stock, String imagen, Categoria categoria, String editorial, 
            int noPaginas, LocalDateTime fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.imagen = imagen;
        this.categoria = categoria;
        this.editorial = editorial;
        this.noPaginas = noPaginas;
        this.fechaPublicacion = fechaPublicacion;
        this.resenias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(List<Resenia> resenia) {
        this.resenias = new ArrayList<>();
    }

}

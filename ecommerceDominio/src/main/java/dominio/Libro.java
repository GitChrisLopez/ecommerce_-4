package dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Representa un libro dentro del catalogo del sistema de comercio. Contiene
 * informacion basica del producto, su categoria y sus resenias.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 */

@Entity
// ANOTACIÓN JPA: (Opcional) Especifica el nombre de la tabla en la BD
@Table(name = "libros")
public class Libro {

    /**
     * Identificador unico del libro.
     */
    private Long id;

    /**
     * Titulo del libro.
     */
    private String titulo;

    /**
     * Codigo ISBN del libro.
     */
    private String isbn;

    /**
     * Precio de venta del libro.
     */
    private double precio;

    /**
     * Descripcion breve del contenido del libro.
     */
    private String descripcion;

    /**
     * Cantidad de ejemplares disponibles en inventario.
     */
    private int stock;

    /**
     * Nombre de archivo o URL de la imagen del libro.
     */
    private String imagen;

    /**
     * Categoria a la que pertenece el libro.
     */
    private Categoria categoria;

    /**
     * Editorial responsable de la publicacion.
     */
    private String editorial;

    /**
     * Numero total de paginas.
     */
    private int noPaginas;

    /**
     * Fecha de publicacion del libro.
     */
    private LocalDateTime fechaPublicacion;

    /**
     * Lista de resenias que los usuarios han dejado sobre el libro.
     */
    private List<Resenia> resenias;

    /**
     * Crea un nuevo libro con todos sus datos.
     *
     * @param id identificador unico del libro
     * @param titulo titulo del libro
     * @param isbn codigo ISBN del libro
     * @param precio precio de venta
     * @param descripcion descripcion breve
     * @param stock cantidad disponible en inventario
     * @param imagen nombre o ruta de la imagen
     * @param categoria categoria a la que pertenece el libro
     * @param editorial editorial responsable
     * @param noPaginas numero total de paginas
     * @param fechaPublicacion fecha de publicacion del libro
     */
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

    /**
     * @return identificador del libro.
     */
    public Long getId() {
        return id;
    }

    /**
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo nuevo titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return codigo ISBN del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn nuevo codigo ISBN
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return precio actual del libro
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio nuevo precio de venta
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return descripcion del libro
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion nueva descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return cantidad disponible en inventario
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock nuevo valor de stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return nombre o ruta de la imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen imagen asociada al libro
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return categoria del libro
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria nueva categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial nueva editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return Devuelve el numero de paginas.
     */
    public int getNoPaginas() {
        return noPaginas;
    }

    /**
     * @param noPaginas nuevo numero de paginas
     */
    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }

    /**
     * @return fecha de publicacion
     */
    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion nueva fecha de publicacion
     */
    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * @return lista de resenias del libro
     */
    public List<Resenia> getResenias() {
        return resenias;
    }

    /**
     * @param resenias lista de resenias a asignar
     */
    public void setResenias(List<Resenia> resenias) {
        this.resenias = resenias;
    }

}

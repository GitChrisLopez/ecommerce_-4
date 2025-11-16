package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name = "libros")
public class Libro {

    /**
     * Identificador único del libro.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_libro")
    private Long id;

    /**
     * Titulo del libro.
     */
    @Column (name = "titulo", length = 100, nullable = false)
    private String titulo;

    /**
     * Codigo ISBN del libro.
     */
    @Column (name = "isbn", length = 13, nullable = false)
    private String isbn;

    /**
     * Precio de venta del libro.
     */
    @Column (name = "precio", nullable = false)
    private double precio;

    /**
     * Descripcion breve del contenido del libro.
     */
    @Column (name = "sinopsis", length = 350, nullable = false) 
    private String sinopsis;

    /**
     * Cantidad de ejemplares disponibles en inventario.
     */
    @Column (name = "stock", nullable = false)
    private int stock;

    /**
     * Nombre de archivo o URL de la imagen del libro.
     */
    @Column (name = "imagen", length = 100, nullable = false) 
    private String imagen;

    /**
     * Categoria a la que pertenece el libro.
     */
    @Enumerated (EnumType.STRING)
    @Column (name = "categoria" , nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn (name = "id_autor", nullable = false) 
    private Autor autor;
    
    /**
     * Editorial responsable de la publicacion.
     */
    @ManyToOne
    @JoinColumn (name = "id_editorial", nullable = false) 
    private Editorial editorial;

    /**
     * Numero total de paginas.
     */
    @Column (name = "no_paginas", nullable = false)
    private int noPaginas;

    /**
     * Fecha de publicacion del libro.
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "fecha_publicacion", nullable = false)
    private LocalDate fechaPublicacion;

    /**
     * Lista de resenias que los usuarios han dejado sobre el libro.
     */
    @OneToMany(mappedBy = "libro")
    private List<Resenia> resenias;

    
    public Libro(){
        
    }
    
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
    public Libro(
            Long id, 
            String titulo, 
            String isbn, 
            double precio, 
            String descripcion, 
            int stock, 
            String imagen, 
            Categoria categoria, 
            Autor autor,
            Editorial editorial,
            int noPaginas, 
            LocalDate fechaPublicacion) {
        
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.stock = stock;
        this.imagen = imagen;
        this.categoria = categoria;
        this.autor = autor;
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
     * @return sinopsis del libro
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param descripcion nueva descripcion
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
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
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial nueva editorial
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /**
     * @return autor del libro
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor nuevo autor
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
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
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion nueva fecha de publicacion
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
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

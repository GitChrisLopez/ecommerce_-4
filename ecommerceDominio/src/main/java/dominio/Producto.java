package dominio;

import java.math.BigDecimal;
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

/**
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 16/11/2025
 */
@Entity
@Table(name = "productos")
public class Producto {
    
    /**
     * Objeto Long que representa el Id del Producto.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Long id;

    /**
     * Objeto Integer que representa el número de páginas del Producto.
     */
    @Column (name = "no_paginas")
    private Integer numeroPaginas;

    /**
     * Objeto String que representa el ISBN (International Standard Book Number) del Producto.
     */
    @Column (name = "isbn", length = 13, nullable = false, unique = true) // Agregué unique = true
    private String isbn;

    /**
     * Objeto String que representa la url de la imagen del Producto.
     */
    @Column (name = "urlImagen", nullable = false) 
    private String urlImagen;
    
    /**
     * Enumerador Formato que determina el formato del Producto.
     */
    @Column (name = "formato", nullable = false)
    @Enumerated(EnumType.STRING)
    private Formato formato;
    
    /**
     * Objeto Integer que representa el stock Producto actual.
     */
    @Column (name = "stock", nullable = false)
    private Integer stock = 0;
    
    /**
     * Objeto BigDecimal que representa el precio del Producto.
     */
    @Column(name = "precio", precision = 10, scale = 2) // Añadido name = "precio"
    private BigDecimal precio; 

    // --- CAMPO 'Libro' ELIMINADO ---
    // El campo 'private Libro libro;' se eliminó porque esta clase 'Producto'
    // YA ES el libro. Era redundante y causaba el error.

    // --- CAMPOS AGREGADOS (de la clase Libro.java) ---

    /**
     * El Autor de este Producto (Libro).
     */
    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    /**
     * La Categoria de este Producto (Libro).
     */
    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
    
    /**
     * La Editorial de este Producto (Libro).
     */
    @ManyToOne
    @JoinColumn(name = "id_editorial", nullable = false)
    private Editorial editorial;
    
    /**
     * Lista de Reseñas asociadas a este Producto (Libro).
     */
    @OneToMany(mappedBy = "producto") // Asumiendo que Resenia tiene un campo "producto"
    private List<Resenia> resenias;
    
    // --- FIN DE CAMPOS AGREGADOS ---


    /**
     * Objeto List<ProductoCarrito> que representa los productosCarrito que
     * hacen referencia a este Producto.
     */
    @OneToMany(mappedBy = "producto")
    private List<ProductoCarrito> productosCarrito;

    /**
     * Objeto List<ProductoPedido> que representa los productosPedido que hacen
     * referencia a este Producto.
     */
    @OneToMany(mappedBy = "producto")
    private List<ProductoPedido> productosPedido;

    /**
     * Constructor por defecto.
     */
    public Producto() {
    }
    
    // --- CONSTRUCTOR CORREGIDO ---
    // (Se eliminó 'Libro libro' y se añadieron los nuevos campos)
    public Producto(
            Long id,
            Integer numeroPaginas,
            String isbn,
            String urlImagen, 
            Formato formato, 
            BigDecimal precio, 
            Autor autor,
            Categoria categoria,
            Editorial editorial) {
        
        this.id = id;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.urlImagen = urlImagen;
        this.formato = formato;
        this.precio = precio;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
    }


    // --- GETTERS Y SETTERS ---
    // (Se eliminaron get/set de Libro y se añadieron los de los campos nuevos)
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(List<Resenia> resenias) {
        this.resenias = resenias;
    }

    public List<ProductoCarrito> getProductosCarrito() {
        return productosCarrito;
    }

    public void setProductosCarrito(List<ProductoCarrito> productosCarrito) {
        this.productosCarrito = productosCarrito;
    }

    public List<ProductoPedido> getProductosPedido() {
        return productosPedido;
    }

    public void setProductosPedido(List<ProductoPedido> productosPedido) {
        this.productosPedido = productosPedido;
    }
}
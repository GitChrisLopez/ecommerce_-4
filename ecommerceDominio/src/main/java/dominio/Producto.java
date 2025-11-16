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
 * Representa un producto dentro del catalogo del sistema de comercio.
 * @author Norma Alicia Beltrán Martín - 252102
 */

@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer id;

    @Column (name = "no_paginas")
    private Integer numeroPaginas;

    @Column (name = "isbn", length = 13, nullable = false)
    private String isbn;

    @Column (name = "urlImagen", nullable = false) 
    private String urlImagen;
    
    @Column (name = "formato", nullable = false)
    @Enumerated(EnumType.STRING)
    private Formato formato;
    
    @Column (name = "stock", nullable = false)
    private Integer stock = 0;
    
    @Column(precision = 10, scale = 2)
    private BigDecimal precio; 

    @ManyToOne
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro libro;

    @OneToMany(mappedBy = "producto")
    private List<ProductoCarrito> productosCarrito;

    @OneToMany(mappedBy = "producto")
    private List<ProductoPedido> productosPedido;

    /**
     * Constructor vacío.
     */
    public Producto() {
    }

    /**
     * Constructor que inicializa todos los atributos.
     * @param id id del producto
     * @param numeroPaginas número de páginas del producto
     * @param isbn isbn del producto
     * @param urlImagen url de la imagen del producto
     * @param formato formato del producto
     * @param precio precio del producto
     * @param libro libro del producto
     * @param itemsCarrito 
     * @param itemsPedido 
     */
    public Producto(Integer id, Integer numeroPaginas, String isbn, String urlImagen, Formato formato, BigDecimal precio, Libro libro, List<ProductoCarrito> itemsCarrito, List<ProductoPedido> itemsPedido) {
        this.id = id;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.urlImagen = urlImagen;
        this.formato = formato;
        this.precio = precio;
        this.libro = libro;
        this.productosCarrito = itemsCarrito;
        this.productosPedido = itemsPedido;
    }

    /**
     * Obtiene el identificador único del producto.
     * @return El id del producto.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único del producto.
     * @param id El nuevo id del producto.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el número total de páginas del producto.
     * @return El número de páginas del producto.
     */
    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Establece el número total de páginas del producto.
     * @param numeroPaginas El nuevo número de páginas del producto.
     */
    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Obtiene el ISBN (International Standard Book Number) del producto.
     * @return El ISBN del producto.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN (International Standard Book Number) del producto.
     * @param isbn El nuevo ISBN del producto.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene la URL donde se encuentra la imagen del producto.
     * @return La url de la imagen del producto.
     */
    public String getUrlImagen() {
        return urlImagen;
    }

    /**
     * Establece la URL donde se encuentra la imagen del producto.
     * @param urlImagen La nueva url de la imagen del producto.
     */
    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    /**
     * Obtiene el formato del producto.
     * @return El formato del producto.
     */
    public Formato getFormato() {
        return formato;
    }

    /**
     * Establece el formato del producto.
     * @param formato El nuevo formato del producto.
     */
    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    /**
     * Obtiene la cantidad de unidades disponibles en inventario.
     * @return El stock disponible del producto.
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Establece la cantidad de unidades disponibles en inventario.
     * @param stock El nuevo stock del producto.
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Obtiene el precio de venta del producto.
     * @return El precio del producto.
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de venta del producto.
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el objeto Libro asociado a este producto.
     * @return El libro del producto.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece el objeto Libro asociado a este producto.
     * @param libro El nuevo libro del producto.
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la lista de ProductoCarrito que hacen referencia a este producto.
     * @return La lista de items del carrito asociados al producto.
     */
    public List<ProductoCarrito> getProductosCarrito() {
        return productosCarrito;
    }

    /**
     * Establece la lista de ProductoCarrito que hacen referencia a este producto.
     * @param productosCarrito La nueva lista de items del carrito.
     */
    public void setProductosCarrito(List<ProductoCarrito> productosCarrito) {
        this.productosCarrito = productosCarrito;
    }

    /**
     * Obtiene la lista de ProductoPedido que hacen referencia a este producto.
     * @return La lista de items de pedido asociados al producto.
     */
    public List<ProductoPedido> getProductosPedido() {
        return productosPedido;
    }

    /**
     * Establece la lista de ProductoPedido que hacen referencia a este producto.
     * @param productosPedido La nueva lista de items de pedido.
     */
    public void setProductosPedido(List<ProductoPedido> productosPedido) {
        this.productosPedido = productosPedido;
    }
    
}

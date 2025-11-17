package entidades;

import dominio.Formato;
import java.io.Serializable;
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
 * @author chris
 */
@Entity
@Table(name = "productos")
public class ProductoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "no_paginas")
    private Integer numeroPaginas;

    @Column(name = "isbn", length = 13, nullable = false, unique = true)
    private String isbn;

    @Column(name = "urlImagen", nullable = false)
    private String urlImagen;

    @Column(name = "formato", nullable = false)
    @Enumerated(EnumType.STRING)
    private Formato formato;

    @Column(name = "precio", precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private AutorEntidad autor;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private CategoriaEntidad categoria;

    @ManyToOne
    @JoinColumn(name = "id_editorial", nullable = false)
    private EditorialEntidad editorial;

    @OneToMany(mappedBy = "producto")
    private List<ReseniaEntidad> resenias;

    @OneToMany(mappedBy = "producto")
    private List<ProductoCarritoEntidad> productosCarrito;

    @OneToMany(mappedBy = "producto")
    private List<ProductoPedidoEntidad> productosPedido;

    public ProductoEntidad() {
    }

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public AutorEntidad getAutor() {
        return autor;
    }

    public void setAutor(AutorEntidad autor) {
        this.autor = autor;
    }

    public CategoriaEntidad getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntidad categoria) {
        this.categoria = categoria;
    }

    public EditorialEntidad getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialEntidad editorial) {
        this.editorial = editorial;
    }

    public List<ReseniaEntidad> getResenias() {
        return resenias;
    }

    public void setResenias(List<ReseniaEntidad> resenias) {
        this.resenias = resenias;
    }

    public List<ProductoCarritoEntidad> getProductosCarrito() {
        return productosCarrito;
    }

    public void setProductosCarrito(List<ProductoCarritoEntidad> productosCarrito) {
        this.productosCarrito = productosCarrito;
    }

    public List<ProductoPedidoEntidad> getProductosPedido() {
        return productosPedido;
    }

    public void setProductosPedido(List<ProductoPedidoEntidad> productosPedido) {
        this.productosPedido = productosPedido;
    }
}

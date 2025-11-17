/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import dominio.Formato;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author chris
 */
@Entity
@Table(name = "libros")
@DiscriminatorValue("LIBRO")
public class LibroEntidad extends ProductoEntidad implements Serializable {

    @Column(name = "isbn", length = 13, nullable = false, unique = true)
    private String isbn;

    @Column(name = "paginas", nullable = false)
    private int paginas;

    @Enumerated(EnumType.STRING)
    @Column(name = "formato", nullable = false)
    private Formato formato;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private AutorEntidad autor;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private CategoriaEntidad categoria;

    @ManyToOne
    @JoinColumn(name = "id_editorial", nullable = false)
    private EditorialEntidad editorial;

    @OneToMany(mappedBy = "libro")
    private List<ReseniaEntidad> resenias;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private List<ProductoPedidoEntidad> productosPedido;

    public LibroEntidad() {
        super();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
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

    public List<ProductoPedidoEntidad> getProductosPedido() {
        return productosPedido;
    }

    public void setProductosPedido(List<ProductoPedidoEntidad> productosPedido) {
        this.productosPedido = productosPedido;
    }
}

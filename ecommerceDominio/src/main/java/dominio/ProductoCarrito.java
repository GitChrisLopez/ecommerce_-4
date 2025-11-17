package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Representa los productos que contiene un carrito de compra.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 */
@Entity
@Table(name = "productos_carrito")
public class ProductoCarrito implements Serializable {

    /**
     * Dato Long que representa el id del ProductoCarrito.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_carrito")
    private Long id;

    /**
     * Objeto Producto que representa el producto de ProductoCarrito.
     */
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    /**
     * Objeto Carrito que representa el carrito en el que esta ProductoCarrito.
     */
    @ManyToOne
    @JoinColumn(name = "id_carrito", nullable = false)
    private Carrito carrito;

    /**
     * Cantidad de ProductoCarrito.
     */
    @Column(name = "cantidad")
    private Integer cantidad = 1;

    /**
     * Precio unitario de ProductoCarrito.
     */
    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    /**
     * Constructor vacío.
     */
    public ProductoCarrito() {
    }

    /**
     * Constructor que inicializa todos los atributos.
     *
     * @param id id del productoCarrito
     * @param producto id del producto
     * @param carrito id del carrito
     * @param precioUnitario precio unitario del productoCarrito
     */
    public ProductoCarrito(Long id, Producto producto, Carrito carrito, BigDecimal precioUnitario) {
        this.id = id;
        this.producto = producto;
        this.carrito = carrito;
        this.precioUnitario = precioUnitario;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
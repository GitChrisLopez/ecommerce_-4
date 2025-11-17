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
 * Representa los productos que contiene un pedido.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 */
@Entity
@Table(name = "productos_pedido")
public class ProductoPedido implements Serializable {

    /**
     * Dato Long que representa el id del ProductoCarrito.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_pedido")
    private Long id;

    /**
     * Objeto Producto que representa el producto de ProductoPedido.
     */
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    /**
     * Objeto Pedido que representa el pedido en el que esta ProductoPedido.
     */
    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    /**
     * Cantidad de ProductoPedido.
     */
    @Column(name = "cantidad")
    private Integer cantidad;

    /**
     * Precio unitario de ProductoPedido.
     */
    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    /**
     * Constructor vacío.
     */
    public ProductoPedido() {
    }

    /**
     * Constructor que inicializa todos los atributos.
     *
     * @param id id del productoPedido
     * @param producto id del producto
     * @param pedido id del pedido
     * @param cantidad cantidad del productoPedido
     * @param precioUnitario precio unitario del productoPedido
     */
    public ProductoPedido(Long id, Producto producto, Pedido pedido, Integer cantidad, BigDecimal precioUnitario) {
        this.id = id;
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
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

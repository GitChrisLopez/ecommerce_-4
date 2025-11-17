/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

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

@Entity
@Table(name = "productos_pedido")
public class ProductoPedidoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_pedido")
    private Long id;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private PedidoEntidad pedido;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private ProductoEntidad producto;

    public ProductoPedidoEntidad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public PedidoEntidad getPedido() {
        return pedido;
    }

    public void setPedido(PedidoEntidad pedido) {
        this.pedido = pedido;
    }

    public ProductoEntidad getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntidad producto) {
        this.producto = producto;
    }
}

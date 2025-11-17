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

/**
 *
 * @author chris
 */
@Entity
@Table(name = "productos_carrito")
public class ProductoCarritoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_carrito")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private ProductoEntidad producto; // Referencia a la entidad corregida

    @ManyToOne
    @JoinColumn(name = "id_carrito", nullable = false)
    private CarritoEntidad carrito; // Debe existir CarritoEntidad.java

    @Column(name = "cantidad")
    private Integer cantidad = 1;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    public ProductoCarritoEntidad() {
    }

    // --- Getters y Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductoEntidad getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntidad producto) {
        this.producto = producto;
    }

    public CarritoEntidad getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoEntidad carrito) {
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

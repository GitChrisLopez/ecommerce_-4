/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entidad que representa el carrito de un cliente. Es un espejo de
 * dominio.Carrito
 *
 * @author chris
 */
@Entity
@Table(name = "carritos")
public class CarritoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteEntidad cliente;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductoCarritoEntidad> productosCarrito;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    /**
     * Constructor por defecto.
     */
    public CarritoEntidad() {
    }

    /**
     * Constructor que inicializa id, cliente y total.
     *
     * @param id
     * @param cliente
     * @param total
     */
    public CarritoEntidad(Long id, ClienteEntidad cliente, BigDecimal total) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

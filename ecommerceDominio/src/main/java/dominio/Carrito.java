package dominio;

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
 * Representa el carrito de compra del cliente.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 */

@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Integer id;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total = BigDecimal.ZERO;

    @OneToOne
    @JoinColumn(name = "id_cliente", unique = true, nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
    private List<ProductoCarrito> productosCarrito;

    /**
     * Constructor vacío.
     */
    public Carrito() {

    }

    /**
     * Constructor que inicializa todos los atributos.
     *
     * @param id id del carrito
     * @param cliente cliente del carrito
     * @param productosCarrito lista de productosCarrito del carrito
     */
    public Carrito(Integer id, Cliente cliente, List<ProductoCarrito> productosCarrito) {
        this.id = id;
        this.cliente = cliente;
        this.productosCarrito = productosCarrito;
    }

    /**
     * Obtiene el identificador único del carrito.
     *
     * @return El id del carrito.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único del carrito.
     *
     * @param id El nuevo id del carrito.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el valor total de los productos contenidos en el carrito.
     *
     * @return El total del carrito.
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Establece el valor total del carrito.
     *
     * @param total El nuevo total del carrito.
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * Obtiene la entidad Cliente asociada a este carrito.
     *
     * @return El cliente dueño del carrito.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece la entidad Cliente asociada a este carrito.
     *
     * @param cliente El nuevo cliente dueño del carrito.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la lista de ProductoCarrito que representan los productos en el
     * carrito.
     *
     * @return La lista de productos en el carrito.
     */
    public List<ProductoCarrito> getProductosCarrito() {
        return productosCarrito;
    }

    /**
     * Establece la lista de ProductoCarrito que representan los productos en el
     * carrito.
     *
     * @param productosCarrito La nueva lista de productos en el carrito.
     */
    public void setProductosCarrito(List<ProductoCarrito> productosCarrito) {
        this.productosCarrito = productosCarrito;
    }

}

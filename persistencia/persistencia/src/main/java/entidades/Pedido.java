
package entidades;

import enumeradores.Estado;
import java.time.LocalDateTime;
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
 * Archivo: Pedido.java 
 * 
 * Clase que representa un pedido realizado por un Cliente al
 * finalizar una compra y realizar su pago.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Entity
@Table(name = "pedidos")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * Dato Long que representa el id del Pedido.
     */
    @Column(name = "id_pedido")
    private Long id;
    /**
     * Objeto String que representa el número del Pedido.
     */
    @Column(name = "numeroUnico_pedido")
    private String numeroUnico;
    /**
     * Objeto LocalDateTime que representa la fecha en que se realizó el pedido.
     */
    @Column(name = "fecha_pedido")
    private LocalDateTime fecha;
    /**
     * Objeto
     */
    @Column(name = "estado_pedido")
    private Estado estado;
    /**
     * Objeto Direccion que representa la dirección de envío del pedido.
     */
    @ManyToOne
    @JoinColumn(name="id_direccion")
    private Direccion direccionEnvio;
    /**
     * Objeto MetodoPago que representa el método de pago que se utilizó para
     * pagar el Pedido.
     */
    @ManyToOne
    @JoinColumn(name="id_metodoPago")
    private MetodoPago metodoPago;


    /**
     * Objeto Cliente que representa el Cliente que realizó el Pedido.
     */

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)    
    private Cliente cliente;

    public Pedido() {

    }

    /**
     * Constructor para inicializar una instancia del Pedido.
     *
     * @param id Dato Long que representa el id del Pedido.
     * @param numeroUnico Objeto String que representa el número del Pedido.
     * @param fecha Objeto LocalDateTime que representa la fecha de realización
     * del Pedido.
     * @param direccionEnvio Objeto Direccion que representa la dirección de
     * envío del Pedido.
     * @param metodoPago Objeto MetodoPago que representa el método de pago con
     * el que se pagó el Pedido.
     * @param carrito Objeto Carrito que representa el carrito a partir del cual
     * se creó el Pedido.
     * @param cliente Objeto Cliente que representa el Cliente que realizó el
     * Pedido.
     */
    public Pedido(
            Long id, 
            String numeroUnico, 
            LocalDateTime fecha,
            Direccion direccionEnvio,
            MetodoPago metodoPago,
            Carrito carrito, 
            Cliente cliente) {
        
        this.id = id;
        this.numeroUnico = numeroUnico;
        this.fecha = fecha;
        this.direccionEnvio = direccionEnvio;
        this.metodoPago = metodoPago;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
    }

    /**
     * @return identificador del pedido.
     */
    public Long getId() {
        return id;
    }

    /**
     * Permite obtener el número de este Pedido.
     *
     * @return Objeto String que representa el número del Pedido.
     */
    public String getNumeroUnico() {
        return numeroUnico;
    }

    /**
     * Permite establecer el número de este Pedido.
     *
     * @param numeroUnico Objeto String que representa el número del Pedido.
     */
    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    /**
     * Permite obtener la fecha de realización del Pedido.
     *
     * @return Objeto LocalDateTime que representa la fecha en que se hizo el
     * Pedido.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Permite establecer la fecha de realización del Pedido.
     *
     * @param fecha bjeto LocalDateTime que representa la fecha en que se hizo
     * el Pedido.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Permite obtener el estado del Pedido.
     *
     * @return Objeto Estado que representa el Estado del Pedido.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Permite establecer el estado del Pedido.
     *
     * @param estado Objeto Estado que representa el Estado del Pedido.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Permite obtener la dirección de envío del Pedido.
     *
     * @return Objeto Direccion que representa la dirección de envío del Pedido.
     */
    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Permite establecer la dirección de envío del Pedido.
     *
     * @param direccionEnvio Objeto Direccion que representa la dirección de
     * envío del Pedido.
     */
    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    /**
     * Permite obtener el método de pago del Pedido.
     *
     * @return Objeto MetodoPago que representa el método de pago con el que se
     * realizó el pedido.
     */
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    /**
     * Permite establecer el método de pago del Pedido.
     *
     * @param tipoPago Objeto MetodoPago que representa el método de pago con el
     * que se realiza el pedido.
     */
    public void setTipoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    /**
     * Permite obtener el Cliente que realizó el Pedido.
     *
     * @return Objeto Cliente que realizó el Pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Permite establecer el Cliente que realizó el Pedido.
     *
     * @param cliente Objeto Cliente que realizó el Pedido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
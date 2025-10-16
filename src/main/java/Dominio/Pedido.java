
package Dominio;

import java.time.LocalDateTime;

/**
 *
 * Pedido.java
 * Clase que representa un pedido realizado por un Cliente
 * al finalizar una compra y realizar su pago.
 * 
 * @author Norma Alicia Beltrán Martín - 252102
 * @author 
 * @author 
 * @author Manuel Romo López - 253080
 * 
 * Fecha: 15/10/2025
 */
public class Pedido {
    /**
     * Dato Long que representa el id del Pedido.
     */
    private Long id;
    /**
     * Objeto String que representa el número del Pedido.
     */
    private String numeroUnico;
    /**
     * Objeto LocalDateTime que representa la fecha en que se realizó el pedido.
     */
    private LocalDateTime fecha;
    /**
     * Objeto 
     */
    private Estado estado;
    /**
     * Objeto Direccion que representa la dirección de envío del pedido.
     */
    private Direccion direccionEnvio;
    /**
     * Objeto MetodoPago que representa el método de pago que se utilizó
 para pagar el Pedido.
     */
    private MetodoPago metodoPago;
    /**
     * Objeto Carrito que representa el Carrito a partir del cual
     * se realizó el Pedido.
     */
    private Carrito carrito;
    
    /**
     * Objeto Cliente que representa el Cliente que realizó el Pedido.
     */
    private Cliente cliente;

    /**
     * Permite obtener el número de este Pedido.
     * @return Objeto String que representa el número del Pedido.
     */
    public String getNumeroUnico() {
        return numeroUnico;
    }

    /**
     * Permite establecer el número de este Pedido.
     * @param numeroUnico Objeto String que representa el número del Pedido.
     */
    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    /**
     * Permite obtener la fecha de realización del Pedido.
     * @return Objeto LocalDateTime que representa la fecha en que se hizo el Pedido.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Permite establecer la fecha de realización del Pedido.
     * @param fecha bjeto LocalDateTime que representa la fecha en que se hizo el Pedido.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Permite obtener el estado del Pedido.
     * @return Objeto Estado que representa el Estado del Pedido.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Permite establecer el estado del Pedido.
     * @param estado Objeto Estado que representa el Estado del Pedido.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Permite obtener la dirección de envío del Pedido.
     * @return Objeto Direccion que representa la dirección de envío del Pedido.
     */
    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Permite establecer la dirección de envío del Pedido.
     * @param direccionEnvio  Objeto Direccion que representa la dirección de envío del Pedido.
     */
    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    /**
     * Permite obtener el método de pago del Pedido.
     * @return Objeto MetodoPago que representa el método de pago con el que se realizó el pedido.
     */
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    /**
     * Permite establecer el método de pago del Pedido.
     * @param tipoPago Objeto MetodoPago que representa el método de pago con el que se realiza el pedido.
     */
    public void setTipoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    /**
     * Permite obtener el Carrito a partir del cual se creó el Pedido.
     * @return Objeto Carrito que representa el Carrito a partir del cual se creó el Pedido.
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * Permite establecer el Carrito a partir del cual se crea el Pedido.
     * @param carrito Objeto Carrito que representa el Carrito a partir del cual se crea el Pedido.
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    /**
     * Permite obtener el Cliente que realizó el Pedido.
     * @return Objeto Cliente que realizó el Pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Permite establecer el Cliente que realizó el Pedido.
     * @param cliente Objeto Cliente que realizó el Pedido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
}

package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Cliente.java Clase que representa a un cliente del sistema. Extiende de
 * Usuario y contiene información específica como su teléfono, direcciones de
 * envío, el carrito de compras actual y el historial de pedidos.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
public class Cliente extends Usuario {

    /**
     * Objeto String que representa el número de teléfono del Cliente.
     */
    private String telefono;

    /**
     * Objeto List de Direccion que representa el conjunto de direcciones
     * asociadas a este Cliente.
     */
    private List<Direccion> direcciones;

    /**
     * Objeto Carrito que representa el carrito de compras actual del Cliente.
     */
    private Carrito carrito;

    /**
     * Objeto List de Pedido que representa el historial de pedidos realizados
     * por este Cliente.
     */
    private List<Pedido> pedidos;

    /**
     * Constructor para inicializar una instancia de Cliente. Llama al
     * constructor de la superclase (Usuario) para establecer los datos básicos.
     *
     * @param id Dato int que representa el id del Cliente.
     * @param nombre Objeto String que representa el nombre del Cliente.
     * @param correo Objeto String que representa el correo electrónico del
     * Cliente.
     * @param contrasena Objeto String que representa la contraseña del Cliente.
     * @param telefono Objeto String que representa el número de teléfono del
     * Cliente.
     */
    public Cliente(Long id, String nombre, String correo, String contrasena, String telefono) {
        super(id, nombre, correo, contrasena);
        this.direcciones = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    /**
     * Permite obtener el número de teléfono del Cliente.
     *
     * @return Objeto String que representa el número de teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Permite establecer el número de teléfono del Cliente.
     *
     * @param telefono Objeto String que representa el número de teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Permite obtener la lista de direcciones del Cliente.
     *
     * @return Objeto List<Direccion> que representa las direcciones del
     * Cliente.
     */
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Permite establecer la lista de direcciones del Cliente.
     *
     * @param direcciones Objeto List<Direccion> que representa las direcciones
     * del Cliente.
     */
    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * Permite obtener el carrito de compras actual del Cliente.
     *
     * @return Objeto Carrito que representa el carrito de compras.
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * Permite establecer el carrito de compras actual del Cliente.
     *
     * @param carrito Objeto Carrito que representa el carrito de compras.
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    /**
     * Permite obtener el historial de pedidos del Cliente.
     *
     * @return Objeto List<Pedido> que representa el historial de pedidos.
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Permite establecer el historial de pedidos del Cliente.
     *
     * @param pedidos Objeto List<Pedido> que representa el historial de
     * pedidos.
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}

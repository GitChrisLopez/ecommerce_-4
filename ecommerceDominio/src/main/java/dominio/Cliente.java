package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType; // Añadido
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 *
 * Clase que representa a un cliente del sistema. Contiene información específica
 * como su teléfono, direcciones de envío, el carrito de compras actual y el
 * historial de pedidos.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Usuario {

    /**
     * Objeto String que representa el número de teléfono del Cliente.
     */
    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    /**
     * Objeto Srtring que representa la dirección de la imagen de perfil del
     * Cliente.
     */
    @Column(name = "url_imagen_perfil", length = 100, nullable = true)
    private String urlImagenPerfil;

    /**
     * Lista de objetos Direccion que representa el conjunto de direcciones
     * asociadas a este Cliente.
     */
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL) // Añadido cascade
    private List<Direccion> direcciones;

    /**
     * Objeto Carrito que representa el carrito de compras actual del Cliente.
     */
    // --- CORRECCIÓN ---
    // Se usa 'mappedBy' para indicar que la entidad Carrito maneja esta relación
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Carrito carrito;

    /**
     * Lista de objetos Pedido que representa el historial de pedidos realizados
     * por este Cliente.
     */
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL) // Añadido cascade
    private List<Pedido> pedidos;

    /**
     * Lista de reseñas (reviews) escritas por este Cliente.
     */
    @OneToMany(mappedBy = "cliente") // Añadido para completar la relación con Resenia
    private List<Resenia> resenias;

    /**
     * Dato boolean que indica si el usuario esta activo o no.
     */
    @Column(name = "activo", nullable = false)
    private boolean activo;

    /**
     * Constructor por defecto.
     */
    public Cliente() {

    }

    public Cliente(
            String telefono,
            String imagenPerfil,
            List<Direccion> direcciones,
            Carrito carrito,
            List<Pedido> pedidos,
            boolean activo) {

        this.telefono = telefono;
        this.direcciones = direcciones;
        this.carrito = carrito;
        this.pedidos = pedidos;
        this.activo = activo;
    }

    public String getUrlImagenPerfil() {
        return urlImagenPerfil;
    }

    public void setUrlImagenPerfil(String imagenPerfil) {
        this.urlImagenPerfil = imagenPerfil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(List<Resenia> resenias) {
        this.resenias = resenias;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

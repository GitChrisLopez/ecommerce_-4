package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase que representa una dirección asociada con un Cliente o a un Pedido.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable {

    /**
     * Dato Long que representa el id de la Dirección.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Long id;

    /**
     * Objeto String que representa el código postal de la dirección.
     */
    @Column(name = "codigo_postal", length = 5, nullable = false)
    private String codigoPostal;

    /**
     * Objeto String que representa la colonia de la dirección.
     */
    @Column(name = "colonia", length = 50, nullable = false)
    private String colonia;

    /**
     * Objeto String que representa la calle de la dirección.
     */
    @Column(name = "calle", length = 50, nullable = false)
    private String calle;

    /**
     * Objeto String que representa el número exterior de la dirección.
     */
    @Column(name = "numero", length = 5, nullable = false)
    private String numero;

    /**
     * Objeto Cliente que representa el Cliente al que pertenece esta Dirección.
     */
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
    
    /**
     * Pedidos enviados a esta dirección
     */
    @OneToMany(mappedBy = "direccionEnvio")
    private List<Pedido> pedidos;

    /**
     * Constructor por defecto
     */
    public Direccion() {

    }

    /**
     * Constructor para inicializar una instancia de Direccion.
     *
     * @param id Dato Long que representa el id de la Dirección.
     * @param codigoPostal Objeto String que representa el código postal.
     * @param colonia Objeto String que representa la colonia.
     * @param calle Objeto String que representa la calle.
     * @param numero Objeto String que representa el número de la dirección.
     * @param cliente Objeto Cliente que representa el Cliente asociado.
     */
    public Direccion(
            Long id,
            String codigoPostal,
            String colonia,
            String calle,
            String numero,
            Cliente cliente) {

        this.id = id;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
        this.cliente = cliente;
    }

    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
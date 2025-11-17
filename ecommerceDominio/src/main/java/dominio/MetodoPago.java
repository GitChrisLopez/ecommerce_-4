package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase base abstracta para todos los métodos de pago. Utiliza una estrategia
 * de herencia JOINED.
 */
@Entity
@Table(name = "metodos_pago")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MetodoPago implements Serializable {

    /**
     * Llave primaria para TODOS los métodos de pago. ESTE ES EL @Id QUE
     * FALTABA.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_pago")
    private Long id;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate fecha;

    /**
     * Relación inversa con Pedido.
     */
    @OneToMany(mappedBy = "metodoPago")
    private List<Pedido> pedidos;

    public MetodoPago() {
    }

    public MetodoPago(LocalDate fecha) {
        this.fecha = fecha;
    }

    // --- Getters y Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

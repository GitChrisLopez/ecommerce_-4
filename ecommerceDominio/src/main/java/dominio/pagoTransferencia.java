package dominio;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Representa un tipo de método de pago (Transferencia).
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Entity
@Table(name = "pago_transferencia")
@PrimaryKeyJoinColumn(name = "id_metodo_pago")
public class PagoTransferencia extends MetodoPago {

    /**
     * Objeto String que representa el nombre del banco desde donde se emite la
     * transferencia.
     */
    @Column(name = "banco_emisor")
    public String bancoEmisor;

    /**
     * Objeto String que representa los últimos cuatro dígitos de la cuenta de
     * origen.
     */
    @Column(name = "cuatro_digitos")
    public String cuatroDigitos;

    /**
     * Constructor vacío.
     */
    public PagoTransferencia() {
        super();
    }

    /**
     * Constructor que inicializa los atributos propios de la transferencia.
     *
     * @param bancoEmisor Nombre del banco emisor.
     * @param cuatroDigitos Últimos cuatro dígitos de la cuenta.
     */
    public PagoTransferencia(String bancoEmisor, String cuatroDigitos) {
        this.bancoEmisor = bancoEmisor;
        this.cuatroDigitos = cuatroDigitos;
    }

    /**
     * Constructor que inicializa los atributos propios y hereda la fecha de la
     * superclase MetodoPago.
     *
     * @param bancoEmisor Nombre del banco emisor.
     * @param cuatroDigitos Últimos cuatro dígitos de la cuenta.
     * @param fecha Fecha de realización del pago.
     */
    public PagoTransferencia(String bancoEmisor, String cuatroDigitos, LocalDate fecha) {
        super(fecha);
        this.bancoEmisor = bancoEmisor;
        this.cuatroDigitos = cuatroDigitos;
    }
    
    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public String getCuatroDigitos() {
        return cuatroDigitos;
    }

    public void setCuatroDigitos(String cuatroDigitos) {
        this.cuatroDigitos = cuatroDigitos;
    }

}
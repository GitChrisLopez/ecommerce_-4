package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Representa un tipo de método de pago (Pago con Tarjeta).
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Entity
@Table(name = "pago_tarjeta")
@PrimaryKeyJoinColumn(name = "id_metodo_pago")
public class PagoTarjeta extends MetodoPago {

    /**
     * Objeto Integer que representa el número (o una parte de él) de la tarjeta.
     */
    @Column(name = "numero")
    Integer numero;

    /**
     * Objeto LocalDate que representa la fecha de vencimiento de la tarjeta
     * (MM/AA).
     */
    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    /**
     * Objeto String que representa el nombre completo del titular de la tarjeta.
     */
    @Column(name = "nombre_titular")
    private String nombreTitular;

    /**
     * Objeto String que representa el código de seguridad de la tarjeta.
     */
    @Column(name = "cvv")
    private String cvv;

    /**
     * Constructor vacío.
     */
    public PagoTarjeta() {
        super();
    }

    /**
     * Constructor que inicializa los atributos propios de la tarjeta.
     *
     * @param numero Número de la tarjeta (o últimos dígitos).
     * @param fechaVencimiento Fecha de vencimiento.
     * @param nombreTitular Nombre del titular de la tarjeta.
     * @param cvv Código de seguridad de la tarjeta.
     */
    public PagoTarjeta(Integer numero, LocalDate fechaVencimiento, String nombreTitular, String cvv) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

    /**
     * Constructor que inicializa los atributos propios de la tarjeta e
     * inicializa la fecha de la superclase.
     *
     * @param numero Número de la tarjeta (o últimos dígitos).
     * @param fechaVencimiento Fecha de vencimiento.
     * @param nombreTitular Nombre del titular de la tarjeta.
     * @param cvv Código de seguridad de la tarjeta.
     * @param MontoPagar Monto total a pagar (heredado, aunque se recomienda
     * mover a Pedido).
     * @param fecha Fecha de realización del pago (heredado).
     */
    public PagoTarjeta(Integer numero, LocalDate fechaVencimiento, String nombreTitular, String cvv,
            BigDecimal MontoPagar, LocalDate fecha) {
        super(fecha);
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
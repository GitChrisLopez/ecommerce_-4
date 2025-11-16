/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Table(name = "pago_tarjeta")
public class PagoTarjeta extends MetodoPago implements Serializable {

    @Column(name = "numero")
    int numero;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @Column(name = "nombre_titular")
    private String nombreTitular;

    @Column(name = "cvv")
    private String cvv;

    public PagoTarjeta() {
    }

    public PagoTarjeta(int numero, Date fechaVencimiento, String nombreTitular, String cvv) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

    public PagoTarjeta(int numero, Date fechaVencimiento, String nombreTitular, String cvv,
            BigDecimal MontoPagar, java.util.Date fecha) {
        super(MontoPagar, fecha);
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

}

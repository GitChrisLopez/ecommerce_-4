/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adrián
 */
@Entity
@Table(name = "pagoTarjeta")
public class pagoTarjeta extends MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagoTarjeta")
    long id;
    int numero;
    private Date fechaVencimiento;
    private String nombreTitular;
    private String cvv;

    public pagoTarjeta() {
    }

    public pagoTarjeta(int numero, Date fechaVencimiento, String nombreTitular, String cvv) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

    public pagoTarjeta(int numero, Date fechaVencimiento, String nombreTitular, String cvv, BigDecimal MontoPagar, java.util.Date fecha) {
        super(MontoPagar, fecha);
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Representa un tipo de método de pago (Pago Contra Entrega).
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */

@Entity
@Table(name = "pago_contraentrega")
public class PagoContraEntrega extends MetodoPago {

    /**
     * Constructor vacío.
     */
    public PagoContraEntrega() {
        super();
    }

    /**
     * Constructor que inicializa al padre.
     *
     * @param fecha fecha de realización del pago.
     */
    public PagoContraEntrega(LocalDate fecha) {
        super(fecha);
    }
}

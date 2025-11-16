/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
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
@Entity
@Table(name = "pago_contraentrega")
public class PagoContraentrega extends MetodoPago implements Serializable {

    public PagoContraentrega() {
        super();
    }

    /**
     * Constructor que inicializa al padre.
     * @param MontoPagar
     * @param fecha
     */
    public PagoContraentrega(BigDecimal MontoPagar, Date fecha) {
        super(MontoPagar, fecha);
    }
}
package dominio.enumeradores;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * MetodoPago.java Enumerador que representa el método de pago utilizado por un
 * Cliente para pagar un Pedido.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 *
 * Fecha: 15/10/2025
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "metodoPago")
public abstract class MetodoPago {

    BigDecimal MontoPagar;
    Date fecha;

    public MetodoPago() {
    }

    public MetodoPago(BigDecimal MontoPagar, Date fecha) {
        this.MontoPagar = MontoPagar;
        this.fecha = fecha;
    }

    public BigDecimal getMontoPagar() {
        return MontoPagar;
    }

    public void setMontoPagar(BigDecimal MontoPagar) {
        this.MontoPagar = MontoPagar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}

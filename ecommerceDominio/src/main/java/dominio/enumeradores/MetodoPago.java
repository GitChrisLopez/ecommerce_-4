package dominio.enumeradores;

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
public enum MetodoPago {

    /**
     * Pago con tarjéta de crédito o débito.
     */
    @Enumerated(EnumType.STRING)
    TARJETA_CREDITO_DEBITO,
    /**
     * Pago con transferencia bancaria.
     */
    @Enumerated(EnumType.STRING)
    TRANSFERENCIA_BANCARIA,
    /**
     * Pago contraengrega.
     */
    @Enumerated(EnumType.STRING)
    CONTRA_ENTREGA

}

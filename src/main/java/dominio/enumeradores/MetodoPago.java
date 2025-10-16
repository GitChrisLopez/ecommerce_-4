package dominio.enumeradores;

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
public enum MetodoPago {
    /**
     * Pago con tarjéta de crédito o débito.
     */
    TARJETA_CREDITO_DEBITO,
    /**
     * Pago con transferencia bancaria.
     */
    TRANSFERENCIA_BANCARIA,
    /**
     * Pago contraengrega.
     */
    CONTRA_ENTREGA

}

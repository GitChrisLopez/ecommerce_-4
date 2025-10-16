
package Dominio.enums;

/**
 *
 * Estado.java
 * Enumerador que representa el estado de un Pedido realizado por un Cliente.
 * 
 * @author 
 * @author 
 * @author 
 * @author Manuel Romo López - 253080
 * 
 * Fecha: 15/10/2025
 */
public enum Estado {
    /**
     * Pedido pendiente que aún no se ha preparado.
     */
    PENDIENTE,
    /**
     * Pedido que ha sido enviado al Cliente.
     */
    ENVIADO,
    /**
     * Pedido que fue entregado al Cliente.
     */
    ENTREGADO
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
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
@Table(name = "pago_transferencia")
public class PagoTransferencia extends MetodoPago implements Serializable {

    @Column(name = "banco_emisor")
    public String bancoEmisor;

    @Column(name = "cuatro_digitos")
    public String cuatroDigitos;

    public PagoTransferencia() {
    }

    public PagoTransferencia(String bancoEmisor, String cuatroDigitos) {
        this.bancoEmisor = bancoEmisor;
        this.cuatroDigitos = cuatroDigitos;
    }

    public PagoTransferencia(String bancoEmisor, String cuatroDigitos, BigDecimal MontoPagar, Date fecha) {
        super(MontoPagar, fecha);
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

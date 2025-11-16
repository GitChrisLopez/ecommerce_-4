/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.enumeradores.MetodoPago;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "pagoTransferencia")
public class pagoTransferencia extends MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagoTransferencia")
    long id;
    
    
    @Column(name="banco_pagoTransferencia")
    public String bancoEmisor;
    @Column(name = "cuatroDigitos")
    public String cuatroDigitos;

    public pagoTransferencia(String bancoEmisor, String cuatroDigitos) {
        this.bancoEmisor = bancoEmisor;
        this.cuatroDigitos = cuatroDigitos;
    }

    public pagoTransferencia(String bancoEmisor, String cuatroDigitos, BigDecimal MontoPagar, Date fecha) {
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

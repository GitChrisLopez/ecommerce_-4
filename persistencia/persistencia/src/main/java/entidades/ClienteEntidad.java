/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author chris
 */
@Entity
@Table(name = "clientes")
@DiscriminatorValue("CLIENTE")
public class ClienteEntidad extends UsuarioEntidad {

    @Column(name = "saldo", nullable = false)
    private Double saldo;

    @OneToMany(mappedBy = "cliente")
    private List<PedidoEntidad> pedidos;

    // Constructor por defecto
    public ClienteEntidad() {
        super();
    }

    // Getters y Setters para saldo y pedidos...
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<PedidoEntidad> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoEntidad> pedidos) {
        this.pedidos = pedidos;
    }
}

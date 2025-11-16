
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
@Table(name = "pagos_transferencia")
public class PagoTransferencia extends MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago_transferencia")
    private Long id;
    
    @Column(name="banco_pago_transferencia", nullable = false)
    private String bancoEmisor;
    
    @Column(name = "cuatro_digitos", nullable = false)
    private String cuatroDigitos;

    public PagoTransferencia(){
        
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

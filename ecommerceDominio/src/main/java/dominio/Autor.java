
package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_autor")
    private Long id;
    
    @Column (name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column (name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;
    
    @Column (name = "apellido_materno", length = 50, nullable = true)
    private String apellidoMaterno;

    public Autor(){
        
    }
    
    public Autor(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
}

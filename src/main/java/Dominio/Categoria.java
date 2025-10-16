
package Dominio;

/**
 *
 * @author Adrián
 */
public class Categoria {
    
    private Long id;
    private String nombre;

    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

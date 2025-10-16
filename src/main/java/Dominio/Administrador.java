
package Dominio;

/**
 * Administrador.java
 * Clase que representa a un usuario con privilegios de administrador
 * en el sistema. Extiende de Usuario.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author 
 * @author 
 * @author Manuel Romo López - 253080
 * 
 * Fecha: 15/10/2025
 */
public class Administrador extends Usuario{
    
    /**
     * Constructor para inicializar una instancia de Administrador.
     * Llama al constructor de la superclase (Usuario) para establecer
     * los datos básicos.
     * @param id Dato Long que representa el id del Administrador.
     * @param nombre Objeto String que representa el nombre del Administrador.
     * @param correo Objeto String que representa el correo electrónico del Administrador.
     * @param contrasena Objeto String que representa la contraseña del Administrador.
     */
    public Administrador(Long id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);  
    }
    
}

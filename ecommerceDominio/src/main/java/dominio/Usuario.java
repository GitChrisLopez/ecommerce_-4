package dominio;

import java.io.Serializable; // Añadido Serializable
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity; // Añadido
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance; // Añadido
import javax.persistence.InheritanceType; // Añadido
import javax.persistence.Table; // Añadido

/**
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080 * Fecha: 15/10/2025
 *
 */
@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario")
public abstract class Usuario implements Serializable { // Implementado Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 100)
    private String apellidoMaterno;

    @Column(name = "correo", nullable = false, unique = true, length = 200)
    private String correo;

    @Column(name = "contrasenia", nullable = false, length = 255)
    private String contrasenia;

    /**
     * Constructor por defecto.
     */
    public Usuario() {
    }

    /**
     * Constructor que permite crear un Usuario con todos los datos de sus
     * atributos.
     *
     * @param id Dato int que representa el Id del Usuario.
     * @param nombre Objeto String que representa el o los nombres del Usuario.
     * @param apellidoPaterno Objeto String que representa el apellido paterno
     * del Usuario.
     * @param apellidoMaterno Objeto String que representa el apellido materno
     * del Usuario.
     * @param correo Objeto String que representa el correo electrónico del
     * Usuario.
     * @param contrasenia Objeto String que representa el hash de la contraseña
     * del Usuario.
     */
    public Usuario(
            Long id,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String correo,
            String contrasenia) {

        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

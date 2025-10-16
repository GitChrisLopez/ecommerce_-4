package dominio;

/**
 * Clase abstracta que representa a un usuario del sistema. Puede ser un cliente
 * o un administrador.
 *
 * @author chris fitch lopez 252379
 */
public abstract class Usuario {

    /**
     * Identificador unico del usuario.
     */
    private Long id;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Correo electronico del usuario.
     */
    private String correo;

    /**
     * Contrasena del usuario (debe almacenarse de forma segura).
     */
    private String contrasenia;

    /**
     * Indica si el usuario esta activo o no.
     */
    private boolean activo;

    /**
     * Crea un nuevo usuario con sus datos basicos.
     *
     * @param id identificador unico
     * @param nombre nombre del usuario
     * @param correo correo electronico
     * @param contrasenia contrasena del usuario
     */
    public Usuario(Long id, String nombre, String correo, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.activo = true;
    }

    /**
     * @return identificador del usuario
     */
    public Long getId() {
        return id;
    }


    /**
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return correo electronico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo nuevo correo electronico
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return contrasena del usuario
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia nueva contrasena
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return true si el usuario esta activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo estado de actividad del usuario
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}

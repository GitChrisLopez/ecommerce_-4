/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "administradores")
@DiscriminatorValue("ADMINISTRADOR")
public class AdministradorEntidad extends UsuarioEntidad {

    /**
     * Constructor por defecto.
     */
    public AdministradorEntidad() {
        super();
    }

    /**
     * Constructor para inicializar una instancia de Administrador. Llama al
     * constructor de la superclase (Usuario) para establecer los datos básicos.
     *
     * @param id Dato Long que representa el id del Administrador.
     * @param nombre Objeto String que representa el nombre del Administrador.
     * @param correo Objeto String que representa el correo electrónico del
     * Administrador.
     * @param contrasena Objeto String que representa la contraseña del
     * Administrador.
     */
    public AdministradorEntidad(
            Long id,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String correo,
            String contrasena) {

        super(
                id,
                nombre,
                apellidoPaterno,
                apellidoMaterno,
                correo,
                contrasena);
    }
}

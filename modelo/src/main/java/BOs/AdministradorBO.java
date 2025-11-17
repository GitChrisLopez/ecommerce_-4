
package BOs;

import DAOs.AdministradorDAO;
import entidades.Administrador;

/**
 * 
 * @author chris
 */
public class AdministradorBO {

    private AdministradorDAO adminDAO;

    public AdministradorBO() {
        this.adminDAO = new AdministradorDAO();
    }

    public Administrador iniciarSesion(String correo, String contrasenia) /* throws NegocioException */ {
        if (correo == null || correo.isBlank() || contrasenia == null || contrasenia.isBlank()) {
            System.out.println("Correo o contraseña vacíos");
            return null;
        }

        Administrador adminLogueado = adminDAO.iniciarSesion(correo, contrasenia);
        return adminLogueado;
    }
}

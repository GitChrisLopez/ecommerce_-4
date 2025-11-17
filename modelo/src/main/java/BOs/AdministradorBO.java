/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.AdministradorDAO;
import convertidores.AdministradorConverter;
import dominio.Administrador;
import entidades.AdministradorEntidad;

/**
 * 
 * @author chris
 */
public class AdministradorBO {

    private AdministradorDAO adminDAO;
    private AdministradorConverter adminConverter;
    public AdministradorBO() {
        this.adminDAO = new AdministradorDAO();
        this.adminConverter = new AdministradorConverter();
    }

    /**
     * Llama al DAO, obtiene una Entidad y la convierte a DTO.
     */
    public Administrador iniciarSesion(String correo, String contrasenia) /* throws NegocioException */ {
        if (correo == null || correo.isBlank() || contrasenia == null || contrasenia.isBlank()) {
            System.out.println("Correo o contraseña vacíos");
            return null;
        }

        // el DAO devuelve la entidad
        AdministradorEntidad adminEntidad = adminDAO.iniciarSesion(correo, contrasenia);

        //si no es nula es DTO
        if (adminEntidad == null) {
            return null;
        }

        // devolvemos el dto
        Administrador adminDTO = adminConverter.convertirADTO(adminEntidad);

        return adminDTO;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dominio.Administrador;
import entidades.AdministradorEntidad;

/**
 * 
 * @author chris
 */
public class AdministradorConverter {

    /**
     * Convierte una AdministradorEntidad (Persistencia) a un Administrador
     * (Dominio/DTO).
     */
    public Administrador convertirADTO(AdministradorEntidad entidad) {
        if (entidad == null) {
            return null;
        }

        return new Administrador(
                entidad.getId(),
                entidad.getNombre(),
                entidad.getApellidoPaterno(),
                entidad.getApellidoMaterno(),
                entidad.getCorreo(),
                entidad.getContrasenia()
        );
    }

    /**
     * Convierte un Administrador (Dominio/DTO) a una AdministradorEntidad
     * (Persistencia).
     */
    public AdministradorEntidad convertirAEntidad(Administrador dto) {
        if (dto == null) {
            return null;
        }

        return new AdministradorEntidad(
                dto.getId(),
                dto.getNombre(),
                dto.getApellidoPaterno(),
                dto.getApellidoMaterno(),
                dto.getCorreo(),
                dto.getContrasenia()
        );
    }
}

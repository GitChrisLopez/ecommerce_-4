/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mappers;

/*
 * Mapper para convertir entre entidades.Administrador y dominio.Administrador
 * 
 * @author chris
 */
public class MapperAdministrador extends MapperUsuario {

    /**
     * Convierte de Entidad (Persistencia) a DTO (Dominio)
     *
     * @param entity
     * @return
     */
    public static dominio.Administrador toDto(entidades.Administrador entity) {
        if (entity == null) {
            return null;
        }
        dominio.Administrador dto = new dominio.Administrador();
        MapperUsuario.toDto(entity, dto);

        return dto;
    }

    /**
     * Convierte de DTO (Dominio) a Entidad (Persistencia)
     *
     * @param dto
     * @return
     */
    public static entidades.Administrador toEntity(dominio.Administrador dto) {
        if (dto == null) {
            return null;
        }

        entidades.Administrador entity = new entidades.Administrador();

        MapperUsuario.toEntity(dto, entity);

        return entity;
    }
}

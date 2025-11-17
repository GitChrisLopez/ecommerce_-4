package mappers;

import dominio.FormatoDTO;
import enumeradores.Formato;

/**
 * Mapper que convierte un Objeto Entidad Formato a un Objeto FormatoDTO, y
 * viceversa.
 *
 * @author norma
 */
public class MapperFormato {

    /**
     * Convierte el Enum Formato de Entidad a FormatoDTO.
     *
     * @param entityEnum El Enum Formato de la Entidad.
     * @return El Enum FormatoDTO.
     */
    public static FormatoDTO toDto(Formato entityEnum) {
        if (entityEnum == null) {
            return null;
        }
        return FormatoDTO.valueOf(entityEnum.name());
    }

    /**
     * Convierte el Enum FormatoDTO a Formato de Entidad.
     *
     * @param dtoEnum El Enum FormatoDTO.
     * @return El Enum Formato de la Entidad.
     */
    public static Formato toEntity(FormatoDTO dtoEnum) {
        if (dtoEnum == null) {
            return null;
        }
        return Formato.valueOf(dtoEnum.name());
    }
}

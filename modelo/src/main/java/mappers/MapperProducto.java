package mappers;

import dominio.ProductoDTO;
import entidades.Producto;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Romo López Manuel ID: 000002530800
 */
public class MapperProducto {

    /**
     * Convierte un objeto Entidad Producto a un objeto ProductoDTO.
     *
     * @param entity La entidad Producto.
     * @return El DTO del Producto.
     */
    public static ProductoDTO toDto(Producto entity) {
        if (entity == null) {
            return null;
        }

        ProductoDTO dto = new ProductoDTO();
        dto.setId(entity.getId());
        dto.setIsbn(entity.getIsbn());
        dto.setPrecio(entity.getPrecio());
        dto.setFormato(MapperFormato.toDto(entity.getFormato()));
        dto.setNumeroPaginas(entity.getNumeroPaginas());
        dto.setUrlImagen(entity.getUrlImagen());
        dto.setStock(entity.getStock());
        dto.setLibro(MapperLibro.toDto(entity.getLibro()));

        return dto;
    }

    /**
     * Convierte una lista de entidades Producto a una lista de ProductoDTO.
     *
     * @param entityList La lista de entidades Producto.
     * @return La lista de DTOs.
     */
    public static List<ProductoDTO> toDtoList(List<Producto> entityList) {
        
        if(entityList == null){
            return null;
        }
        
        return entityList.stream()
                .map(MapperProducto::toDto)
                .collect(Collectors.toList());
    }

    /**
     * Convierte un objeto ProductoDTO a un objeto Entidad Producto.
     *
     * @param dto El DTO del Producto.
     * @return La entidad Producto.
     */
    public static Producto toEntity(ProductoDTO dto) {
        if (dto == null) {
            return null;
        }

        Producto entity = new Producto();

        entity.setId(dto.getId());
        entity.setIsbn(dto.getIsbn());
        entity.setPrecio(dto.getPrecio());
        entity.setFormato(MapperFormato.toEntity(dto.getFormato()));
        entity.setNumeroPaginas(dto.getNumeroPaginas());
        entity.setStock(dto.getStock());
        entity.setUrlImagen(dto.getUrlImagen());
        entity.setLibro(MapperLibro.toEntity(dto.getLibro()));
        return entity;
    }

    /**
     * Convierte una lista de ProductoDTO a una lista de entidades Producto.
     *
     * @param dtoList La lista de DTOs.
     * @return La lista de entidades Producto.
     */
    public static List<Producto> toEntityList(List<ProductoDTO> dtoList) {
        
        if(dtoList == null){
            return null;
        }
        
        return dtoList.stream()
                .map(MapperProducto::toEntity)
                .collect(Collectors.toList());
    }
}

package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase que representa una categoría que puede tener un Libro.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 */
@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

    /**
     * Dato Long que representa el Id de la Categoria.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    /**
     * Objeto String que representa el nombre de la Categoria.
     */
    @Column(name = "nombre", length = 20, nullable = false, unique = true)
    private String nombre;

    /**
     * Lista de productos que pertenecen a esta categoria.
     */
    @OneToMany(mappedBy = "categoria") // Relación inversa con Producto
    private List<Producto> productos;

    /**
     * Constructor por defecto.
     */
    public Categoria() {

    }

    /**
     * Constructor que permite crear una Categoría, recibe los valores de todos
     * sus atributos.
     *
     * @param id Objeto Long que representa el Id de la Categoria.
     * @param nombre Objeto String que representa el nombre de la Categoria.
     */
    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el id de una categoria
     *
     * @return el ID que se obtuvo
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) { // Añadido SetId
        this.id = id;
    }

    /**
     * Metodo que obtiene el nombre de la categoria
     *
     * @return el nombre de la categoria buscada
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que declara el nombre de la categoria
     *
     * @param nombre el nombre a declarar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

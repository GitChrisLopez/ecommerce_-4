package dominio;

/**
 *
 * @author Adrián
 */
public class Categoria {

    private Long id;
    private String nombre;

    /**
     * Constructor de la categoria
     * @param id identificador de la categoria 
     * @param nombre nombre de la categoria a la uqe pertenece un libro
     */
    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el id de una categoria
     * @return el ID que se obtuvo
     */
    public Long getId() {
        return id;
    }


    /**
     * Metodo que obtiene el nombre de la categoria
     * @return el nombre de la categoria buscada
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que declara el nombre de la categoria
     * @param nombre el nombre a declarar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

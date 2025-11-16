package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representa un libro dentro del catalogo del sistema de comercio. Contiene
 * informacion basica del producto, su categoria y sus resenias.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 */

@Entity
@Table(name = "libros")
public class Libro {

    /**
     * Identificador único del libro.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_libro")
    private Long id;

    /**
     * Titulo del libro.
     */
    @Column (name = "titulo", length = 100, nullable = false)
    private String titulo;

    /**
     * Precio de venta del libro.
     */
    @Column (name = "precio", nullable = false)
    private double precio;

    /**
     * Descripcion breve del contenido del libro.
     */
    @Column (name = "sinopsis", length = 350, nullable = false) 
    private String sinopsis;

    /**
     * Categoria a la que pertenece el libro.
     */
    @Enumerated (EnumType.STRING)
    @Column (name = "categoria" , nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn (name = "id_autor", nullable = false) 
    private Autor autor;
    
    /**
     * Editorial responsable de la publicacion.
     */
    @ManyToOne
    @JoinColumn (name = "id_editorial", nullable = false) 
    private Editorial editorial;

    /**
     * Fecha de publicacion del libro.
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "fecha_publicacion", nullable = false)
    private LocalDate fechaPublicacion;
    
    /**
     * Constructor por defecto.
     */
    public Libro(){
        
    }

    /**
     * Constructor que permite crear un Libro, recibe todos los valores de los
     * parámetros de la clase.
     * @param id Dato Long que representa el Id del Libro.
     * @param titulo Dato String que representa el título del Libro.
     * @param precio Dato double que representa el precio del Libro.
     * @param sinopsis Objeto String que representa la sinopsis del Libro.
     * @param categoria Objeto Categoria que representa la categoría del Libro.
     * @param autor Objeto Autor que representa el Autor del Libro.
     * @param editorial Objeto Editorial que representa la Editorial del Libro.
     * @param fechaPublicacion Objeto LocalDate que representa la fecha de publicación del Libro.
     */
    public Libro(
            Long id,
            String titulo,
            double precio, 
            String sinopsis,
            Categoria categoria,
            Autor autor, 
            Editorial editorial,
            LocalDate fechaPublicacion) {
        
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.categoria = categoria;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    
    /**
     * @return identificador del libro.
     */
    public Long getId() {
        return id;
    }

    /**
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo nuevo titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return precio actual del libro
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio nuevo precio de venta
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return sinopsis del libro
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param descripcion nueva descripcion
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


    /**
     * @return categoria del libro
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria nueva categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return editorial del libro
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial nueva editorial
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /**
     * @return autor del libro
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor nuevo autor
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return fecha de publicacion
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion nueva fecha de publicacion
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


}

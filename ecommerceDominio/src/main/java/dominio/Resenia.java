package dominio;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Archivo: Resenia.java
 * 
 * Clase que representa una resenia hecha por un usuario sobre un libro. Contiene
 * calificacion, comentario, fecha y referencias al libro y usuario.
 *
 * @author Norma Alicia Beltrán Martín - 252102
 * @author Oscar Adrián Castán López - 260318
 * @author Chris Fitch Lopez - 252379
 * @author Manuel Romo López - 253080
 * 
 * Fecha: 15/10/2025
 */

@Entity
@Table(name = "resenias")
public class Resenia {

    /**
     * Identificador unico de la resenia.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_resenia")
    private Long id;

    /**
     * Libro al que pertenece la resenia.
     */
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;
    
    /**
     * Formato del Producto al que hace referencia la reseña.
     */
    @Enumerated (EnumType.STRING)
    @Column (name = "formato" , nullable = false)
    private Formato formato;

    /**
     * Calificacion numerica dada por el usuario.
     */
    @Column (name = "calificacion", nullable = false)
    private int calificacion;

    /**
     * Comentario del usuario sobre el libro.
     */
    @Column (name = "comentario", length = 350, nullable = false)
    private String comentario;

    /**
     * Fecha en que se publico la resenia.
     */
    @Temporal (TemporalType.TIMESTAMP)
    @Column (name = "fecha_publicacion", nullable = false)
    private LocalDateTime fecha;

    /**
     * Usuario que realizo la resenia.
     */
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    /**
     * Constructor por defecto
     */
    public Resenia(){
        
    }
    
    /**
     * Crea una nueva resenia con todos sus datos.
     *
     * @param id identificador unico de la resenia
     * @param libro libro al que pertenece la resenia
     * @param formato formato del producto al que hace referencia la reseña.
     * @param calificacion valor numerico de la calificacion
     * @param comentario comentario del usuario
     * @param fecha fecha de publicacion
     * @param cliente cliente que realizo la resenia
     */
    public Resenia(
            Long id, 
            Libro libro, 
            Formato formato,
            int calificacion,
            String comentario,
            LocalDateTime fecha,
            Cliente cliente) {
        
        this.id = id;
        this.libro = libro;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    /**
     * @return identificador de la resenia.
     */
    public Long getId() {
        return id;
    }

    /**
     * @return libro reseñado
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro libro al que pertenece la resenia
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * 
     * @return formato del producto al que hace referencia la reseña.
     */
    public Formato getFormato() {
        return formato;
    }

    /**
     * 
     * @param formato formato del producto al que hace referencia la reseña.
     */
    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    /**
     * @return calificacion del usuario
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion nueva calificacion
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return comentario del usuario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario nuevo comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return fecha de publicacion
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha nueva fecha de publicacion
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return cliente que escribio la resenia
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente cliente que escribio la resenia
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

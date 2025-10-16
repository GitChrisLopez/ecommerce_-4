package dominio;

import java.time.LocalDateTime;

/**
 * Representa una resenia hecha por un usuario sobre un libro. Contiene
 * calificacion, comentario, fecha y referencias al libro y usuario.
 *
 * @author chris fitch lopez 252379
 */
public class Resenia {

    /**
     * Identificador unico de la resenia.
     */
    private Long id;

    /**
     * Libro al que pertenece la resenia.
     */
    private Libro libro;

    /**
     * Calificacion numerica dada por el usuario.
     */
    private int calificacion;

    /**
     * Comentario del usuario sobre el libro.
     */
    private String comentario;

    /**
     * Fecha en que se publico la resenia.
     */
    private LocalDateTime fecha;

    /**
     * Usuario que realizo la resenia.
     */
    private Usuario usuario;

    /**
     * Crea una nueva resenia con todos sus datos.
     *
     * @param id identificador unico de la resenia
     * @param libro libro al que pertenece la resenia
     * @param calificacion valor numerico de la calificacion
     * @param comentario comentario del usuario
     * @param fecha fecha de publicacion
     * @param usuario usuario que realizo la resenia
     */
    public Resenia(Long id, Libro libro, int calificacion, String comentario,
            LocalDateTime fecha, Usuario usuario) {
        this.id = id;
        this.libro = libro;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
        this.usuario = usuario;
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
     * @return usuario que escribio la resenia
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario usuario que escribio la resenia
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

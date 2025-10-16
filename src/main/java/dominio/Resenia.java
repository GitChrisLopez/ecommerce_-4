
package dominio;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Resenia {
    private Long id;
    private Libro libro;
    private int calificacion;
    private String comentario;
    private LocalDateTime fecha;
    private Usuario usuario;

    public Resenia(Long id, Libro libro, int calificacion, String comentario, LocalDateTime fecha, Usuario usuario) {
        this.id = id;
        this.libro = libro;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}

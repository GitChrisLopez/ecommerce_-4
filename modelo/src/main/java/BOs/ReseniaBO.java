package BOs;

import DAOs.ReseniaDAO;
import dominio.ReseniaDTO;
import entidades.Resenia;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.List;
import mappers.MapperResenia;

/**
 * Se encarga de implementar lalógica de negocio relacionada con las resenias,
 * como eliminar, actualizar, y realizar consultas filtradas. Además, valida los
 * datos antes de realizar operaciones sobre la base de datos.
 *
 * @author norma
 */
public class ReseniaBO {

    private final ReseniaDAO reseniaDAO = new ReseniaDAO();

    /**
     * Elimina una resenia.
     *
     * @param idResenia ID de la resenia a eliminar.
     * @return true si fue eliminado correctamente.
     * @throws PersistenciaException si ocurre un error en la capa de
     * persistencia.
     * @throws NegocioException si el ID no es válido o no se pudo eliminar.
     */
    public boolean eliminarResenia(Long idResenia) throws PersistenciaException, NegocioException {
        if (idResenia <= 0) {
            throw new NegocioException("El ID debe ser un número válido.");
        }

        boolean eliminado = reseniaDAO.eliminarResenia(idResenia);
        if (!eliminado) {
            throw new NegocioException("No se pudo eliminar la resenia con ID: " + idResenia);
        }
        return eliminado;
    }

    /**
     * Actualiza el comentario de una resenia.
     *
     * @param idResenia ID de la resenia a actualizar.
     * @param nuevoComentario nuevo comentario de la resenia.
     * @throws PersistenciaException si ocurre un error en la capa de
     * persistencia.
     * @throws NegocioException si el ID o comentario no es válido o no se pudo
     * actualizar.
     */
    public void actualizarComentarioResenia(Long idResenia, String nuevoComentario) throws PersistenciaException, NegocioException {

        if (idResenia == null || idResenia <= 0) {
            throw new NegocioException("El ID de la reseña es inválido.");
        }
        if (nuevoComentario == null || nuevoComentario.trim().isEmpty()) {
            throw new NegocioException("El comentario no puede estar vacío.");
        }

        try {
            boolean exito = reseniaDAO.actualizarComentario(idResenia, nuevoComentario);

            if (!exito) {
                throw new NegocioException("La reseña con ID " + idResenia + " no existe o no se pudo actualizar.");
            }

        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en la capa de persistencia al actualizar el comentario.", ex);
        } catch (Exception ex) {
            throw new NegocioException("Error inesperado al actualizar el comentario.", ex);
        }
    }

    /**
     * Obtiene todas las resenias.
     *
     * @return Lista de resenias.
     * @throws PersistenciaException si ocurre un error en la capa de
     * persistencia.
     * @throws NegocioException si no se pudo obtener la lista de resenias.
     */
    public List<ReseniaDTO> obtenerResenias() throws PersistenciaException, NegocioException {
        try {
            List<Resenia> resenias = reseniaDAO.obtenerTodasLasResenias();

            if (resenias == null || resenias.isEmpty()) {
                throw new NegocioException("No se encontraron reseñas.");
            }
            return MapperResenia.toDtoList(resenias);
        } catch (PersistenciaException e) {
            throw e;
        } catch (Exception e) {
            throw new NegocioException("Error al obtener la lista de resenias.", e);
        }
    }

    /**
     * Obtiene una resenia específica.
     *
     * @param idResenia ID de la resenia a obtener.
     * @return Resenia específica.
     * @throws PersistenciaException si ocurre un error en la capa de
     * persistencia.
     * @throws NegocioException si no se pudo obtener la resenia.
     */
    public ReseniaDTO obtenerReseniaPorId(Long idResenia) throws PersistenciaException, NegocioException {
        if (idResenia == null || idResenia <= 0) {
            throw new NegocioException("El ID de la reseña debe ser un número válido.");
        }

        try {
            Resenia resenia = reseniaDAO.obtenerResenia(idResenia);

            if (resenia == null) {
                throw new NegocioException("No se encontró la reseña con ID: " + idResenia);
            }

            return MapperResenia.toDto(resenia);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en la capa de persistencia al obtener la reseña.", ex);
        } catch (Exception ex) {
            throw new NegocioException("Error inesperado al obtener la reseña.", ex);
        }
    }

    /**
     * Obtiene las resenias en relación a su libro vinculado.
     *
     * @param busqueda libro que se quiere que las resenias tengan.
     * @return Lista de resenias que les aplica el filtro.
     * @throws PersistenciaException si ocurre un error en la capa de
     * persistencia.
     * @throws NegocioException si no se pudo obtener la lista de resenias.
     */
    public List<ReseniaDTO> obtenerReseniasFiltradasPorLibro(String busqueda) throws PersistenciaException, NegocioException {

        try {
            List<Resenia> listaResenias;

            if (busqueda == null || busqueda.trim().isEmpty()) {
                listaResenias = reseniaDAO.obtenerTodasLasResenias();
            } else {
                listaResenias = reseniaDAO.obtenerReseniasFiltradasPorLibro(busqueda);
            }

            return MapperResenia.toDtoList(listaResenias);

        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en la capa de persistencia al obtener las reseñas filtradas.", ex);
        } catch (Exception ex) {
            throw new NegocioException("Error inesperado al obtener las reseñas filtradas.", ex);
        }
    }

}

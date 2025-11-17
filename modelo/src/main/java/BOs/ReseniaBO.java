package BOs;

import DAOs.ReseniaDAO;
import dominio.Resenia;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author norma
 */
public class ReseniaBO {

    private final ReseniaDAO reseniaDAO = new ReseniaDAO();

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

    public Resenia actualizarResenia(Resenia resenia) throws PersistenciaException, NegocioException {
        try {
            return reseniaDAO.actualizarResenia(resenia);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al actualiza la resenia", ex);
        }
    }

    public List<Resenia> obtenerResenias() throws PersistenciaException, NegocioException {
        try {
            List<Resenia> resenias = reseniaDAO.obtenerTodasLasResenias();
            if (resenias == null || resenias.isEmpty()) {
                throw new NegocioException("No se encontraron resenias en la base de datos.");
            }
            return resenias;
        } catch (PersistenciaException e) {
            throw e;
        } catch (Exception e) {
            throw new NegocioException("Error al obtener la lista de resenias.", e);
        }
    }

    public Resenia obtenerReseniaPorId(Long idResenia) throws PersistenciaException, NegocioException {
        try {
            Resenia resenia = reseniaDAO.obtenerResenia(idResenia);
            if (resenia == null) {
                throw new NegocioException("No se encontró la comanda en la base de datos.");
            }
            return resenia;
        } catch (PersistenciaException e) {
            throw e;
        } catch (Exception e) {
            throw new NegocioException("Error al obtener la resenia por ID", e);
        }
    }

    public List<Resenia> obtenerReseniasFiltradasPorLibro(String busqueda) throws PersistenciaException, NegocioException {
        
        if (busqueda == null || busqueda.trim().isEmpty()) {
            try {
                return reseniaDAO.obtenerTodasLasResenias();
            } catch (PersistenciaException e) {
                throw e;
            }
        }

        try {
            List<Resenia> listaFiltrada = reseniaDAO.obtenerReseniasFiltradasPorLibro(busqueda);

            return listaFiltrada;

        } catch (PersistenciaException e) {
            throw e;

        } catch (Exception e) {
            throw new NegocioException("Ocurrió un error inesperado al filtrar las reseñas por libro.", e);
        }
    }

}

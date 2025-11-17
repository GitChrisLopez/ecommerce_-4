package DAOs;

import com.persistencia.ManejadorConexiones;
import dominio.Cliente;
import dominio.Resenia;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author norma
 */
public class ReseniaDAO {

    public Resenia persistirResenia(Resenia resenia) throws PersistenciaException {

        EntityManager em = ManejadorConexiones.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(resenia);
            em.getTransaction().commit();

            return resenia;
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al persistir resenia", e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }

    }

    public boolean eliminarResenia(Long idResenia) throws PersistenciaException {

        EntityManager em = ManejadorConexiones.getEntityManager();
        try {
            em.getTransaction().begin();
            Resenia resenia = em.find(Resenia.class, idResenia);
            if (resenia != null) {
                em.remove(resenia);
                em.getTransaction().commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al eliminar resenia", e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Resenia actualizarResenia(Resenia resenia) throws PersistenciaException {

        EntityManager em = ManejadorConexiones.getEntityManager();
        try {
            em.getTransaction().begin();
            resenia = em.merge(resenia);
            em.getTransaction().commit();
            return resenia;
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al actualizar resenia", e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public List<Resenia> obtenerTodasLasResenias() throws PersistenciaException {

        EntityManager em = ManejadorConexiones.getEntityManager();
        List<Resenia> resenias = null;
        try {

            resenias = em.createQuery("SELECT r FROM Resenia r", Resenia.class).getResultList();

            return resenias;
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener todas las resenias", e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Resenia obtenerResenia(Long idResenia) throws PersistenciaException {

        EntityManager em = ManejadorConexiones.getEntityManager();

        try {
            return em.find(Resenia.class, idResenia);
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener resenia con id" + idResenia, e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

}

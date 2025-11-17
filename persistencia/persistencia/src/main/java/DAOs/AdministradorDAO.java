/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.persistencia.ManejadorConexiones;
import entidades.AdministradorEntidad;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author chris
 */
public class AdministradorDAO {

    /**
     * Busca en la BD y devuelve la ENTIDAD de persistencia
     */
    public AdministradorEntidad iniciarSesion(String correo, String contrasenia) {
        EntityManager em = ManejadorConexiones.getEntityManager();
        try {
            // consulta JPQL
            TypedQuery<AdministradorEntidad> query = em.createQuery(
                    "SELECT a FROM AdministradorEntidad a WHERE a.correo = :correo AND a.contrasenia = :contra",
                    
                    // devuelve la entidad
                    AdministradorEntidad.class
            );
            query.setParameter("correo", correo);
            query.setParameter("contra", contrasenia);

            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
}

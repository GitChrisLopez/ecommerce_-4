/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.persistencia.ManejadorConexiones;
import entidades.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 * 
 * @author chris
 */
public class AdministradorDAO {

    public Administrador iniciarSesion(String correo, String contrasenia) {
        EntityManager em = ManejadorConexiones.getEntityManager();
        try {
            // jPQL para buscar un Administrador
            TypedQuery<Administrador> query = em.createQuery(
                    "SELECT a FROM Administrador a WHERE a.correo = :correo AND a.contrasenia = :contra",
                    Administrador.class
            );
            query.setParameter("correo", correo);
            query.setParameter("contra", contrasenia);

            return query.getSingleResult();
        } catch (NoResultException e) {
            // No se encontro ningun admin
            return null;
        } finally {
            em.close();
        }
    }
}

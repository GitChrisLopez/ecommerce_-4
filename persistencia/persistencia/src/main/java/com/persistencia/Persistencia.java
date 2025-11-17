/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.persistencia;

import entidades.EditorialEntidad;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author chris
 */
public class Persistencia {

    public static void main(String[] args) {

        // instancia entidad
        EditorialEntidad e = new EditorialEntidad();

        // la id es generada por la base de datos
        e.setNombre("Editorial de Prueba desde Main");

        EntityManager em = ManejadorConexiones.getEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            // se inicia la transaccion
            tx.begin();

            // entidad
            em.persist(e);

            // guarda los cambios
            tx.commit();

            System.out.println("¡Editorial guardada con éxito!");
            System.out.println("ID generado: " + e.getId());

        } catch (Exception ex) {
            // si hay exception, revierte los cambios
            if (tx.isActive()) {
                tx.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
}

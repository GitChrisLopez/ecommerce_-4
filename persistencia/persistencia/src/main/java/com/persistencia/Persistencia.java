/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.persistencia;

import entidades.Editorial;
import javax.persistence.EntityManager;

/**
 *
 * @author romom
 */
public class Persistencia {

    public static void main(String[] args) {
        
        
        Editorial e = new Editorial(2, "editorial ejemplo");
        
        EntityManager em = ManejadorConexiones.getEntityManager();
        
        em.persist(e);
        
    }
}

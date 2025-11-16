
package com.persistencia;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 * 
 */
public class ManejadorConexiones {
    private static boolean conexionTest = true;
    
    public static void setConexionTest(boolean conexionTestActiva){
        conexionTest = conexionTestActiva;
    }
    
    public static EntityManager getEntityManager(){
        
        
        EntityManagerFactory emFactory;
      
        Properties propiedades = new Properties();
            try (InputStream inputStream = ManejadorConexiones.class.getClassLoader().getResourceAsStream("META-INF/properties.txt")) {
                propiedades.load(inputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Properties equipo04_ecommerce_up_prop = new Properties();
            Properties equipo04_ecommerce_up_tests_prop = new Properties();

            for (String key : propiedades.stringPropertyNames()) {
                if (key.startsWith("equipo04_ecommerce_persistencia_jar_1.0PU.")) {
                   
                    String keyPropiedad = key.substring("equipo04_ecommerce_persistencia_jar_1.0PU.".length());
                    equipo04_ecommerce_up_prop.put(keyPropiedad, propiedades.getProperty(key));
                    
                } else if (key.startsWith("equipo04_ecommerce_persistencia_jar_1.0PU_Tests.")) {
                    String propKey = key.substring("equipo04_ecommerce_persistencia_jar_1.0PU_Tests.".length());
                    equipo04_ecommerce_up_tests_prop.put(propKey, propiedades.getProperty(key));
                }
            }
            
        if(conexionTest){
            
            emFactory = Persistence.createEntityManagerFactory("equipo04_ecommerce_persistencia_jar_1.0PU_Tests", 
                    equipo04_ecommerce_up_tests_prop);
        } else{
            emFactory = Persistence.createEntityManagerFactory("equipo04_ecommerce_persistencia_jar_1.0PU", 
                    equipo04_ecommerce_up_prop);
        }
        
        EntityManager entityManager = emFactory.createEntityManager();
        
        return entityManager;
    }
}

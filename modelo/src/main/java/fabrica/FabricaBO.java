
package fabrica;

import BOs.ProductosBO;
import DAOs.ProductosDAO;
import definiciones.IProductosBO;
import definiciones.IProductosDAO;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 * 
 */
public class FabricaBO {
    
    public static IProductosBO obtenerProductosBO(){
        
        IProductosDAO productosDAO = new ProductosDAO();
        
        IProductosBO productosBO = new ProductosBO(productosDAO);
        
        return productosBO;
        
    }
}

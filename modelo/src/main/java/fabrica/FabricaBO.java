package fabrica;

import BOs.PedidoBO;
import BOs.ProductosBO;
import BOs.ReseniaBO;
import DAOs.PedidoDAO;
import DAOs.ProductosDAO;
import DAOs.ReseniaDAO;
import definiciones.IPedidoBO;
import definiciones.IPedidoDAO;
import definiciones.IProductosBO;
import definiciones.IProductosDAO;
import definiciones.IReseniaBO;
import definiciones.IReseniaDAO;

/**
 * Fábrica de BO.
 *
 * @author Romo López Manuel ID: 00000253080
 *
 */
public class FabricaBO {

    public static IProductosBO obtenerProductosBO() {

        IProductosDAO productosDAO = new ProductosDAO();

        IProductosBO productosBO = new ProductosBO(productosDAO);

        return productosBO;

    }

    public static IReseniaBO obtenerReseniasBO() {

        IReseniaDAO reseniaDAO = (IReseniaDAO) new ReseniaDAO();

        IReseniaBO reseniaBO = new ReseniaBO(reseniaDAO);

        return reseniaBO;

    }
    
    public static IPedidoBO obtenerPedidosBO(){
        
        IPedidoDAO pedidoDAO = new PedidoDAO();
        
        IPedidoBO pedidoBO = new PedidoBO(pedidoDAO);
        
        return pedidoBO;
    }
}

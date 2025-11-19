
package controladores;

import dominio.FormatoDTO;
import dominio.ProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 */
@WebServlet(name = "ActualizarProducto", urlPatterns = {"/admin-actualizar-producto"})
public class ActualizarProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ActualizarProducto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ActualizarProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        Long id = Long.parseLong(request.getParameter("id"));
//        Long idLibro = Long.parseLong(request.getParameter("id-libro"));
//
//        Integer paginas = Integer.parseInt(request.getParameter("numero-paginas"));
//        BigDecimal precio = BigDecimal.valueOf(request.getParameter("precio"));
//        Integer stock = Integer.parseInt(request.getParameter("stock"));
//
//        String formatoString = request.getParameter("formato");
//        FormatoDTO formatoEnum = FormatoDTO.valueOf(formatoString); 
//
//        ProductoDTO productoDTO = new ProductoDTO();
//        productoDTO.setId(id);
//        productoDTO.setIdLibro(idLibro);
//        productoDTO.setNumeroPaginas(paginas);
//        productoDTO.setPrecio(precio);
//        productoDTO.setStock(stock);
//        productoDTO.setFormato(formatoEnum);
//
//        productoBO.actualizar(productoDTO);
//
//
//        response.sendRedirect("SvAdminProductos");
//        
//        
//        String path = request.getServletContext().getRealPath("");
//        String pathGuardar = path + "profilePictures";
//        
//        File directorio = new File(pathGuardar);
//        
//        if(!directorio.exists()){
//            directorio.mkdir();     
//        }
//        
//        Part filePart = request.getPart("profilePic");
//        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
//
//        InputStream fileContent = filePart.getInputStream();
//        File targetFile = new File(pathGuardar + File.separator + fileName);
//        
//        Files.copy(fileContent, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        
//        IOUtils.closeQuietly(fileContent);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

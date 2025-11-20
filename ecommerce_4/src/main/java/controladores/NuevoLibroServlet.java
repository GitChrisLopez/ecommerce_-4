
package controladores;

import dominio.LibroDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 */
@WebServlet(name = "NuevoLibroServlet", urlPatterns = {"/admin-nuevo-libro"})
public class NuevoLibroServlet extends HttpServlet {

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
            out.println("<title>Servlet NuevoLibroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NuevoLibroServlet at " + request.getContextPath() + "</h1>");
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
        
        LibroDTO libroAgregar = null;
        
        // Se revisa la sesión para buscar si hay un libro pendiente y/o un error.
        HttpSession session = request.getSession();
        LibroDTO libroPendiente = (LibroDTO) session.getAttribute("libroPendienteAgregar"); // Cambiamos la variable de sesión
        String errorSesion = (String) session.getAttribute("errorSesion");

        // Se determina si hay un libro pendiente de actualizar en la sesión.
        if (libroPendiente != null) {

            // Si hay un libro pendiente, éste será el que se editará.
            libroAgregar = libroPendiente;

            // Se elimina el libro pendiente en la sesión.
            session.removeAttribute("libroPendienteAgregar");

            if (errorSesion != null) {
                // Se coloca el mensaje de error en la solicitud para la página destino.
                request.setAttribute("mensajeError", errorSesion);

                // Se elimina para evitar que salga al refrescar la página.
                session.removeAttribute("errorSesion");
            }
        } else{
             // Si no hay un libro pendiente, se limpia el mensaje de error para carga inicial.
            request.removeAttribute("mensajeError");
        }

        request.setAttribute("libroAgregar", libroAgregar);
        
        request.getRequestDispatcher("admin-agregar-libro.jsp").forward(request, response);
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
        processRequest(request, response);
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

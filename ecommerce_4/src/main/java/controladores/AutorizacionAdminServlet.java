package controladores;

import BOs.AdministradorBO;
import dominio.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet para autenticar al administrador.
 *
 * @author chris
 */
@WebServlet(name = "AutorizacionAdminServlet", urlPatterns = {"/AutorizacionAdminServlet"})
public class AutorizacionAdminServlet extends HttpServlet {

    private AdministradorBO adminBO;

    public AutorizacionAdminServlet() {
        this.adminBO = new AdministradorBO();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AutorizacionAdminServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AutorizacionAdminServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null && accion.equals("logout")) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate(); // Destruye la sesión
            }
            response.sendRedirect("index.html");
        } else {
            response.sendRedirect("index.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            // intenta iniciar sesión con el BO
            Administrador admin = adminBO.iniciarSesion(email, password);

            if (admin != null) {
                // crea la sesión
                HttpSession session = request.getSession(true);
                session.setAttribute("adminLogueado", admin);

                // redirige al menú de admin
                response.sendRedirect("menu-principal-admin");
            } else {
                // regresa al login con error
                response.sendRedirect("iniciar-sesion.html?error=true");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("iniciar-sesion.html?error=true");
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet de Autenticación de Administrador";
    }
}

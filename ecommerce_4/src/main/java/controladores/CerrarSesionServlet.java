/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author chris
 */
@WebServlet(name = "CerrarSesionServlet", urlPatterns = {"/CerrarSesion"})
public class CerrarSesionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // se obtiene la sesion actual pero sin crear una nueva
        HttpSession session = request.getSession(false);

        // si existe una sesion, la volvemos invalida borrando los datos
        if (session != null) {
            session.invalidate();
        }

        // se manda al usuario de vuelta a la pagina de inicio de sesion
        response.sendRedirect(request.getContextPath() + "/login");
    }
}

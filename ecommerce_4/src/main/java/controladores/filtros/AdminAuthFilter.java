/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.filtros;

import dominio.Administrador;
import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Filtro para asegurar que solo admins logueados ingresen
 * y no solo por tener la URL
 * 
 * @author chris
 */
@WebFilter(filterName = "AdminAuthFilter", urlPatterns = {"/admin-*"})
public class AdminAuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // obtiene la sesion
        HttpSession session = httpRequest.getSession(false);

        boolean logueado = false;
        if (session != null && session.getAttribute("adminLogueado") != null) {
            
            // verifica la sesion si sea de un admin
            if (session.getAttribute("adminLogueado") instanceof Administrador) {
                logueado = true;
            }
        }

        if (logueado) {
            // usuario es admin true
            chain.doFilter(request, response);
        } else {
            // false, lo manda a iniciar sesion
            httpResponse.sendRedirect("iniciar-sesion.html");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}

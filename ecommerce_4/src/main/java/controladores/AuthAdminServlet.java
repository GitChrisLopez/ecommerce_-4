///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package controladores;
//
//import BOs.AdministradorBO;
//import dominio.Administrador;
//import java.io.IOException;
//import java.io.PrintWriter;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
///**
// *
// * @author chris
// */
//@WebServlet(name = "AuthAdminServlet", urlPatterns = {"/AuthAdminServlet"})
//public class AuthAdminServlet extends HttpServlet {
//
//    private AdministradorBO adminBO;
//
//    public AuthAdminServlet() {
//        this.adminBO = new AdministradorBO();
//    }
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AuthAdminServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AuthAdminServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Maneja el cierre de sesion
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String accion = request.getParameter("accion");
//
//        if (accion != null && accion.equals("logout")) {
//            // sesión actual pero sin crear una nueva si no existe
//            HttpSession session = request.getSession(false);
//
//            if (session != null) {
//                // sesion invalida
//                session.invalidate();
//            }
//
//            response.sendRedirect("index.html");
//        } else {
//            response.sendRedirect("index.html");
//        }
//
//    }
//
//    /**
//     * Maneja el inicio de sesion
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        try {
//            Administrador admin = adminBO.iniciarSesion(email, password);
//
//            if (admin != null) {
//                // creamos la sesión
//                HttpSession session = request.getSession(true);
//                
//                // guardamos el objeto admin
//                session.setAttribute("adminLogueado", admin);
//                response.sendRedirect("admin-menu-administrador.html");
//            } else {
//                // false
//                response.sendRedirect("iniciar-sesion.jsp?error=true");
//            }
//        } catch (Exception e) {
//            System.err.println("Error en el inicio de sesión: " + e.getMessage());
//            response.sendRedirect("iniciar-sesion.jsp?error=true");
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}

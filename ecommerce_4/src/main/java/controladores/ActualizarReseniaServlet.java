///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package controladores;
//
//import BOs.ReseniaBO;
//import dominio.Resenia;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// *
// * @author norma
// */
//@WebServlet(name = "ActualizarReseniaServlet", urlPatterns = {"/ActualizarReseniaServlet"})
//public class ActualizarReseniaServlet extends HttpServlet {
//
//    private final ReseniaBO reseniaBO = new ReseniaBO();
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
//            out.println("<title>Servlet ActualizarReseniaServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ActualizarReseniaServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.sendRedirect(request.getContextPath() + "/MostrarReseniasServlet");
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        Long idResenia = null;
//        String mensaje;
//
//        try {
//            String parametro = request.getParameter("id");
//            String nuevoComentario = request.getParameter("comentario");
//            
//            if (parametro == null || nuevoComentario == null || parametro.isEmpty()) {
//                 throw new IllegalArgumentException("Datos incompletos.");
//            }
//
//            idResenia = Long.valueOf(parametro);
//
//            Resenia reseniaActualizada = reseniaBO.obtenerReseniaPorId(idResenia);
//            
//            if (reseniaActualizada == null) {
//                 throw new Exception("Reseña no encontrada.");
//            }
//            
//            reseniaActualizada.setComentario(nuevoComentario);
//
//            reseniaBO.actualizarResenia(reseniaActualizada); 
//            
//            response.sendRedirect(request.getContextPath() + "/MostrarReseniasServlet");
//
//        } catch (Exception e) {
//            mensaje = "Error interno al guardar el comentario.";
//            request.getSession().setAttribute("mensajeEstado", mensaje);
//            
//            response.sendRedirect(request.getContextPath() + "/MostrarReseniasServlet");
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

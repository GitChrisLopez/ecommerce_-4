///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package controladores;
//
//import BOs.ReseniaBO;
//import dominio.Resenia;
//import java.io.IOException;
//import java.io.PrintWriter;
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
//@WebServlet(name = "EditarReseniaServlet", urlPatterns = {"/EditarReseniaServlet"})
//public class EditarReseniaServlet extends HttpServlet {
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
//            out.println("<title>Servlet EditarReseniaServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet EditarReseniaServlet at " + request.getContextPath() + "</h1>");
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
//        
//        String parametro = request.getParameter("id");
//        if (parametro == null || parametro.isEmpty()) {
//            request.setAttribute("errorCarga", "Error: No se proporcionó el ID de la reseña a editar.");
//            request.getRequestDispatcher("/MostrarReseniasServlet").forward(request, response);
//            return;
//        }
//
//        try {
//            Long idResenia = Long.valueOf(parametro);
//
//            Resenia resenia = reseniaBO.obtenerReseniaPorId(idResenia);
//
//            if (resenia != null) {
//                request.setAttribute("resenia", resenia);
//                request.getRequestDispatcher("/admin-editar-resenia.jsp").forward(request, response);
//            } else {
//                request.setAttribute("errorCarga", "Error: La reseña con ID " + idResenia + " no fue encontrada.");
//                request.getRequestDispatcher("/MostrarReseniasServlet").forward(request, response);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            request.setAttribute("errorCarga", "Error interno al intentar cargar la reseña para edición.");
//            request.getRequestDispatcher("/MostrarReseniasServlet").forward(request, response);
//        }
//
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
//        processRequest(request, response);
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

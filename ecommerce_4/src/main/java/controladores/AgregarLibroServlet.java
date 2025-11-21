package controladores;

import definiciones.IAutoresBO;
import definiciones.ICategoriasBO;
import definiciones.IEditorialesBO;
import definiciones.ILibrosBO;
import dominio.AutorDTO;
import dominio.CategoriaDTO;
import dominio.EditorialDTO;
import dominio.LibroDTO;
import fabrica.FabricaBO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author norma
 */
@WebServlet(name = "AgregarLibroServlet", urlPatterns = {"/admin-agregar-libro"})
public class AgregarLibroServlet extends HttpServlet {

    private ILibrosBO librosBO;
    private IEditorialesBO editorialBO;
    private IAutoresBO autorBO;
    private ICategoriasBO categoriaBO;

    @Override
    public void init() throws ServletException {
        super.init();

        this.librosBO = FabricaBO.obtenerLibrosBO();
        this.editorialBO = FabricaBO.obtenerEditorialesBO();
        this.autorBO = FabricaBO.obtenerAutoresBO();
        this.categoriaBO = FabricaBO.obtenerCategoriasBO();
    }

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
            out.println("<title>Servlet AgregarLibroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgregarLibroServlet at " + request.getContextPath() + "</h1>");
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
        try {

            LocalDate fechaPublicacion = null;

            // Se obtienen los datos ingresados.
            String idEditorialStr = request.getParameter("id-editorial");
            String idAutorStr = request.getParameter("id-autor");
            String idCategoriaStr = request.getParameter("id-categoria");

            String titulo = request.getParameter("titulo");
            String fechaPublicacionStr = request.getParameter("fecha-publicacion");

            try {
                fechaPublicacion = LocalDate.parse(fechaPublicacionStr);
            } catch (java.time.format.DateTimeParseException e) {
                System.err.println("Formato de fecha inválido: " + fechaPublicacionStr);
            }

            String sinopsis = request.getParameter("sinopsis");

            // Encontrar editorial
            if (idEditorialStr == null || idEditorialStr.isEmpty()) {
                throw new IllegalArgumentException("Debe seleccionar una editorial.");
            }
            Long idEditorial = Long.valueOf(idEditorialStr);
            EditorialDTO editorialEncontrada = editorialBO.consultarEditorial(idEditorial);

            // Encontrar autor
            if (idAutorStr == null || idAutorStr.isEmpty()) {
                throw new IllegalArgumentException("Debe seleccionar un autor.");
            }
            Long idAutor = Long.valueOf(idAutorStr);
            AutorDTO autorEncontrado = autorBO.consultarAutor(idAutor);

            // Encontrar categoria
            if (idCategoriaStr == null || idCategoriaStr.isEmpty()) {
                throw new IllegalArgumentException("Debe seleccionar una categoria.");
            }
            Long idCategoria = Long.valueOf(idCategoriaStr);
            CategoriaDTO categoriaEncontrada = categoriaBO.consultarCategoria(idCategoria);

            // Se crea dto con los datos nuevos del libro.
            LibroDTO libroDTO = new LibroDTO();
            libroDTO.setTitulo(titulo);
            libroDTO.setAutor(autorEncontrado);

            List<CategoriaDTO> categoriasLibro = new ArrayList<>();
            categoriasLibro.add(categoriaEncontrada);
            libroDTO.setCategorias(categoriasLibro);

            libroDTO.setEditorial(editorialEncontrada);
            libroDTO.setFechaPublicacion(fechaPublicacion);
            libroDTO.setSinopsis(sinopsis);

            librosBO.registrarLibro(libroDTO);

            // Como el registro fue exitoso, se elimina cualquier producto pendiente y error guardados
            // en la sesión.
            request.getSession().removeAttribute("libroPendienteAgregar");
            request.getSession().removeAttribute("errorSesion");

            response.sendRedirect("admin-libros-registrados");

        } catch (Exception e) {

            e.printStackTrace();
            // Se guardan los datos ingresados por el usuario.
            LibroDTO libroPendienteAgregar = new LibroDTO();
            try {

                libroPendienteAgregar.setTitulo(request.getParameter("titulo"));
                libroPendienteAgregar.setSinopsis(request.getParameter("sinopsis"));

                try {
                    libroPendienteAgregar.setFechaPublicacion(LocalDate.parse(request.getParameter("fecha-publicacion")));
                } catch (Exception ex) {

                }

                String idAutorStr = request.getParameter("id-autor");
                if (idAutorStr != null && !idAutorStr.isEmpty()) {
                    Long idAutorPendiente = Long.valueOf(idAutorStr);
                    AutorDTO autor = autorBO.consultarAutor(idAutorPendiente);
                    libroPendienteAgregar.setAutor(autor);
                } else {
                    libroPendienteAgregar.setAutor(new AutorDTO());
                }

                String idEditorialStr = request.getParameter("id-editorial");
                if (idEditorialStr != null && !idEditorialStr.isEmpty()) {
                    Long idEditorialPendiente = Long.valueOf(idEditorialStr);
                    EditorialDTO editorial = editorialBO.consultarEditorial(idEditorialPendiente);
                    libroPendienteAgregar.setEditorial(editorial);
                } else {
                    libroPendienteAgregar.setEditorial(new EditorialDTO());
                }

                String idCategoriaStr = request.getParameter("id-categoria");
                if (idCategoriaStr != null && !idCategoriaStr.isEmpty()) {
                    Long idCategoriaPendiente = Long.valueOf(idCategoriaStr);
                    CategoriaDTO categoria = categoriaBO.consultarCategoria(idCategoriaPendiente);
                    List<CategoriaDTO> categoriasLibro = new ArrayList<>();
                    categoriasLibro.add(categoria);
                    libroPendienteAgregar.setCategorias(categoriasLibro);
                } else {
                    List<CategoriaDTO> categoriasLibro = new ArrayList<>();
                    categoriasLibro.add(new CategoriaDTO()); 
                    libroPendienteAgregar.setCategorias(categoriasLibro);
                }

            } catch (Exception ex) {
            }

            // Se guarda el libro pendiente en la sesión y el mensaje de error.
            HttpSession session = request.getSession();
            session.setAttribute("libroPendienteAgregar", libroPendienteAgregar);
            session.setAttribute("errorSesion", e.getMessage());

            response.sendRedirect("admin-nuevo-libro");
        }
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

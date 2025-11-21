<%--
Document : comunidad
Created on : 19 nov 2025, 4:10:47 p.m.
Author : chris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Agregar Libro</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-agregar-libro.css"/>
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/AdminNavBar.jspf" %>
            </div>

            <main>
                <div class="general-container">
                    <div class="container-add-edition">
                        <div class="title-container">
                            <h1>Agregar libro</h1>
                        </div>

                        <form class="form-add-edition" id="form-add-edition" action="admin-nuevo-libro" method="POST">
                            
                            <div>
                                <label>Título: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    name="titulo" value="${libroAgregar.titulo}" required
                                    />
                            </div>

                            <div>
                                <label>Autor: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    name="nombreAutor" value="${libroAgregar.nombreAutor}" readonly
                                    required
                                    />
                                <a href="admin-autores-registrados.jsp">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                                <input type="hidden" name="idAutor" value="${libroAgregar.idAutor}"/> 
                            </div>

                            <div>
                                <label>Categoría: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    name="nombreCategoria" value="${libroAgregar.nombreCategoria}" readonly
                                    required
                                    />
                                <a href="admin-categorias-registradas.jsp">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                                <input type="hidden" name="idCategoria" value="${libroAgregar.idCategoria}"/>
                            </div>

                            <div>
                                <label>Editorial: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    name="nombreEditorial" value="${libroAgregar.nombreEditorial}" readonly
                                    required
                                    />
                                <a href="editoriales-registradas.jsp">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                                <input type="hidden" name="idEditorial" value="${libroAgregar.idEditorial}"/>
                            </div>

                            <div>
                                <label>Publicación: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="date"
                                    name="fechaPublicacion" value="${libroAgregar.fechaPublicacion}" required
                                    />
                            </div>

                            <div class="div-synopsis">
                                <label>Sinopsis: </label>
                                <textarea
                                    class="input-form-add-edition"
                                    name="sinopsis" maxlength="350"
                                    required
                                    >${libroAgregar.sinopsis}</textarea
                                >
                            </div>

                            <div class="buttons-cancel-add-edition">
                                <input type="button" value="Cancelar" class="cancel-input" />
                                <input
                                    type="submit"
                                    value="Agregar"
                                    class="add-edition-input add-input"
                                    />
                            </div>
                        </form>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>
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

                        <form class="form-add-edition" id="form-add-edition" action="admin-agregar-libro" method="POST">

                            <div>
                                <label>Título: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    name="titulo" value="${libroAgregar.titulo}" required
                                    />
                            </div>

                            <div class="seleccionar-autor">
                                <label>Autor</label>
                                <select name="id-autor" class="form-control" required>
                                    <option value=""> Seleccionar Autor </option>
                                    <c:forEach var="autor" items="${listaAutores}">
                                        <option value="${autor.id}" ${libroAgregar.autor.id == autor.id ? 'selected' : ''}>
                                            <c:out value="${autor.nombre}" />
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="seleccionar-categoria">
                                <label>Categoria</label>
                                <select name="id-categoria" class="form-control" required>
                                    <option value=""> Seleccionar Categoria </option>
                                    <c:forEach var="categoria" items="${listaCategorias}">
                                        <option value="${categoria.id}" ${libroAgregar.categoria.id == categoria.id ? 'selected' : ''}>
                                            <c:out value="${categoria.nombre}" />
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="seleccionar-editorial">
                                <label>Editorial</label>
                                <select name="id-editorial" class="form-control" required>
                                    <option value=""> Seleccionar Editorial </option>
                                    <c:forEach var="editorial" items="${listaEditoriales}">
                                        <option value="${editorial.id}" ${libroAgregar.editorial.id == editorial.id ? 'selected' : ''}>
                                            <c:out value="${editorial.nombre}" />
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div>
                                <label>Publicación: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="date"
                                    name="fecha-publicacion" value="${libroAgregar.fechaPublicacion}" required
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
                                <a href="admin-libros-registrados">
                                    <input type="button" value="Cancelar" class="cancel-input" />
                                </a>
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
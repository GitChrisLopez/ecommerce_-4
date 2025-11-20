<%-- 
Document   : comunidad
Created on : 19 nov 2025, 4:10:47 p.m.
Author     : chris
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

                        <form class="form-add-edition" id="form-add-edition">
                            <div>
                                <label>Título: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="El Último Secreto"
                                    required
                                    />
                            </div>

                            <div>
                                <label>Autor: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Dan Brown"
                                    readonly
                                    required
                                    />
                                <a href="admin-autores-registrados.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Categoría: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Thriller"
                                    readonly
                                    required
                                    />
                                <a href="admin-categorias-registradas.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Editorial: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Editorial Planeta"
                                    readonly
                                    required
                                    />
                                <a href="editoriales-registradas.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Publicación: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="date"
                                    value="2025-09-09"
                                    required
                                    />
                            </div>

                            <div class="div-synopsis">
                                <label>Sinopsis: </label>
                                <textarea
                                    class="input-form-add-edition"
                                    maxlength="350"
                                    required
                                    >
                                    En El último secreto, el profesor de simbología Robert Langdon se ve envuelto en una carrera contrarreloj en Praga tras el brutal asesinato de su colega, Katherine Solomon...
                                </textarea
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

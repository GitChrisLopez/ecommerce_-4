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
        <title>Agregar Categoría</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-admin-agregar.css" />
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
                            <h1>Agregar categoría</h1>
                        </div>

                        <form
                            action="admin-categorias-registradas.html"
                            class="form-add-edition"
                            id="form-add-edition"
                            >
                            <div class="name-container">
                                <label>Nombre:</label>
                                <input type="text" maxlength="50" required />
                            </div>
                        </form>

                        <div class="buttons-cancel-add-edition">
                            <a href="admin-categorias-registradas.html">
                                <input type="button" value="Cancelar" class="cancel-input" />
                            </a>

                            <input
                                type="submit"
                                value="Agregar"
                                class="add-edition-input add-input"
                                form="form-add-edition"
                                />
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>


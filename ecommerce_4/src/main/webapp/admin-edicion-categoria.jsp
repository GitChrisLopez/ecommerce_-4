<%-- 
    Document   : carrito
    Created on : 19 nov 2025, 10:26:26 p.m.
    Author     : chris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Categoría</title>
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
                            <h1>Editar categoría</h1>
                        </div>

                        <form action="admin-categorias-registradas.jsp" class="form-add-edition" id="form-add-edition">
                            <div class="name-container">
                                <label>Nombre:</label>
                                <input type="text" value="Drama" maxlength="50" required />
                            </div>
                        </form>

                        <div class="buttons-cancel-add-edition">
                            <a href="admin-categorias-registradas.jsp">
                                <input type="button" value="Cancelar" class="cancel-input"/>
                            </a>
                            <input type="submit" value="Guardar" class="add-edition-input add-input" form="form-add-edition" />
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

<%-- 
Document   : comunidad
Created on : 19 nov 2025, 4:10:47 p.m.
Author     : chris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>

    <head>
        <title>Editar Autor</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-add-edition.css">
    </head>

    <body>
        <main>
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/AdminNavBar.jspf" %>
            </div>

            <div class="container-add-edition">

                <div class="title-container">
                    <h1>Editar autor</h1>
                </div>

                <form class="form-add-edition" id="form-add-edition">

                    <div class="name-container">
                        <label>Nombre:</label>
                        <input type="text" value="Leonardo" maxlength="50" required>
                    </div>

                    <div class="last-name-1-container">
                        <label>Apellido paterno:</label>
                        <input type="text" value="Padura" maxlength="50" required>
                    </div>

                    <div class="last-name-2-container">
                        <label>Apellido materno:</label>
                        <input type="text" value="Fuentes" maxlength="50">
                    </div>

                </form>

                <div class="buttons-cancel-add-edition">
                    <input type="button" value="Cancelar" class="cancel-input" form="form-add-edition">
                    <input type="submit" value="Guardar" class="add-edition-input edition-input" form="form-add-edition">
                </div>
            </div>

        </main>
    </body>

</html>

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
        <title>Agregar Autor</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-admin-agregar.css"
              />
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
                            <h1>Agregar autor</h1>
                        </div>

                        <form action="admin-autores-registrados.jsp" class="form-add-edition" id="form-add-edition">
                            <div class="name-container">
                                <label>Nombre: </label>
                                <input type="text" value="Jorge Luis" maxlength="50" required />
                            </div>

                            <div class="last-name-1-container">
                                <label>Apellido paterno: </label>
                                <input type="text" value="Borges" maxlength="50" required />
                            </div>

                            <div class="last-name-2-container">
                                <label>Apellido materno: </label>
                                <input type="text" value="Acevedo" maxlength="50" />
                            </div>
                        </form>

                        <div class="buttons-cancel-add-edition">
                            <a href="admin-autores-registrados.jsp">
                                <input type="button" value="Cancelar" class="cancel-input" form="form-add-edition" />
                            </a>

                            <input type="submit" value="Agregar" class="add-edition-input add-input" form="form-add-edition"/>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

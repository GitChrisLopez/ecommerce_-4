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
        <title>Autores Registrados</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-registrado.css">
    </head>

    <body>
        <main>
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/AdminNavBar.jspf" %>
            </div>

            <div class="container-registered">

                <div class="title-search">

                    <h1>Autores registrados</h1>

                    <div class="search-bar">
                        <input type="search" placeholder="Buscar" id="input-search">
                        <label for="input-search">
                            <img src="./icons/lupa.png">    
                        </label>
                    </div>

                </div>

                <form action="edicion-libro.jsp" class="container-list" id="form">


                    <input type = "radio" id="leonardo-padura" name="autor" required>
                    <label for="leonardo-padura">
                        <p>Leonardo Padura Fuentes</p>
                        <a href="admin-edicion-autor.jsp">
                            <img src="icons/edition.png"> 
                        </a>
                    </label>


                    <input type = "radio" id="dan-brown" name="autor">
                    <label for="dan-brown">
                        <p>Dan Brown</p>
                        <a href="admin-edicion-autor.jsp">
                            <img src="icons/edition.png">          
                        </a>
                    </label>

                    <input type = "radio" id="george-orwell" name="autor">        
                    <label for="penguinrandom">
                        <p>George Orwell</p>
                        <a href="admin-edicion-autor.jsp">
                            <img src="icons/edition.png">       
                        </a>
                    </label>

                    <input type = "radio" id="antoine-exupery" name="autor">
                    <label for="antoine-exupery">
                        <p>Antoine de Saint-Exupary</p>
                        <a href="admin-edicion-autor.jsp">
                            <img src="icons/edition.png">           
                        </a>
                    </label>

                </form>

                <div class="buttons">

                    <div class="button-add">
                        <a href="admin-agregar-autor.jsp">
                            <input type="submit" value="Agregar" class="add-input">
                        </a>

                    </div>

                    <div class="buttons-cancel-save">
                        <a href="edicion-libro.jsp">
                            <input type="submit" value="Cancelar" class="cancel-input">
                        </a>
                        <input type="submit" value="Guardar" class="save-input" form="form">
                    </div>
                </div>

            </div>

        </main>
    </body>
</html>

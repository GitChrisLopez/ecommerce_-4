<%-- 
    Document   : carrito
    Created on : 19 nov 2025, 10:26:26 p.m.
    Author     : chris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Libros Registrados</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-registrado.css">
    </head>

    <body>
        <main>
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <div class="container-registered">

                <div class="title-search">

                    <h1>Libros registrados</h1>

                    <div class="search-bar">
                        <input type="search" placeholder="Buscar" id="input-search">
                        <label for="input-search">
                            <img src="./icons/lupa.png">    
                        </label>
                    </div>

                </div>

                <form action="admin-agregar-producto.html" class="container-list" id="form">

                    <input type = "radio" id="morir-arena" name="registered" required>
                    <label for="morir-arena">
                        <p>Morir en la arena (Andanzas)</p>
                        <a href="edicion-libro.html">
                            <img src="icons/edition.png">  
                        </a>                      
                    </label>

                    <input type = "radio" id="novela-vida" name="registered">
                    <label for="novela-vida">
                        <p>La novela de mi vida (Andanzas)</p>
                        <a href="edicion-libro.html">
                            <img src="icons/edition.png">  
                        </a>
                    </label>

                    <input type = "radio" id="ultimo-secreto" name="registered">
                    <label for="ultimo-secreto">
                        <p>El Ãltimo Secreto</p>
                        <a href="edicion-libro.html">
                            <img src="icons/edition.png">  
                        </a>                        
                    </label>
                </form>

                <div class="buttons">

                    <div class="button-add">
                        <a href="admin-agregar-libro.html">
                            <input type="submit" value="Agregar" class="add-input">
                        </a>
                    </div>

                    <div class="buttons-cancel-save">
                        <a href="admin-agregar-producto.html">
                            <input type="submit" value="Cancelar" class="cancel-input">
                        </a>
                        <input type="submit" value="Guardar" class="save-input" form="form">
                    </div>
                </div>

            </div>

        </main>
    </body>
</html>
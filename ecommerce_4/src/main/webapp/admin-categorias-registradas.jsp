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
        <title>Categori­as Registradass</title>
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

                    <h1>Categori­as registradas</h1>

                    <div class="search-bar">
                        <input type="search" placeholder="Buscar" id="input-search">
                        <label for="input-search">
                            <img src="./icons/lupa.png">    
                        </label>
                    </div>

                </div>

                <form action="edicion-libro.html" class="container-list" id="form">


                    <input type = "radio" id="thriller" name="registered" required>
                    <label for="thriller">
                        <p>Thriller</p>
                        <a href="edicion-categoria.html">
                            <img src="icons/edition.png"> 
                        </a>
                    </label>


                    <input type = "radio" id="terror" name="registered">
                    <label for="terror">
                        <p>Terror</p>
                        <a href="edicion-categoria.html">
                            <img src="icons/edition.png">          
                        </a>
                    </label>

                    <input type = "radio" id="drama" name="registered">        
                    <label for="drama">
                        <p>Drama</p>
                        <a href="edicion-categoria.html">
                            <img src="icons/edition.png">       
                        </a>
                    </label>

                    <input type = "radio" id="ciencia-ficcion" name="registered">
                    <label for="ciencia-ficcion">
                        <p>Ciencia ficcion</p>
                        <a href="edicion-categoria.html">
                            <img src="icons/edition.png">           
                        </a>
                    </label>

                    <input type = "radio" id="biografia" name="registered">
                    <label for="biografia">
                        <p>Biografi­a</p>
                        <a href="edicion-categoria.html">
                            <img src="icons/edition.png">            
                        </a>
                    </label>
                </form>

                <div class="buttons">

                    <div class="button-add">
                        <a href="admin-agregar-categoria.html">
                            <input type="submit" value="Agregar" class="add-input">
                        </a>

                    </div>

                    <div class="buttons-cancel-save">
                        <a href="edicion-libro.html">
                            <input type="submit" value="Cancelar" class="cancel-input">
                        </a>
                        <input type="submit" value="Guardar" class="save-input" form="form">
                    </div>
                </div>

            </div>

        </main>
    </body>
</html>

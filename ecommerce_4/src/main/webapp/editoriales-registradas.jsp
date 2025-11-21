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
        <title>Editoriales Registradas</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-registrado.css">
    </head>

    <body>
        <main>
            <div class="c1">
                <%@ include file="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <div class="container-registered">
                <div class="title-search">
                    <h1>Categorías registradas</h1>
                    <div class="search-bar">
                        <input type="search" placeholder="Buscar" id="input-search">
                        <label for="input-search">
                            <img src="./icons/lupa.png">    
                        </label>
                    </div>
                </div>

                <form action="edicion-libro.html" class="container-list" id="form">

                    <input type="radio" id="tusquets" name="editorial" required>
                    <label for="tusquets">
                        <p>TusQuets Editores</p>
                        <a href="edicion-editorial.jsp">
                            <img src="icons/edition.png"> 
                        </a>
                    </label>

                    <input type="radio" id="planeta" name="editorial">
                    <label for="planeta">
                        <p>Editorial Planeta</p>
                        <a href="edicion-editorial.jsp">
                            <img src="icons/edition.png">          
                        </a>
                    </label>

                    <input type="radio" id="penguinrandom" name="editorial">        
                    <label for="penguinrandom">
                        <p>Pengüin Random House</p>
                        <a href="edicion-editorial.jsp">
                            <img src="icons/edition.png">       
                        </a>
                    </label>

                    <input type="radio" id="grijalbo" name="editorial">
                    <label for="grijalbo">
                        <p>Grijalbo</p>
                        <a href="edicion-editorial.jsp">
                            <img src="icons/edition.png">           
                        </a>
                    </label>
                </form>

                <div class="buttons">

                    <div class="button-add">
                        <a href="admin-agregar-editorial.jsp">
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


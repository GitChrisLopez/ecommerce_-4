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
        <title>Catálogo</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-catalogo-menu-administrador.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <main>
                <div class="c2">

                    <div class="catalogo-container">

                        <form class="sidebar">

                            <div class="options-lookup">
                                <div class="search-filtros">
                                    <a href="./catalogo-filtros-mobile.jsp" class="filtrar-btn">
                                        <img src="./icons/filtro.png" alt="Filtro" class="icono-filtro">
                                        <span>Filtrar</span>
                                    </a>
                                </div>
                                <div class="search-box">
                                    <input type="text" placeholder="Buscar por libro o autor">
                                </div>
                            </div>

                            <input type="submit" value="Aplicar filtros" class="btn-aplicar-filtros">

                            <div class="filtros">
                                <h2>Categoría</h2>
                                <label><input type="checkbox" checked> Thriller</label>
                                <label><input type="checkbox" checked> Terror</label>
                                <label><input type="checkbox" checked> Drama</label>
                                <label><input type="checkbox"> Ciencia ficción</label>
                                <label><input type="checkbox"> Biografía</label>
                            </div>

                            <div class="filtros">
                                <h2>Formato</h2>
                                <label><input type="checkbox" checked> Tapa dura</label>
                                <label><input type="checkbox" checked> Tapa blanda</label>
                                <label><input type="checkbox"> Bolsillo</label>
                                <label><input type="checkbox"> E-Book</label>
                            </div>

                            <div class="filtros">
                                <h2>Precio</h2>
                                <p>Mínimo: $100</p>
                                <input type="range" min="100" max="800" value="100">
                                <p>Máximo: $800</p>
                                <input type="range" min="100" max="800" value="800">
                            </div>

                        </form>

                        <div class="area-total-container">
                            <div class="libros-container">

                                <button class="libro">
                                    <a href="./resenia-del-producto.jsp">
                                        <img src="./imgs/morir-en-la-arena.png" alt="Morir en la arena">
                                        <h3>Morir en la arena</h3>
                                        <p>Leonardo Padura</p>
                                        <p class="precio">$250.00</p>
                                    </a>
                                </button>

                                <button class="libro">
                                    <a href="./resenia-del-producto.jsp">
                                        <img src="./imgs/la-novela-de-mi-vida.png" alt="La novela de mi vida (Andanzas)">
                                        <h3>La novela de mi vida (Andanzas)</h3>
                                        <p>Leonardo Padura</p>
                                        <p class="precio">$300.00</p>
                                    </a>
                                </button>

                                <button class="libro">
                                    <a href="./resenia-del-producto.jsp">
                                        <img src="./imgs/el-ultimo-secreto.png" alt="El Último Secreto">
                                        <h3>El Último Secreto</h3>
                                        <p>Dan Brown</p>
                                        <p class="precio">$310.00</p>
                                    </a>
                                </button>

                            </div>
                        </div>
                    </div> 
                </div>
            </main>
        </div>
    </body>    
</html>

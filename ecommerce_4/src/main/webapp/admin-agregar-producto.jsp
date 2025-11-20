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
        <title>Agregar Producto</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-agregar-producto.css"/>
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/AdminNavBar.jspf" %>
            </div>

            <main>
                <div class="general-container">
                    <div class="container-add-edition">
                        <div class="image-container">
                            <img
                                src="imgs/el-principito.jpg"
                                alt="Producto Libro El Principito"
                                class="product-image"
                                />
                            <div class="container-icon-add-edition">
                                <img src="icons/edition.png" alt="Editar imagen" />
                            </div>
                        </div>

                        <form action="admin-menu-administrador.html" class="form-add-edition" id="form-add-edition">
                            <div class="seleccionar-libro">
                                <label>Libro:</label>
                                <input type="text" value="El Principito" readonly />
                                <a href="libros-registrados.html"><button class="btn-seleccionar" type="button">Seleccionar</button></a>

                            </div>

                            <div>
                                <label>Formato:</label>
                                <select>
                                    <option>Tapa blanda</option>
                                    <option>Tapa dura</option>
                                    <option>E-Book</option>
                                </select>
                            </div>

                            <div>
                                <label>No. de páginas:</label>
                                <input type="number" min="1" value="96" />
                            </div>

                            <div>
                                <label>Precio:</label>
                                <input type="number" min="1" step="0.01" value="70.50" />
                                <span>pesos</span>
                            </div>

                            <div>
                                <label>Stock:</label>
                                <input type="number" min="0" value="2" />
                            </div>

                            <div class="buttons-cancel-add-edition">
                                <a href="admin-menu-administrador.html">
                                    <input type="button" value="Cancelar" class="cancel-input" />
                                </a>
                                <input type="submit" value="Agregar" class="add-edition-input add-input"/>
                            </div>
                            <br/>
                        </form>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

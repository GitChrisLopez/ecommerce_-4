<%-- 
    Document   : admin-menu-administrador
    Created on : 18 nov 2025, 17:20:51
    Author     : romom
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

    <head>
        <title>Menú principal - Administrador</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-catalogo-menu-administrador.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <nav>
                    <a href="./principal-registrado.html">
                        <div class="home">
                            <img src="./icons/home.svg" alt="home" class="home-icon"> 
                        </div>
                    </a>

                    <ul class="nav-links">
                        <li>
                            <a href="./catalogo.html" class="nav-btn" target="_blank">Catálogo</a>
                        </li>
                        <li>
                        <div class="carrito">
                                <img src="./icons/carrito.png" alt="carrito" class="carrito-icon"> 
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="./icons/user.png" alt="user" class="user-icon"> 
                            </div>
                        </li>
                        <li>
                            <a href="./catalogo.html">
                                <div class="catalogo">
                                    <img src="./icons/catalogo.png" alt="catalogo" class="catalogo-icon"> 
                                </div>
                            </a>
                        </li>
                        <li>
                            <div class="pedidos">
                                <img src="./icons/pedidos.png" alt="pedidos" class="pedidos-icon"> 
                            </div>
                        </li>
                    </ul>
                </nav>
            </div> 
            
            <main>
                <div class="c2">

                    <div class="catalogo-container">

                        <div class="sidebar">
                            <div class="options-lookup">
                                <div class="search-filtros">
                                    <a href="./catalogo-filtros-mobile.html" class="filtrar-btn">
                                        <img src="./icons/filtro.png" alt="Filtro" class="icono-filtro"> 
                                        <span>Filtrar</span>
                                    </a>
                                </div>
                                <div class="search-box">
                                    <input type="text" placeholder="Buscar por Libro o Autor">
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

                        </div>

                        <div class="button-add-container">
                            <a href="admin-agregar-producto.html">
                                <button type="button">Agregar producto</button>
                            </a>
                        </div>
                        
                        <div class="area-total-container">
                            <div class="libros-container">
                                
                                <c:choose>
                                    
                                    <c:when test="${empty listaProductos}">
                                        
                                        <div>No hay productos registrados.</div>
                                        
                                    </c:when>
                                        
                                    <c:otherwise>
                                        
                                        <c:forEach var="producto" items="${listaProductos}">
                                            
                                            <button class="libro">
                                                <img src="${pageContext.request.contextPath}/${producto.urlImagen}" 
                                                    alt="${producto.libro.titulo}" />
                                                <h3><c:out value="${producto.libro.titulo}" /></h3>
                                                <p><c:out value="${producto.libro.autor.nombre}" /> <c:out value="${producto.libro.autor.apellidoPaterno}" /></p>

                                                <p class="precio">$<c:out value="${producto.precio}" /></p>

                                                <div class="options-product">
                                                    <a href="edicion-producto?id=${producto.id}">Editar datos</a>
                                                </div>

                                            </button>

                                        </c:forEach>

                                    </c:otherwise>
                                    
                                </c:choose>

                            </div>
                        </div>
                    </div> 
                </div>
        </main>
    </body>    
</html>



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
                            <a href="./users.html">
                                <div class="users">
                                    <img src="./icons/users.png" alt="usuarios" class="users-icon"> 
                                </div>
                            </a>
                        </li>
                        <li>
                            <div class="pedidos">
                                <img src="./icons/pedidos.png" alt="pedidos" class="pedidos-icon"> 
                            </div>
                        </li>
                        <li>
                            <div class="payments">
                                <img src="./icons/payments.png" alt="Pagos" class="payments-icon"> 
                            </div>
                        </li>
                    </ul>
                </nav>
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

                <form action="admin-editar-libro" class="container-list" id="form">

                    <c:if test="${empty listaLibros}">
                        <p>No hay libros registrados.</p>
                    </c:if>

                    <c:forEach var="libro" items="${listaLibros}" varStatus="status">

                        <input type="radio" 
                               id="libro_${status.index}" 
                               name="titulo-libro" 
                               value="${libro.titulo}" 
                               required>

                        <label for="libro_${status.index}">

                            <p>
                                <c:out value="${libro.titulo}" />
                                <br>
                                <span>
                                    Autor: <c:out value="${libro.autor.nombre}"/> <c:out value="${libro.autor.apellidoPaterno}" />
                                </span>
                            </p>

                            <a href="admin-editar-libro?titulo=${libro.titulo}">
                                <img src="icons/edition.png" alt="Editar libro" title="Editar libro">  
                            </a>                      
                        </label>

                    </c:forEach>

                </form>
                
                <div class="buttons">

                    <div class="buttons-cancel-save">
                        <a href="menu-principal-admin">
                            <input type="submit" value="Cancelar" class="cancel-input">
                        </a>
                        
                        <a href="admin-agregar-libro.html">
                            <input type="submit" value="Agregar" class="add-input">
                        </a>
                    </div>
                </div>

            </div>

        </main>
    </body>
</html>

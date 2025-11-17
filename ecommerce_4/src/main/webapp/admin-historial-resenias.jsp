<%--
    Document : admin-historial-resenias
    Created on : 16 nov 2025
    Author : norma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Historial de Reseñas</title>
        <meta charset="UTF-8" />
        <link
            rel="stylesheet"
            type="text/css"
            href="./styles/styles-historial-resenias-admin.css"
            />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />

        <script>
            function confirmarEliminacion(id) {
                if (confirm("¿Estás seguro de que quieres eliminar la reseña")) {
                    document.getElementById('form-eliminar-' + id).submit();
                }
                return false;
            }

        </script>

    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <nav>
                    <a href="./principal-registrado.html">
                        <div class="home">
                            <img src="./icons/home.svg" alt="home" class="home-icon" />
                        </div>
                    </a>

                    <ul class="nav-links">
                        <li class="nav-users">
                            <a href="./admin-usuarios.html">
                                <div class="users">
                                    <img src="./icons/users.png" class="users-icon" />
                                    <span class="nav-text">Usuarios</span>
                                </div>
                            </a>
                        </li>

                        <li class="nav-resenias">
                            <a href="./admin-historial-resenias.html">
                                <div class="resenias">
                                    <img src="./icons/catalogo.png" class="catalogo-icon" />
                                    <span class="nav-text">Reseñas</span>
                                </div>
                            </a>
                        </li>

                        <li class="nav-pedidos">
                            <a href="./admin-historial-pedidos.html">
                                <div class="pedidos">
                                    <img src="./icons/pedidos.png" class="pedidos-icon" />
                                    <span class="nav-text">Pedidos</span>
                                </div>
                            </a>
                        </li>

                        <li class="nav-pagos">
                            <a href="./admin-historial-pagos.html">
                                <div class="payments">
                                    <img src="./icons/payments.png" class="payments-icon" />
                                    <span class="nav-text">Pagos</span>
                                </div>
                            </a>
                        </li>

                        <li class="nav-perfil">
                            <button class="user">
                                <img src="./icons/user.png" alt="user" class="user-icon" />
                                <div class="options-user">
                                    <div class="user-nombre">
                                        <p>Carlos Gutiérrez Torres</p>
                                    </div>
                                    <hr class="separador" />

                                    <a class="user-option" href="pedidos-realizados.html">
                                        <img src="./icons/mis-pedidos.png" class="option-icon" />
                                        <p>Mis Pedidos</p>
                                    </a>

                                    <a class="user-option" href="edicion-datos-cuenta.html">
                                        <img src="./icons/edition.png" class="option-icon" />
                                        <p>Editar mis datos</p>
                                    </a>

                                    <a class="user-option" href="direcciones-guardadas.html">
                                        <img src="./icons/direccion.png" class="option-icon" />
                                        <p>Direcciones</p>
                                    </a>

                                    <a class="user-option" href="//">
                                        <img src="./icons/cerrar-sesion.png" class="option-icon" />
                                        <p>Cerrar sesión</p>
                                    </a>
                                </div>
                            </button>
                        </li>
                    </ul>
                </nav>
            </div>

            <main>
                <div class="c2">
                    <div class="search-box">
                        <div class="buscador">
                            <input type="text" placeholder="Buscar" />
                        </div>
                    </div>

                    <div class="resenias-container">
                        <h1 class="historial-resenias-title">Historial de Reseñas</h1>

                        <div class="lista-resenias">

                            <c:forEach var="resenia" items="${listaResenias}">

                                <div class="resenia">
                                    <div class="resenia-info">
                                        <p><span>Producto:</span> ${resenia.libro.titulo} (${resenia.formato})</p>
                                        <p><span>Usuario:</span> ${resenia.cliente.nombre}</p>
                                        <p><span>Calificación:</span> ${resenia.calificacion}</p>
                                        <p>
                                            <span>Comentario:</span> "${resenia.comentario}"
                                        </p>
                                        <p><span>Fecha:</span> ${resenia.fecha}</p>
                                    </div>

                                    <div class="resenia-btn">
                                        <a href="${pageContext.request.contextPath}/EditarReseniaServlet?id=${resenia.id}" class="editar-btn">Editar</a>

                                        <form id="form-eliminar-${resenia.id}" 
                                              action="${pageContext.request.contextPath}/EliminarReseniaServlet" 
                                              method="POST" 
                                              style="margin: 0;">

                                            <input type="hidden" name="id" value="${resenia.id}">

                                            <button 
                                                type="button" 
                                                class="eliminar-btn" 
                                                onclick="confirmarEliminacion(${resenia.id});">
                                                Eliminar
                                            </button>
                                        </form>
                                    </div>
                                </div>
                            </c:forEach>

                            <c:if test="${empty listaResenias and empty errorCarga}">
                                <p>No se encontraron reseñas para mostrar.</p>
                            </c:if>

                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>
<%--
    Document   : admin-historial-pedidos
    Created on : 18 nov 2025, 22:45:24
    Author     : norma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Historial de Pedidos</title>
        <meta charset="UTF-8" />
        <link
            rel="stylesheet"
            type="text/css"
            href="./styles/styles-historial-pedidos-admin.css"
            />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
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
                            <a href="${pageContext.request.contextPath}/MostrarPedidosServlet">
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
                        <form action="${pageContext.request.contextPath}/FiltrarPedidosServlet" method="GET"> 
                            <div class="buscador">
                                <input 
                                    type="text" 
                                    name="busqueda" 
                                    placeholder="Buscar por Número de Pedido" 
                                    value="${param.busqueda != null ? param.busqueda : ''}" 
                                    />
                                <button type="submit" style="display:none;">Buscar</button>
                            </div>
                        </form>
                    </div>

                    <div class="pedidos-container">
                        <h1 class="historial-pedidos-title">Historial de pedidos</h1>
                        <div class="lista-pedidos">
                            
                            <c:choose>
                                <c:when test="${not empty listaPedidos}">
                                    <c:forEach var="pedido" items="${listaPedidos}">
                                        <div class="pedido">
                                            <div class="pedido-info">
                                                <div class="info-1">
                                                    <p>Pedido #${pedido.numeroUnico}</p>
                                                    <p>${pedido.cliente.nombre}</p>
                                                    <p>${pedido.estado}</p>
                                                    <p><span>${pedido.metodoPago}</span></p>
                                                </div>
                                                
                                                <div class="info-2">
                                                    <p><span>Total del pedido: </span></p>
                                                    <p>$<c:out value="${pedido.total}"/> MXN</p>
                                                </div>

                                            </div>
                                            <div class="pedido-btn">
                                                <a href="${pageContext.request.contextPath}/DetallesPedidoServlet?id=${pedido.id}" class="detalles-btn">Ver detalles</a>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>
                                    <p>No se encontraron pedidos para mostrar.</p>
                                </c:otherwise>
                            </c:choose>

                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>
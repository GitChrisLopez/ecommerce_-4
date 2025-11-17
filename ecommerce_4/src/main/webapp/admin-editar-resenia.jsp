<%--
    Document : admin-editar-resenia
    Created on : 16 nov 2025, 14:24:23
    Author : norma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Reseña</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-editar-resenia-admin.css">
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

            <main>
                <div class="c2">

                    <c:if test="${not empty resenia}">
                        
                        <div class="resenia-container">
                            
                            <form action="${pageContext.request.contextPath}/ActualizarReseniaServlet" method="POST">
                                
                                <input type="hidden" name="id" value="${resenia.id}">

                                <div class="resenia-item">
                                    <div class="detalles-resenia">
                                        
                                        <p><span>Producto:</span> ${resenia.libro.titulo} (${resenia.formato})</p>
                                        <p><span>Usuario:</span> ${resenia.cliente.nombre}</p>
                                        <p><span>Calificación:</span> ${resenia.calificacion}</p>
                                        <p><span>Fecha:</span> ${resenia.fecha}</p>
                                        
                                        <p><span>Comentario:</span></p>
                                        
                                        <textarea name="comentario" class="comentario-box" rows="4">${resenia.comentario}</textarea>

                                    </div>
                                </div>

                                <div class="resenia-btns">
                                    <a href="${pageContext.request.contextPath}/MostrarReseniasServlet" class="cancelar-btn">Cancelar</a> 
                                    <button type="submit" class="guardar-btn">Guardar</button>
                                </div>
                            </form>
                        </div>
                    </c:if>
                    
                    <c:if test="${empty resenia and empty sessionScope.mensajeEstado}">
                         <p>No se pudo cargar la reseña para editar. Por favor, regrese al historial.</p>
                    </c:if>

                </div>
            </main>
        </div> 
    </body>
</html>
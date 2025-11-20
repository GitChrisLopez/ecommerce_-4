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
        <title>Pedidos Realizados</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-pedidos-realizados.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <main>
                <div class="c2">

                    <div class="pedidos-container">
                        <h1 class="pedidos-title">Pedidos realizados</h1>

                        <div class="lista-pedidos">

                            <div class="pedido1">
                                <div class="pedido-info">
                                    <ul>
                                        <li><span>Pedido</span> #45265897</li>
                                        <li><span>Realizado:</span> 20/10/2025</li>
                                        <li><span>Estado:</span>Enviado</li>
                                        <li><span>Total:</span>$500</li>
                                    </ul>
                                </div>
                                <div class="pedido-btn">
                                    <a href="./detalles-pedido.html" class="ver-detalles-btn">Detalles</a>
                                </div>
                            </div>

                            <div class="pedido2">
                                <div class="pedido-info">
                                    <ul>
                                        <li><span>Pedido</span> #21993534</li>
                                        <li><span>Realizado:</span> 19/10/2025</li>
                                        <li><span>Estado:</span>Pendiente</li>
                                        <li><span>Total:</span>$600</li>
                                    </ul>
                                </div>
                                <div class="pedido-btn">
                                    <a href="./detalles-pedido.html" class="ver-detalles-btn">Detalles</a>
                                </div>
                            </div>

                            <div class="pedido3">
                                <div class="pedido-info">
                                    <ul>
                                        <li><span>Pedido</span> #69587452</li>
                                        <li><span>Realizado:</span> 17/10/2025 </li>
                                        <li><span>Estado:</span>Entregado</li>
                                        <li><span>Total:</span>$1000</li>
                                    </ul>
                                </div>
                                <div class="pedido-btn">
                                    <a href="./detalles-pedido.html" class="ver-detalles-btn">Detalles</a>
                                </div>
                            </div>

                        </div>

                    </div>

                </div>
            </main>

        </div> 
    </body>

</html>
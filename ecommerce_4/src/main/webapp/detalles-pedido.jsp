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
        <title>Detalles Pedido</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-detalles-pedido.css">
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css">
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <main>
                <div class="c2">

                    <div class="pedido-container">
                        <h1 class="pedido-title">Detalles pedido</h1>

                        <div class="general-container">
                            <div class="libro-container">
                                <img src="./imgs/morir-en-la-arena.png" alt="Morir en la arena">
                            </div>

                            <div class="info-pedido-general">
                                <div class="info-libro">
                                    <h3>Morir en la arena (Andanzas)</h3>
                                    <p>Leonardo Padura</p>
                                </div>

                                <div class="info-pedido">
                                    <p><span>NÃºmero de pedido:</span> 82305628</p>
                                    <p><span>Fecha del pedido:</span> 22/10/2025</p>
                                    <p><span>Estado:</span> Enviado</p>
                                    <p><span>MÃ©todo de pago:</span> Transferencia</p>
                                    <p><span>Total del pedido:</span> $350.00 MXN</p>
                                </div>
                            </div>

                        </div>

                        <div class="pedido-btn">
                            <a href="./pedido-realizado-exitosamente.html" class="ver-pedidos-btn">Volver</a>
                        </div>


                    </div>
                </div>
            </main>

        </div> 
    </body>
</html>
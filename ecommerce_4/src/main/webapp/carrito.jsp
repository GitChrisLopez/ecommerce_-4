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
        <title>Carrito</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-carrito.css" />
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <main>
                <div class="area-total-container">
                    <div class="carrito-container">
                        <div class="lista-libros">
                            <div class="carro">

                                <div class="info-libro">
                                    <button type="button" class="btn-eliminar" aria-label="Eliminar del carrito">×</button>
                                    <img src="./imgs/la-novela-de-mi-vida.png" alt="La novela de mi vida (Andanzas)"/>
                                    <div class="detalle-libro">
                                        <h3>La novela de mi vida (Andanzas)</h3>
                                        <p>Formato: Pasta dura</p>
                                        <p>Leonardo Padura</p>
                                        <p class="precio">Precio: $300.00</p>

                                        <form action="proceder-pago.html" class="div-botones">
                                            <input type="number" class="input-cantidad" value="1" min="0" max="3" required/>
                                            <button type="button" class="btn-cantidad-mas">+</button>
                                            <button type="button" class="btn-cantidad-menos">-</button>
                                        </form>
                                    </div>
                                </div>

                                <div class="info-libro">
                                    <button type="button" class="btn-eliminar" aria-label="Eliminar del carrito">×</button>
                                    <img src="./imgs/la-novela-de-mi-vida.png" alt="La novela de mi vida (Andanzas)"/>
                                    <div class="detalle-libro">
                                        <h3>La novela de mi vida (Andanzas)</h3>
                                        <p>Formato: Pasta dura</p>
                                        <p>Leonardo Padura</p>
                                        <p class="precio">Precio: $300.00</p>

                                        <form action="proceder-pago.html" class="div-botones">
                                            <input type="number" class="input-cantidad" value="1" min="0" max="3" required/>
                                            <button type="button" class="btn-cantidad-mas">+</button>
                                            <button type="button" class="btn-cantidad-menos">-</button>
                                        </form>
                                    </div>
                                </div>
                            </div>

                            <div class="acciones acciones-desktop">
                                <p class="subtotal">
                                    Subtotal: <span class="precio">$300.00</span>
                                </p>
                                <form action="proceder-pago.html">
                                    <input type="submit" class="btn-pago" value="Proceder al pago">
                                </form>
                            </div>

                            <div class="acciones acciones-movil">
                                <p class="subtotal">
                                    Subtotal: <span class="precio">$300.00</span>
                                </p>
                                <form action="proceder-pago.html">
                                    <input type="submit" class="btn-pago" value="Proceder al pago">
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

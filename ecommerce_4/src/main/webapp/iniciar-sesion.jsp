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
        <title>Iniciar SesiÃ³n</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/styles-inicio-registro.css">
    </head>

    <body>
        <div class="background">
            <div class="container">
                <div class="arrow-container">
                    <a href="principal-no-registrado.html">
                        <img src="./icons/arrow.png" alt="Volver" class="arrow-icon">
                    </a>
                </div>

                <div class="user-container">
                    <img src="./icons/user.png" alt="user" class="user-icon">
                </div>

                <form class="login-form" method="POST" action="AutorizacionAdminServlet">
                    <label for="email">Correo electrÃ³nico:</label>
                    <input type="email" id="email" name="email" required>

                    <label for="password">ContraseÃ±a:</label>
                    <input type="password" id="password" name="password" required>

                    <button type="submit" class="button">Iniciar sesiÃ³n</button>

                    <p class="login-info-text">
                        Â¿No tienes una cuenta? <a href="registro.html" class="link"><br>Registrarse</a>
                    </p>
                </form>            
            </div>
        </div>
    </body>
</html>
<%-- 
    Document   : carrito
    Created on : 19 nov 2025, 10:26:26 p.m.
    Author     : chris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8" />
        <title>Detalles Producto</title>
        <link rel="stylesheet" href="./styles/styles-detalles-producto.css" />
        <link rel="stylesheet" href="./styles/styles-nav.css" />
    </head>

    <body>
        <div class="body-container">
            <div class="c1">
                <%@ include file ="/WEB-INF/fragmentos/NavBar.jspf" %>
            </div>

            <main>
                <div class="producto-container">
                    <div class="info-libro">
                        <img src="./imgs/morir-en-la-arena.png" alt="Morir en la arena (Andanzas)" />
                        <div class="detalles-libro">
                            <h3>Morir en la arena (Andanzas)</h3>
                            <label>Autor: Leonardo Padura</label>
                            <div class="calificacion">
                                <p>3</p>
                                <div class="estrella"></div>
                                <div class="estrella"></div>
                                <div class="estrella"></div>
                                <div class="estrella"></div>
                            </div>
                            <p class="p-editorial">Editorial: TusQuets Editores</p>
                            <p class="p-publicacion">PublicaciÃ³n: 23 de septiembre, 2025</p>
                            <p class="p-no-paginas">384 PÃ¡ginas</p>
                            <p class="p-formato">Tapa Blanda</p>
                            <p class="p-precio">$250.00</p>
                            <p class="p-stock">3 Disponibles</p>

                            <form action="carrito.html" class="div-add-cart">

                                <label for="product-quantity" class="label-cantidad">Cantidad: </label>
                                <input type="number" id="product-quantity" class="product-quantity" min="0" max="3" required>
                                <input type="submit" value="Agregar al carrito" class="btn-add-cart">

                            </form>
                        </div>
                    </div>

                    <div class="resenia-container">

                        <input type="checkbox" id="sinopsis" class="input-checkbox">
                        <label for="sinopsis" class="titulo-sinopsis-container">
                            <h2>Sinopsis</h2>
                            <img src="./icons/information.png">
                        </label>

                        <div class="separador-sinopsis"></div>
                        <div class="resumen">
                            <p>Narra la historia de Rodolfo, un hombre jubilado cuyo pasado vuelve a acecharlo cuando su hermano Geni,
                                un asesino convicto, es excarcelado debido a una enfermedad incurable.Â La trama se desarrolla a lo largo
                                de una semana, mientras Rodolfo espera la llegada de su hermano a la casa familiar, un evento que
                                reaviva viejos</p>
                        </div>
                        <br />

                        <div class="container-encabezado-resenia">
                            <h2>ReseÃ±as</h2>
                            <label for="btn-agregar-checkbox" class="btn-agregar">
                                <span class="span-agregar-resenia">Agregar reseÃ±a</span>
                                <span class="span-cancelar-resenia">Cancelar reseÃ±a</span>
                            </label>
                            <input type="checkbox" class="btn-agregar-checkbox" id="btn-agregar-checkbox">
                        </div>
                        <div class="separador-resenias"></div>

                        <div class="resenias-usuarios">

                            <div class="nueva-resenia-container">

                                <div class="resenia-usuario">
                                    <img src="./icons/user.png">
                                    <div class="nombre-calificacion-usuario">
                                        <span>Carlos GutiÃ©rrez (TÃº)</span>
                                        <div class="calificacion">
                                            <p>3</p>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                        </div>
                                    </div>

                                </div>

                                <form class="form-nueva-resenia">

                                    <input class="input-range" type="range" min="0" max="5" step="0.1">

                                    <label for="titulo-nueva-resenia">TÃ­tulo:</label>
                                    <input type="text" id="titulo-nueva-resenia" required>

                                    <label for="contenido-nueva-resenia">Contenido:</label>
                                    <textarea id="contenido-nueva-resenia" required></textarea>

                                    <input type="submit" value="Enviar reseÃ±a" class="btn-enviar-resenia">
                                </form>
                            </div>

                            <div class="resenia-usuario">
                                <img src="./icons/user.png">
                                <div class="nombre-calificacion-usuario">
                                    <span>Catarina Demacia</span>
                                    <div class="calificacion">
                                        <p>3</p>
                                        <div class="estrella"></div>
                                        <div class="estrella"></div>
                                        <div class="estrella"></div>
                                        <div class="estrella"></div>
                                    </div>

                                </div>

                            </div>

                            <div>
                                <div class="resenia-usuario">
                                    <img src="./icons/user.png">
                                    <div class="nombre-calificacion-usuario">
                                        <span>Victor Almendra</span>
                                        <div class="calificacion">
                                            <p>3</p>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                            <div class="estrella"></div>
                                        </div>
                                    </div>

                                </div>

                                <div class="contenido-resenia-usuario">

                                    <p class="titulo-resenia">Buena idea, pero se me hizo pesado</p>
                                    <input type="checkbox" id="ver" class="input-checkbox">
                                    <label class="btn-ver" for="ver">
                                        <span class="span-ver">Ver</span>
                                        <span class="span-ocultar">Ocultar</span>
                                    </label>

                                    <div class="contenido-resenia-ampliada">
                                        <p>
                                            La sinopsis me pareciÃ³ super interesante y por eso lo comprÃ©. La historia de los dos hermanos y el
                                            pasado que los persigue tiene mucho potencial.
                                            Sin embargo, el libro se me hizo demasiado lento. Entiendo que la intenciÃ³n es crear una atmÃ³sfera de
                                            tensiÃ³n mientras el protagonista espera a su hermano, pero para mi gusto, hay capÃ­tulos enteros en los
                                            que sentÃ­ que no pasaba casi nada. Me costÃ³ mucho mantenerme concentrado y estuve a punto de dejarlo
                                            varias veces.
                                            No es un mal libro, la prosa del autor es buena y los personajes estÃ¡n bien planteados, pero el ritmo
                                            es muy pausado. Creo que a la historia le hubiera venido bien un poco mÃ¡s de acciÃ³n o que los
                                            conflictos se desarrollaran mÃ¡s rÃ¡pido.
                                            EstÃ¡ bien si te gustan las novelas muy introspectivas y lentas, pero si buscas un thriller con mÃ¡s
                                            movimiento, quizÃ¡s este no sea para ti.
                                        </p>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>

        </div>

    </body>

</html>

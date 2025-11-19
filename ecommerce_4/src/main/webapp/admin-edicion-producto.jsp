
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Producto</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-agregar-producto.css"/>
    </head>

    <body>
        <div class="body-container">
            <nav>
                <a href="./principal-registrado.html">
                    <div class="home">
                        <img src="./icons/home.svg" alt="home" class="home-icon" />
                    </div>
                </a>

                <ul class="nav-links">
                    <li>
                        <a href="./catalogo.html" class="nav-btn" target="_blank"
                           >Catálogo</a
                        >
                    </li>
                    <li>
                        <div class="user">
                            <img src="./icons/user.png" alt="user" class="user-icon" />
                        </div>
                    </li>
                    <li>
                        <a href="./catalogo.html">
                            <div class="catalogo">
                                <img
                                    src="./icons/catalogo.png"
                                    alt="catalogo"
                                    class="catalogo-icon"
                                    />
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="./users.html">
                            <div class="users">
                                <img
                                    src="./icons/users.png"
                                    alt="usuarios"
                                    class="users-icon"
                                    />
                            </div>
                        </a>
                    </li>
                    <li>
                        <div class="pedidos">
                            <img
                                src="./icons/pedidos.png"
                                alt="pedidos"
                                class="pedidos-icon"
                                />
                        </div>
                    </li>
                    <li>
                        <div class="payments">
                            <img
                                src="./icons/payments.png"
                                alt="Pagos"
                                class="payments-icon"
                                />
                        </div>
                    </li>
                </ul>
            </nav>

            <main>
                <div class="general-container">
                    <div class="container-add-edition">
                        <div class="image-container">
                            <img src="${productoEditar.urlImagen}" alt="Producto Libro Morir en la Arena" class="product-image" />
                            <div class="container-icon-add-edition">
                                <img src="icons/edition.png" alt="Editar imagen" />
                            </div>
                        </div>

                        <form action="admin-actualizar-producto" class="form-add-edition" id="form-add-edition">
                            
                            <input type="hidden" name="id" value="${producto.id}">
                            <input type="hidden" name="id-libro" value="${productoEditar.libro.id}">
                            
                            <div class="seleccionar-libro">
                                <label>Libro:</label>
                                <input type="text" value="${productoEditar.libro.titulo}" name ="libro" readonly />
                                <a href="libros-registrados.html">
                                    <button class="btn-seleccionar" type="button">Seleccionar</button>
                                </a>
                                
                            </div>

                            <div>
                                
                                <label>Formato:</label>
                                
                                <select name="formato" class="form-control">

                                    <c:forEach var="entradaFormato" items="${mapaFormatos}">

                                        <option value="${entradaFormato.key}" ${entradaFormato.key == productoEditar.formato ? 'selected' : ''}>
                                            <c:out value="${entradaFormato.value}" />
                                        </option>

                                    </c:forEach>

                                </select>
                            </div>

                            <div>
                                <label>No. de páginas:</label>
                                <input type="number" name="numero-paginas" min="1" value="${productoEditar.numeroPaginas}" />
                            </div>

                            <div>
                                <label>Precio:</label>
                                <input type="number" name="precio" min="1" step="0.01" value="${productoEditar.precio}" />
                                <span>pesos</span>
                            </div>

                            <div>
                                <label>Stock:</label>
                                <input type="number" name="stock" min="0" value="${productoEditar.stock}" />
                            </div>

                            <div class="buttons-cancel-add-edition">
                                <a href="menu-principal-admin">
                                    <input type="button" value="Cancelar" class="cancel-input" />
                                </a>
                                <input type="submit" value="Agregar" class="add-edition-input add-input"/>
                            </div>
                            <br/>
                        </form>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

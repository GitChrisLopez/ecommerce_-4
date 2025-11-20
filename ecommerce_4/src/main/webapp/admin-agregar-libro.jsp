<%-- 
    Document   : admin-agregar-libro
    Created on : 19 nov 2025, 10:10:09 p.m.
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Agregar Libro</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-nav.css" />
        <link rel="stylesheet" type="text/css" href="./styles/styles-agregar-libro.css"/>
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
                <div class="general-container">
                    <div class="container-add-edition">
                        <div class="title-container">
                            <h1>Agregar libro</h1>
                        </div>

                        <form class="form-add-edition" id="form-add-edition">
                            <div>
                                <label>Título: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="El Último Secreto"
                                    required
                                    />
                            </div>

                            <div>
                                <label>Autor: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Dan Brown"
                                    readonly
                                    required
                                    />
                                <a href="admin-autores-registrados.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Categoría: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Thriller"
                                    readonly
                                    required
                                    />
                                <a href="admin-categorias-registradas.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Editorial: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="text"
                                    value="Editorial Planeta"
                                    readonly
                                    required
                                    />
                                <a href="editoriales-registradas.html">
                                    <button class="btn-seleccionar" type="button">
                                        Seleccionar
                                    </button>
                                </a>
                            </div>

                            <div>
                                <label>Publicación: </label>
                                <input
                                    class="input-form-add-edition"
                                    type="date"
                                    value="2025-09-09"
                                    required
                                    />
                            </div>

                            <div class="div-synopsis">
                                <label>Sinopsis: </label>
                                <textarea
                                    class="input-form-add-edition"
                                    maxlength="350"
                                    required
                                    >
                                    En El último secreto, el profesor de simbología Robert Langdon se ve envuelto en una carrera contrarreloj en Praga tras el brutal asesinato de su colega, Katherine Solomon...
                                </textarea
                                >
                            </div>

                            <div class="buttons-cancel-add-edition">
                                <input type="button" value="Cancelar" class="cancel-input" />
                                <input
                                    type="submit"
                                    value="Agregar"
                                    class="add-edition-input add-input"
                                    />
                            </div>
                        </form>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>

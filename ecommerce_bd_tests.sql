DROP DATABASE IF EXISTS ecommerce_bd_tests;
CREATE DATABASE ecommerce_bd_tests;
USE ecommerce_bd_tests;

CREATE TABLE usuarios (
    id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NULL,
    correo VARCHAR(320) NOT NULL UNIQUE,
    contrasenia VARCHAR(20) NOT NULL,
    -- Columna discriminadora para saber qué tipo de usuario es
    tipo_usuario VARCHAR(50) NOT NULL
);


CREATE TABLE administradores (
    id_usuario BIGINT PRIMARY KEY,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario) ON DELETE CASCADE
);

CREATE TABLE clientes (
    id_usuario BIGINT PRIMARY KEY,
    saldo DOUBLE NOT NULL DEFAULT 0,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario) ON DELETE CASCADE
);

CREATE TABLE direcciones (
    id_direccion BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cliente BIGINT NOT NULL,
    calle VARCHAR(255) NOT NULL,
    numero_exterior VARCHAR(10) NOT NULL,
    numero_interior VARCHAR(10),
    colonia VARCHAR(255) NOT NULL,
    codigo_postal VARCHAR(5) NOT NULL,
    ciudad VARCHAR(255) NOT NULL,
    municipio VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    referencias VARCHAR(255),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_usuario) ON DELETE CASCADE
);

CREATE TABLE productos (
    id_producto BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(1000) NOT NULL,
    precio DOUBLE NOT NULL,
    stock INT NOT NULL,
    tipo_producto VARCHAR(50) NOT NULL
);

CREATE TABLE autores (
    id_autor BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE categorias (
    id_categoria BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE editoriales (
    id_editorial BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE libros (
    id_producto BIGINT PRIMARY KEY,
    isbn VARCHAR(13) NOT NULL UNIQUE,
    paginas INT NOT NULL,
    formato ENUM('TAPA_DURA', 'TAPA_BLANDA', 'BOLSILLO', 'E_BOOK') NOT NULL,
    
    id_autor BIGINT NOT NULL,
    id_categoria BIGINT NOT NULL,
    id_editorial BIGINT NOT NULL,
    
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto) ON DELETE CASCADE,
    FOREIGN KEY (id_autor) REFERENCES autores(id_autor) ON DELETE NO ACTION,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria) ON DELETE NO ACTION,
    FOREIGN KEY (id_editorial) REFERENCES editoriales(id_editorial) ON DELETE NO ACTION
);

CREATE TABLE pedidos (
    id_pedido BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cliente BIGINT NOT NULL,
    id_direccion BIGINT NULL,
    fecha_pedido DATE NOT NULL,
    monto_total DOUBLE NOT NULL,
    estado ENUM('PENDIENTE', 'EN_PROCESO', 'ENVIADO', 'ENTREGADO', 'CANCELADO') NOT NULL,
    metodo_pago ENUM('TARJETA', 'TRANSFERENCIA', 'CONTRA_ENTREGA') NOT NULL,
    
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_usuario) ON DELETE NO ACTION,
    FOREIGN KEY (id_direccion) REFERENCES direcciones(id_direccion) ON DELETE SET NULL
);

CREATE TABLE productos_pedidos (
    id_producto_pedido BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_pedido BIGINT NOT NULL,
    id_libro BIGINT NOT NULL,
    precio DOUBLE NOT NULL,
    cantidad INT NOT NULL,
    
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido) ON DELETE CASCADE,
    FOREIGN KEY (id_libro) REFERENCES productos(id_producto) ON DELETE NO ACTION
);

CREATE TABLE resenias (
    id_resenia BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_libro BIGINT NOT NULL, 
    id_cliente BIGINT NOT NULL,
    puntuacion INT NOT NULL,
    comentario VARCHAR(1000),
    
    FOREIGN KEY (id_libro) REFERENCES productos(id_producto) ON DELETE CASCADE,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_usuario) ON DELETE CASCADE
);

CREATE TABLE carritos (
    id_carrito BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cliente BIGINT NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_usuario) ON DELETE CASCADE
);

CREATE TABLE productos_carritos (
    id_producto_carrito BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_carrito BIGINT NOT NULL,
    id_libro BIGINT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_carrito) REFERENCES carritos(id_carrito) ON DELETE CASCADE,
    FOREIGN KEY (id_libro) REFERENCES productos(id_producto) ON DELETE CASCADE
);

-- admin hereda de usuario asi que hacemos el usuario primero
INSERT INTO usuarios (nombre, apellido_paterno, correo, contrasenia, tipo_usuario)
VALUES ('Admin', 'Root', 'admin@correo.com', 'admin123', 'ADMINISTRADOR');

-- luego admin
INSERT INTO administradores (id_usuario)
SELECT id_usuario FROM usuarios WHERE correo = 'admin@correo.com';
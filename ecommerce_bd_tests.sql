-- para arreglar errores borren la BD y empiecen de 0
DROP DATABASE IF EXISTS ecommerce_bd_tests;
-- 1- Primero crear la BD
CREATE DATABASE ecommerce_bd_tests;

-- 2- Correr el main de Persistencia

-- 3- Despues ejecutar esta linea
USE ecommerce_bd_tests; 

-- 4- insertar admin
INSERT INTO usuarios (nombre, apellido_paterno, correo, contrasenia, tipo_usuario)
VALUES ("Admin", "Root", "admin@correo.com", "admin123", "ADMINISTRADOR");

-- 5- insertar en la tabla hija 'administradores'
INSERT INTO administradores (id_usuario)
SELECT id_usuario FROM usuarios WHERE correo = "admin@correo.com";


-- 5- insertar cliente
INSERT INTO usuarios (nombre, apellido_paterno, correo, contrasenia, tipo_usuario)
VALUES ("user", "usuario", "user@gmail.com", "12345", "CLIENTE");

-- 6- insertar los datos obligatorios en la tabla 'clientes'
INSERT INTO clientes (id_usuario, telefono, activo)
SELECT id_usuario, '0000000000', 1 
FROM usuarios WHERE correo = "user@gmail.com";


SELECT * FROM usuarios;

SELECT * FROM ecommerce_bd_tests.administradores;
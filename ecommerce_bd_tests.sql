CREATE DATABASE ecommerce_bd_tests;
USE ecommerce_bd_tests;

-- admin hereda de usuario asi que hacemos el usuario primero
INSERT INTO usuarios (nombre, apellido_paterno, correo, contrasenia, tipo_usuario)
VALUES ('Admin', 'Root', 'admin@correo.com', 'admin123', 'ADMINISTRADOR');

-- luego admin
INSERT INTO administradores (id_usuario)
SELECT id_usuario FROM usuarios WHERE correo = 'admin@correo.com';
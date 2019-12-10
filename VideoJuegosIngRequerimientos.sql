DROP DATABASE IF EXISTS ferreteria;
CREATE SCHEMA `ferreteria` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE ferreteria;

CREATE TABLE usuarios(
id_usuario INT (3) PRIMARY KEY NOT NULL AUTO_INCREMENT, 
usuario VARCHAR (13) UNIQUE NOT NULL,
password VARCHAR(13) NOT NULL,
tipoUser ENUM('administrador','empleado') NOT NULL,
estado ENUM('activo','inactivo') NOT NULL,
nombre VARCHAR(40),
apellidos VARCHAR(40),
sexo ENUM('masculino','femenino'),
fechaNacimiento DATE,
Correo VARCHAR(76),
nTelefono VARCHAR(15),
idioma ENUM('Spanish','English'),
letra ENUM('Chica','Mediana','Grande')
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO usuarios VALUES 
(null,'root','root','administrador','activo','root',null,'masculino','1999-01-14',null,null,'Spanish','Chica'),
(null,'admin','root','administrador','activo','rootIng',null,'masculino','2018-06-04',null,null,'English','Chica'),
(null,'root1','root','empleado','activo','root',null,'femenino','2018-06-04',null,null,'English','Chica');

CREATE TABLE productos(
id_producto INT(6) PRIMARY KEY NOT NULL AUTO_INCREMENT,
producto VARCHAR(100),
descripcion VARCHAR(255),
costo float(7,2),
cantidad INT(3)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO productos VALUES 
(null,'Xbox One S','1TB + Fortnite Battle Royale - Special Edition',6999,00),
(null,'Play Station 4 Slim','1TB con juego FIFA19 - Bundle Edition',7999,00);

CREATE TABLE ventas(
id_venta INT (6) PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_producto INT(6),
descripcion VARCHAR(255),
nombre_cliente VARCHAR(255),
fecha DATE,
id_usuario INT (3),
INDEX (id_usuario),
FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO ventas VALUES 
(null,1,'silla azul','Raul Marquez','2018:06:04',2),
(null,2,'silla roja','Raul Marquez','2018:06:05',2);

CREATE TABLE pedidos(
id_pedido INT (6) PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_producto INT(6),
Descripcion VARCHAR(255),
nombre_cliente VARCHAR(255),
fecha DATE,
id_usuario INT (3),
INDEX (id_usuario),
FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pedidos VALUES 
(null,1,'silla azul','Raul Marquez','2018:06:04',2),
(null,2,'silla roja','Raul Marquez','2018:07:04',2);

select date_format(fecha, '%Y') as anio from pedidos;
select date_format(fecha, '%M') as anio from pedidos;
select date_format(fecha, '%D') as anio from pedidos;

CREATE TABLE almacen(
id_material INT (4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_material VARCHAR(100),
descripcion VARCHAR (255),
tipo VARCHAR (50),
cantidad INT(3)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO almacen VALUES 
(null,'madera','caoba de 3x4','caoba',2),
(null,'cierra','de 12 pulgadas','cedro',2);

CREATE TABLE temporal(
id_temp INT (1) PRIMARY KEY NOT NULL AUTO_INCREMENT,
idioma ENUM('Spanish','English'),
letra ENUM('Chica','Mediana','Grande'),
color ENUM('azul','rojo','verde'),
tipoUser ENUM('administrador','empleado'),
id_usuario INT (3), 
password VARCHAR(13)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO temporal VALUES 
(null,'Spanish','Chica','azul','administrador',1,'root');

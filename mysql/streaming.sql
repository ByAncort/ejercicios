-- create
CREATE TABLE streaming (
  Id INTEGER PRIMARY KEY,
  name varchar(50) NOT NULL,
  plataforma TEXT NOT NULL,
  usuariosl int not null,
  precio int not null,
  genero TEXT not null
);

-- insert

INSERT INTO streaming (id,name,plataforma,usuariosl,precio,genero) VALUES
(1, 'Marta', 'Netflix', 7, 7990 , 'Comedia'),
(2, 'Andrés', 'Disney+', 4, 6500, 'Animación'),
(3, 'Carla', 'Amazon Prime Video', 5, 5990, 'Drama'),
(4, 'Jorge', 'HBO Max', 2, 7990, 'Acción'),
(5, 'Fernanda', 'Apple TV+', 3, 11990, 'Romance'),
(6, 'Gabriel', 'Netflix', 4, 5290, 'Thriller'),
(7, 'Marcela', 'Disney+', 2, 6500, 'Familiar'),
(8, 'Santiago', 'Amazon Prime Video', 1, 3990, 'Comedia'),
(9, 'Lorena', 'HBO Max', 6, 6500, 'Ciencia ficción'),
(10, 'Gustavo', 'Apple TV+', 3, 3490, 'Drama'),
(11, 'Laura', 'Netflix', 5, 5290, 'Suspenso'),
(12, 'Diego', 'Disney+', 2, 6500, 'Aventuras'),
(13, 'Valentina', 'Amazon Prime Video', 4, 7990, 'Comedia'),
(14, 'Pablo', 'HBO Max', 1, 3990, 'Terror'),
(15, 'Carolina', 'Apple TV+', 3, 3490, 'Comedia'),
(16, 'José', 'Netflix', 6, 7990, 'Drama'),
(17, 'Natalia', 'Disney+', 3, 6500, 'Romance'),
(18, 'Cristóbal', 'Amazon Prime Video', 2, 5990, 'Comedia'),
(19, 'Victoria', 'HBO Max', 4, 6500, 'Drama'),
(20, 'Raúl', 'Apple TV+', 1, 3490, 'Misterio');

-- consultas

 ALTER TABLE streaming ADD inicio_S date;
 
 SELECT AVG(precio) FROM streaming;
 
SELECT * FROM streaming WHERE precio = (SELECT MAX(precio) FROM streaming);

update streaming set inicio_S = "2023-05-02" ;

SELECT name, plataforma, precio FROM streaming WHERE precio <= 5990;

SELECT * from streaming where genero like '%o%' ;

delete from streaming where id in (1,2,4,6,19);

ALTER TABLE streaming ADD T_plataforma text;

update streaming set T_plataforma ="all";

update streaming set T_plataforma = "smartphone" WHERE precio =5290;

SELECT * FROM streaming WHERE precio = (SELECT MAX(precio) FROM streaming);

delete from streaming where T_plataforma = "smartphone";

select * from streaming;
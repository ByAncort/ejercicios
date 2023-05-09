CREATE TABLE vendedores (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  ciudad VARCHAR(50) NOT NULL,
  pais VARCHAR(50) NOT NULL,
  fecha_contratacion DATE NOT NULL,
  comisiones DECIMAL(10,2) DEFAULT 0.00,
  PRIMARY KEY (id)
);

CREATE TABLE clientes (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  ciudad VARCHAR(50) NOT NULL,
  pais VARCHAR(50) NOT NULL,
  fecha_registro DATE NOT NULL,
  vendedor_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (vendedor_id) REFERENCES vendedores(id)
);

CREATE TABLE vehiculos (
  id INT NOT NULL AUTO_INCREMENT,
  marca VARCHAR(50) NOT NULL,
  modelo VARCHAR(50) NOT NULL,
  ano INT NOT NULL,
  placa VARCHAR(10) NOT NULL,
  color VARCHAR(50) NOT NULL,
  cliente_id INT NOT NULL,
  vendedor_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (cliente_id) REFERENCES clientes(id),
  FOREIGN KEY (vendedor_id) REFERENCES vendedores(id)
);


INSERT INTO vendedores (nombre, apellido, email, telefono, direccion, ciudad, pais, fecha_contratacion, comisiones) VALUES
  ('Juan', 'Pérez', 'jperez@email.com', '555-1234', 'Calle 123', 'Ciudad de México', 'México', '2021-01-01', 0.00),
  ('María', 'García', 'mgarcia@email.com', '555-5678', 'Avenida 456', 'Buenos Aires', 'Argentina', '2020-05-01', 0.00),
  ('Carlos', 'Rodríguez', 'crodriguez@email.com', '555-9012', 'Rua 789', 'São Paulo', 'Brasil', '2019-01-01', 0.00),
  ('Julia', 'Martínez', 'jmartinez@email.com', '555-3456', 'Carrera 10', 'Bogotá', 'Colombia', '2018-06-01', 0.00),
  ('David', 'López', 'dlopez@email.com', '555-7890', 'Avenida 23', 'Buenos Aires', 'Argentina', '2017-02-01', 0.00);

INSERT INTO clientes (nombre, apellido, email, telefono, direccion, ciudad, pais, fecha_registro, vendedor_id) VALUES
  ('Ana', 'Sánchez', 'asanchez@email.com', '555-1111', 'Calle 456', 'Ciudad de México', 'México', '2021-05-01', 1),
  ('Luis', 'Gómez', 'lgomez@email.com', '555-2222', 'Avenida 789', 'Buenos Aires', 'Argentina', '2021-04-01', 2),
  ('Sofía', 'Martínez', 'smartinez@email.com', '555-3333', 'Rua 123', 'São Paulo', 'Brasil', '2021-03-01', 3),
  ('Pedro', 'Hernández', 'phernandez@email.com', '555-4444', 'Calle 789', 'Ciudad de México', 'México', '2021-02-01', 1),
  ('Laura', 'González', 'lgonzalez@email.com', '555-5555', 'Rua 456', 'São Paulo', 'Brasil', '2021-01-01', 3);

INSERT INTO vehiculos (marca, modelo, ano, placa, color, cliente_id, vendedor_id) VALUES
  ('Toyota', 'Corolla', 2020, 'ABC123', 'Blanco', 1, 1),
  ('Ford', 'Focus', 2019, 'DEF456', 'Gris', 2, 2),
  ('Honda', 'Civic', 2018, 'GHI789', 'Negro', 3, 3),
  ('Chevrolet', 'Spark', 2021, 'JKL012', 'Rojo', 4, 1),
  ('Volkswagen', 'Jetta', 2017, 'MNO345', 'Azul', 5, 2);
  
select * from vendedores;

select * from clientes;

select * from vehiculos;

CREATE TABLE libro (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  titulo VARCHAR(30) NOT NULL,
  publicacion YEAR NOT NULL,
  cantidad_disp INT NOT NULL
);

CREATE TABLE autor (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(80) NOT NULL,
  nacionalidad VARCHAR(30) NOT NULL
);

CREATE TABLE libro_autor (
  libro_id INTEGER NOT NULL,
  autor_id INTEGER NOT NULL,
  FOREIGN KEY (libro_id) REFERENCES libro(id),
  FOREIGN KEY (autor_id) REFERENCES autor(id)
);

CREATE TABLE prestamo (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  f_prestamo DATE NOT NULL,
  f_devolucion DATE,
  libro_id INTEGER NOT NULL,
  FOREIGN KEY (libro_id) REFERENCES libro(id)
);

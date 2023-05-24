  # Diagrama de Tablas y Relaciones

El siguiente diagrama representa las tablas y sus relaciones en la base de datos:

   +-------------+           +-------------+
   |   libro     |           |    autor    |
   +-------------+           +-------------+
   | id (PK)     |           | id (PK)     |
   | titulo      |           | nombre      |
   | publicacion |           | nacionalidad|
   | cantidad_disp|           +-------------+
   +-------------+
        | (1)
        |
        | (N)
   +-------------+
   | libro_autor |
   +-------------+
   | libro_id (FK)|
   | autor_id (FK)|
   +-------------+
        | (N)
        |
        | (1)
   +-------------+
   |  usuario    |
   +-------------+
   | id (PK)     |
   | nombre      |
   | email       |
   +-------------+
        | (1)
        |
        | (N)
   +-------------+
   |  prestamo   |
   +-------------+
   | id (PK)     |
   | f_prestamo  |
   | f_devolucion|
   | libro_id (FK)|
   | usuario_id (FK)|
   +-------------+

En el diagrama, se muestra la estructura de las tablas y las relaciones entre ellas. Los símbolos "(PK)" y "(FK)" indican las claves primarias y las claves foráneas, respectivamente. Los símbolos "(1)" y "(N)" representan la cardinalidad de las relaciones.

Este diagrama es útil para comprender la estructura de la base de datos y las relaciones entre las entidades.

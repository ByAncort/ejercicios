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

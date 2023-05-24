CREATE TABLE clientes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50),
  direccion VARCHAR(100),
  identificacion VARCHAR(20),
  telefono VARCHAR(20),
  historial_crediticio VARCHAR(100)
);
CREATE TABLE cuentas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  numero_cuenta VARCHAR(20),
  tipo_cuenta VARCHAR(50),
  saldo DECIMAL(10, 2),
  id_cliente INT,
  FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);
CREATE TABLE transacciones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  numero_transaccion VARCHAR(20),
  fecha DATETIME,
  cuenta_origen VARCHAR(20),
  cuenta_destino VARCHAR(20),
  monto DECIMAL(10, 2),
  descripcion VARCHAR(100)
);
CREATE TABLE productos_financieros (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre_producto VARCHAR(50),
  tipo_producto VARCHAR(50),
  tasa_interes DECIMAL(5, 2),
  condiciones TEXT,
  beneficios TEXT
);
CREATE TABLE empleados (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50),
  cargo VARCHAR(50),
  salario DECIMAL(10, 2),
  telefono VARCHAR(20),
  historial_laboral TEXT
);
CREATE TABLE sucursales (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre_sucursal VARCHAR(50),
  direccion VARCHAR(100),
  ciudad VARCHAR(50),
  estado VARCHAR(50),
  codigo_postal VARCHAR(10),
  horario_apertura TIME,
  horario_cierre TIME,
  telefono VARCHAR(20)
);

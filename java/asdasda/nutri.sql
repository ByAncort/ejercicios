-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-08-2023 a las 18:26:37
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutri`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentos`
--

CREATE TABLE `alimentos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `calorias` int(11) DEFAULT NULL,
  `proteina` double DEFAULT NULL,
  `carbohidratos` double DEFAULT NULL,
  `grasas` double DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `clasificacion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alimentos`
--

INSERT INTO `alimentos` (`id`, `nombre`, `calorias`, `proteina`, `carbohidratos`, `grasas`, `tipo`, `clasificacion`) VALUES
(1, 'Tostadas integrales con mantequilla de cacahuate y plátano', 300, 8, 40, 12, 'Volumen', 'Desayuno'),
(2, 'Batido de proteínas con leche y frutas', 350, 20, 30, 10, 'Volumen', 'Desayuno'),
(3, 'Yogur griego con granola y miel', 400, 15, 50, 15, 'Volumen', 'Desayuno'),
(4, 'Pan integral con jamón de pavo y queso bajo en grasa', 350, 20, 25, 12, 'Volumen', 'Desayuno'),
(5, 'Bol de frutas con yogurt natural', 300, 10, 60, 5, 'Volumen', 'Desayuno'),
(6, 'Tostadas integrales con aguacate y huevo revuelto', 400, 15, 30, 20, 'Volumen', 'Desayuno'),
(7, 'Batido de avena con plátano y leche', 350, 10, 50, 8, 'Volumen', 'Desayuno'),
(8, 'Tostadas integrales con mantequilla de almendra y plátano', 250, 5, 30, 10, 'Definición', 'Desayuno'),
(9, 'Batido de proteínas con leche de almendra y arándanos', 200, 15, 10, 5, 'Definición', 'Desayuno'),
(10, 'Yogur natural con frutos rojos', 150, 8, 15, 8, 'Definición', 'Desayuno'),
(11, 'Pan integral con jamón de pavo', 200, 10, 15, 8, 'Definición', 'Desayuno'),
(12, 'Bol de frutas con yogurt griego', 200, 6, 30, 5, 'Definición', 'Desayuno'),
(13, 'Tostadas integrales con aguacate', 250, 5, 20, 12, 'Definición', 'Desayuno'),
(14, 'Batido de avena con plátano', 220, 5, 25, 6, 'Definición', 'Desayuno'),
(15, 'Tostadas integrales con mantequilla', 200, 4, 30, 8, 'Mantenimiento', 'Desayuno'),
(16, 'Batido de proteínas con leche y frutas', 250, 15, 20, 8, 'Mantenimiento', 'Desayuno'),
(17, 'Yogur natural con frutas', 150, 6, 20, 5, 'Mantenimiento', 'Desayuno'),
(18, 'Pan integral con jamón de pavo', 200, 10, 15, 8, 'Mantenimiento', 'Desayuno'),
(19, 'Bol de frutas con yogurt', 200, 4, 30, 5, 'Mantenimiento', 'Desayuno'),
(20, 'Tostadas integrales con aguacate', 250, 4, 25, 10, 'Mantenimiento', 'Desayuno'),
(21, 'Batido de avena con plátano', 200, 5, 25, 6, 'Mantenimiento', 'Desayuno'),
(22, 'Ensalada de pasta con pollo a la parrilla', 500, 25, 60, 18, 'Volumen', 'Almuerzo'),
(23, 'Wrap de pavo con lechuga y queso', 450, 20, 30, 20, 'Volumen', 'Almuerzo'),
(24, 'Bowl de arroz integral con frijoles y aguacate', 550, 20, 70, 22, 'Volumen', 'Almuerzo'),
(25, 'Ensalada de garbanzos con pepino y tomate', 400, 15, 45, 15, 'Volumen', 'Almuerzo'),
(26, 'Tortilla de trigo integral con pollo y vegetales', 450, 20, 35, 18, 'Volumen', 'Almuerzo'),
(27, 'Poke bowl con salmón y aguacate', 500, 25, 40, 22, 'Volumen', 'Almuerzo'),
(28, 'Arroz frito con pollo y vegetales', 550, 30, 50, 25, 'Volumen', 'Almuerzo'),
(29, 'Ensalada de pollo con aguacate', 350, 10, 10, 15, 'Definición', 'Almuerzo'),
(30, 'Filete de pescado a la parrilla', 300, 15, 5, 12, 'Definición', 'Almuerzo'),
(31, 'Ensalada de quinoa con lentejas', 350, 5, 20, 12, 'Definición', 'Almuerzo'),
(32, 'Tacos de pavo con tortillas de maíz', 300, 8, 10, 10, 'Definición', 'Almuerzo'),
(33, 'Hamburguesa de ternera con espinaca', 350, 8, 10, 15, 'Definición', 'Almuerzo'),
(34, 'Ensalada de atún con aguacate', 300, 10, 5, 10, 'Definición', 'Almuerzo'),
(35, 'Tofu salteado con vegetales', 300, 5, 10, 12, 'Definición', 'Almuerzo'),
(36, 'Ensalada de pollo con aguacate', 350, 10, 10, 15, 'Mantenimiento', 'Almuerzo'),
(37, 'Filete de pescado a la parrilla', 300, 15, 5, 12, 'Mantenimiento', 'Almuerzo'),
(38, 'Ensalada de quinoa con lentejas', 350, 5, 20, 12, 'Mantenimiento', 'Almuerzo'),
(39, 'Tacos de pavo con tortillas de maíz', 300, 8, 10, 10, 'Mantenimiento', 'Almuerzo'),
(40, 'Hamburguesa de ternera con espinaca', 350, 8, 10, 15, 'Mantenimiento', 'Almuerzo'),
(41, 'Ensalada de atún con aguacate', 300, 10, 5, 10, 'Mantenimiento', 'Almuerzo'),
(42, 'Tofu salteado con vegetales', 300, 5, 10, 12, 'Mantenimiento', 'Almuerzo'),
(43, 'Filete de pollo con batatas asadas', 550, 25, 40, 22, 'Volumen', 'Cena'),
(44, 'Salmón a la parrilla con brócoli', 500, 25, 20, 28, 'Volumen', 'Cena'),
(45, 'Ensalada de garbanzos con pepino y tomate', 400, 15, 45, 15, 'Volumen', 'Cena'),
(46, 'Tofu al curry con arroz', 450, 20, 35, 20, 'Volumen', 'Cena'),
(47, 'Pechuga de pavo con batatas asadas', 500, 25, 25, 25, 'Volumen', 'Cena'),
(48, 'Tacos de ternera con guacamole', 550, 30, 25, 28, 'Volumen', 'Cena'),
(49, 'Plato de quinoa con pollo asado', 500, 20, 50, 22, 'Volumen', 'Cena'),
(50, 'Ensalada de espinaca con pollo a la parrilla', 350, 10, 5, 15, 'Definición', 'Cena'),
(51, 'Salmón al horno con brócoli', 350, 15, 5, 15, 'Definición', 'Cena'),
(52, 'Tazón de quinoa con verduras asadas', 400, 5, 20, 15, 'Definición', 'Cena'),
(53, 'Tacos de pavo con tortillas de maíz', 350, 8, 10, 15, 'Definición', 'Cena'),
(54, 'Hamburguesa de ternera con espinaca', 400, 8, 10, 18, 'Definición', 'Cena'),
(55, 'Ensalada de atún con aguacate', 300, 10, 5, 10, 'Definición', 'Cena'),
(56, 'Tofu salteado con vegetales', 300, 5, 10, 12, 'Definición', 'Cena'),
(57, 'Ensalada de espinaca con pollo a la parrilla', 350, 10, 5, 15, 'Mantenimiento', 'Cena'),
(58, 'Salmón al horno con brócoli', 350, 15, 5, 15, 'Mantenimiento', 'Cena'),
(59, 'Tazón de quinoa con verduras asadas', 400, 5, 20, 15, 'Mantenimiento', 'Cena'),
(60, 'Tacos de pavo con tortillas de maíz', 350, 8, 10, 15, 'Mantenimiento', 'Cena'),
(61, 'Hamburguesa de ternera con espinaca', 400, 8, 10, 18, 'Mantenimiento', 'Cena'),
(62, 'Ensalada de atún con aguacate', 300, 10, 5, 10, 'Mantenimiento', 'Cena'),
(63, 'Tofu salteado con vegetales', 300, 5, 10, 12, 'Mantenimiento', 'Cena');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `user` varchar(100) NOT NULL,
  `email` varchar(500) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `sexo` varchar(6) DEFAULT '-',
  `altura` int(11) DEFAULT NULL,
  `peso` double DEFAULT NULL,
  `imc` double DEFAULT NULL,
  `objetivo` varchar(20) NOT NULL,
  `Ccomidas` varchar(20) NOT NULL,
  `actividad` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `fname`, `lname`, `user`, `email`, `pass`, `sexo`, `altura`, `peso`, `imc`, `objetivo`, `Ccomidas`, `actividad`) VALUES
(1, 'diego', 'cortes', 'admin', 'asd', '123', 'mujer', 197, 120, 30.92066273287124, 'volumen ', '3 comida', 'muy activo'),
(18, 'Yerko', 'Cortes', 'ycortes', 'yerko@email.com', '123456', 'hombre', 180, 35, NULL, '', '', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;
--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

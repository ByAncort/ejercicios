-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-08-2023 a las 00:11:10
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentos`
--

CREATE TABLE `alimentos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `calorias` float NOT NULL,
  `proteina` float NOT NULL,
  `carbohidratos` float NOT NULL,
  `grasas` float NOT NULL,
  `tipo` enum('Volumen','Definicion','Mantenimiento') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alimentos`
--

INSERT INTO `alimentos` (`id`, `nombre`, `calorias`, `proteina`, `carbohidratos`, `grasas`, `tipo`) VALUES
(131, 'Pollo a la parrilla con arroz y vegetales', 450, 30, 40, 15, 'Volumen'),
(132, 'Ensalada de atún con aguacate y huevo cocido', 400, 25, 10, 20, 'Volumen'),
(133, 'Pasta con salsa de tomate y albóndigas', 500, 20, 60, 20, 'Volumen'),
(134, 'Tacos de carne asada con guacamole', 550, 35, 30, 25, 'Volumen'),
(135, 'Salmón al horno con papas asadas', 400, 30, 25, 18, 'Volumen'),
(136, 'Hamburguesa con queso cheddar y papas fritas', 600, 35, 50, 30, 'Volumen'),
(137, 'Ternera al curry con arroz integral', 500, 25, 40, 20, 'Volumen'),
(138, 'Sandwich de pavo y queso con ensalada', 450, 30, 35, 15, 'Volumen'),
(139, 'Wrap de pollo con verduras y salsa de yogur', 400, 30, 25, 18, 'Volumen'),
(140, 'Pechuga de pollo con batatas asadas', 450, 30, 30, 20, 'Volumen'),
(141, 'Salmón a la parrilla con brócoli al vapor', 350, 30, 10, 15, 'Definicion'),
(142, 'Ensalada de pollo con espinacas y aderezo ligero', 300, 25, 15, 12, 'Definicion'),
(143, 'Tortilla de claras de huevo con vegetales', 250, 30, 5, 10, 'Definicion'),
(144, 'Pechuga de pavo al horno con ensalada mixta', 320, 30, 10, 12, 'Definicion'),
(145, 'Atún a la plancha con espárragos', 280, 35, 5, 12, 'Definicion'),
(146, 'Ensalada de quinoa con lentejas y aguacate', 350, 20, 40, 15, 'Definicion'),
(147, 'Wrap de pavo con lechuga y tomate', 280, 25, 15, 10, 'Definicion'),
(148, 'Pasta integral con champiñones y espinacas', 300, 20, 40, 10, 'Definicion'),
(149, 'Sopa de pollo con verduras', 250, 20, 20, 8, 'Definicion'),
(150, 'Brochetas de pollo con vegetales a la parrilla', 300, 25, 15, 12, 'Definicion'),
(151, 'Ensalada de salmón ahumado con aguacate', 400, 30, 10, 25, 'Mantenimiento'),
(152, 'Tofu salteado con brócoli y zanahorias', 350, 25, 15, 20, 'Mantenimiento'),
(153, 'Hamburguesa de pavo con espinacas y queso feta', 400, 30, 20, 18, 'Mantenimiento'),
(154, 'Ensalada de garbanzos con pepino y tomate', 320, 20, 40, 12, 'Mantenimiento'),
(155, 'Arroz integral con pollo a la naranja', 380, 30, 35, 15, 'Mantenimiento'),
(156, 'Wrap de ternera con lechuga y cebolla', 340, 30, 25, 14, 'Mantenimiento'),
(157, 'Salmón al horno con espárragos', 380, 30, 15, 20, 'Mantenimiento'),
(158, 'Ensalada de pollo con aguacate y aderezo de mostaza', 350, 30, 10, 18, 'Mantenimiento'),
(159, 'Tacos de pavo con tortillas de maíz', 360, 30, 20, 16, 'Mantenimiento'),
(160, 'Pasta integral con tomate y albahaca', 380, 20, 50, 12, 'Mantenimiento');

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `fname`, `lname`, `user`, `email`, `pass`, `sexo`, `altura`, `peso`, `imc`, `objetivo`, `Ccomidas`, `actividad`) VALUES
(1, 'diego', 'cortes', 'admin', 'asd', '123', 'hombre', 123, 123, 81.30081300813009, 'definicion', '1 comida', 'muy activo'),
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=161;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

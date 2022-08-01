-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-08-2022 a las 21:49:58
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ecomercezhad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_category`
--

CREATE TABLE `tbl_category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `state` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tbl_category`
--

INSERT INTO `tbl_category` (`id`, `name`, `state`) VALUES
(3, 'TECLADOS', b'0'),
(4, 'MOUSE', b'0'),
(6, 'MONITORES', b'0'),
(7, 'MESA', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_product`
--

CREATE TABLE `tbl_product` (
  `id` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  `id_category` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `price` double DEFAULT NULL,
  `product_register` datetime DEFAULT NULL,
  `icon` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tbl_product`
--

INSERT INTO `tbl_product` (`id`, `amount`, `id_category`, `name`, `price`, `product_register`, `icon`) VALUES
(181, 113, 4, 'Mouse inalambrico', 42500, NULL, 'http://cdn.shopify.com/s/files/1/0569/2296/4141/products/mouse-inalambrico-bluetooth-r8-363444_1200x1200.jpg?v=1635977359'),
(182, 12, 3, 'teclado inalambrico', 87800, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6rF9c9M5mwDi0BbsuK9LCRgK5eEvO6C2Ykw&usqp=CAU'),
(183, 560, 3, 'teclado gamer rgb', 69400, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJcAtRYeaYViRcXik06G3zY3mGCqxhoW2QZw&usqp=CAU'),
(185, 6, 6, 'Monitor gAmINg', 980000, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDrS__SLILBs6_M97eJbU8Vi8cODtxuedYzho7H9thUxs8Vs5Wa1zeT4mvHvYjs5hc_q4&usqp=CAU'),
(237, 7, 0, 'mesa torre', 1989000, NULL, 'https://http2.mlstatic.com/D_NQ_NP_655700-MCO43406464548_092020-O.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=238;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

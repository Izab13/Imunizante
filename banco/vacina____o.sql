-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Nov-2021 às 02:37
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vacinação`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `imunizante`
--

CREATE TABLE `imunizante` (
  `cd_imunizante` int(11) NOT NULL,
  `imunizante` varchar(40) NOT NULL,
  `qtd_lotes` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `localidade`
--

CREATE TABLE `localidade` (
  `cd_localidade` int(11) NOT NULL,
  `cidade` varchar(80) NOT NULL,
  `bairro` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `cd_pessoa` int(11) NOT NULL,
  `pessoa` varchar(120) NOT NULL,
  `imu_1°dose` varchar(40) NOT NULL,
  `imu_2°dose` varchar(40) NOT NULL,
  `loc_1°dose` varchar(40) NOT NULL,
  `loc_2°dose` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `imunizante`
--
ALTER TABLE `imunizante`
  ADD PRIMARY KEY (`cd_imunizante`);

--
-- Índices para tabela `localidade`
--
ALTER TABLE `localidade`
  ADD PRIMARY KEY (`cd_localidade`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`cd_pessoa`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `imunizante`
--
ALTER TABLE `imunizante`
  MODIFY `cd_imunizante` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `localidade`
--
ALTER TABLE `localidade`
  MODIFY `cd_localidade` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `cd_pessoa` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

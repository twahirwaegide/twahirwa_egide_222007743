-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 12:19 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `egide_twahirwa_sfms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin id` int(100) NOT NULL,
  `admin name` varchar(100) NOT NULL,
  `telphone` int(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `confirm password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin id`, `admin name`, `telphone`, `sex`, `email`, `password`, `confirm password`) VALUES
(98, 'lkjh', 8990, 'kjh', 'ghj', 'iuy', 'vbn'),
(1234, 'derftg', 23456, 'gubhnj', 'ftgyhun', ' fvgbhnj', 'derftgyhun'),
(2345, 'sdfg', 2345, 'fdg', 'sdf', 'sadfgsadfg', 'sdfgasdfsas'),
(23456, 'asdf', 2345, 'asdfg', 'dsfg', 'sadfgsdfg', 'erdfgsadf'),
(234567, 'sdfgh', 23456, 'sdfgh', 'sdsfgh', 'ddtfyg', 'werety');

-- --------------------------------------------------------

--
-- Table structure for table `buyer`
--

CREATE TABLE `buyer` (
  `buyer id` int(100) NOT NULL,
  `buyer name` varchar(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `telphone` int(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `confirm password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buyer`
--

INSERT INTO `buyer` (`buyer id`, `buyer name`, `sex`, `telphone`, `email`, `password`, `confirm password`) VALUES
(12, 'egide', 'male', 123, 'tre', 'qwe', 'erwq'),
(23456, 'asyui', 'sdfghj', 123456, 'asdfghj', 'asdfghj', 'asdfghj'),
(123456, 'rtyjfdgh', 'sdfg', 234567, 'sdfghj', 'zdsfghjzxcfgh', 'dsfgh'),
(213456, 'hgfdsa', 'asdfgh', 3456, 'hngfdsa', 'bfvcdxz', 'zxcvbn'),
(345677, 'hgfds', 'zxcvbnm', 76543, 'sdfghjk', 'hfds', 'zfgfh'),
(2345677, 'ertyui', 'dffghj', 345678, 'dfghj', 'dsdfghj', 'fdghjk'),
(4567890, 'sdfghjj', 'dxfcgvhbjnk', 2345, 'zdfghj', 'rtfyghk', 'srdfgh');

-- --------------------------------------------------------

--
-- Table structure for table `fruit_category`
--

CREATE TABLE `fruit_category` (
  `category id` int(100) NOT NULL,
  `category name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `parent category` varchar(100) NOT NULL,
  `shelf life` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fruit_category`
--

INSERT INTO `fruit_category` (`category id`, `category name`, `description`, `parent category`, `shelf life`) VALUES
(3456, 'esdrfg', 'sadfg', 'sadfgafd', 'dsftyg'),
(23456, 'sadfgh', 'sdfgh', 'asdfgh', 'asdfgh'),
(345678, 'retyui', 'fghjkl', 'rtyui', 'retyui'),
(456789, 'oiuyt', 'oiuhgf', 'l;kjhg', 'gghj'),
(2134567, 'zdfgh', 'asdfg', 'saert', 'sadfgh');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `product id` int(100) NOT NULL,
  `product name` varchar(100) NOT NULL,
  `product type` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `qty` int(100) NOT NULL,
  `expiration date` int(100) NOT NULL,
  `purchase date` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`product id`, `product name`, `product type`, `price`, `qty`, `expiration date`, `purchase date`) VALUES
(23456, 'sdfgh', 'sadfgh', 23445, 23456, 232456, 23456),
(56789, 'dfghjkl', 'cxxcgvhbj', 76543, 6578, 45678, 7654),
(234567, 'wertyhj', 'dsfgh', 435678, 34567, 23456, 23456),
(324567, 'ertyuu', 'retyu', 3456789, 345678, 34567, 34567);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `email` varchar(100) NOT NULL,
  `password` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `sale id` int(100) NOT NULL,
  `discount` int(100) NOT NULL,
  `qty sold` int(100) NOT NULL,
  `total price` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale id`, `discount`, `qty sold`, `total price`) VALUES
(3456, 23456, 3456, 3456),
(23456, 123546, 12435465, 24356),
(345678, 2345678, 1234567, 2345678),
(456789, 87654, 45678, 78654),
(3456789, 435678, 34567, 34567);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin id`);

--
-- Indexes for table `buyer`
--
ALTER TABLE `buyer`
  ADD PRIMARY KEY (`buyer id`);

--
-- Indexes for table `fruit_category`
--
ALTER TABLE `fruit_category`
  ADD PRIMARY KEY (`category id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`product id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`sale id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

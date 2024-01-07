-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 10:20 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalpc`
--

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `pengguna_id` int(11) NOT NULL,
  `nama_lengkap` varchar(20) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `kata_sandi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`pengguna_id`, `nama_lengkap`, `username`, `kata_sandi`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'Deky Rahman', 'deky', 'deky'),
(9, 'ahmad santoso', 'ahmad', 'ahmad');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `transaksi_id` int(11) NOT NULL,
  `nama_peminjam` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_telp` int(15) NOT NULL,
  `nama_pc` varchar(15) NOT NULL,
  `durasi_pinjam` varchar(30) NOT NULL,
  `total_biaya` decimal(10,2) DEFAULT NULL,
  `metode_pembayaran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`transaksi_id`, `nama_peminjam`, `alamat`, `no_telp`, `nama_pc`, `durasi_pinjam`, `total_biaya`, `metode_pembayaran`) VALUES
(13, 'deky', 'Jl. Trisaki Komp Yuka', 8969087, 'High-End', '7 Hari', 900000.00, 'Transfer Bank'),
(14, 'udin', 'JL. kusoi', 8926732, 'Entery Level', '4 Hari', 400000.00, 'COD'),
(15, 'mamat', 'pt. mamat gunshop', 891271, 'High-End', '7 Hari', 1050000.00, 'Transfer Bank'),
(16, 'ahmad', 'jl. tki', 83617826, 'Mid-Range', '4 Hari', 650000.00, 'Transfer Bank'),
(17, 'deddy', 'jl. setoyo', 896379384, 'Entery Level', '2 Hari', 350000.00, 'COD');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`pengguna_id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`transaksi_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pengguna`
--
ALTER TABLE `pengguna`
  MODIFY `pengguna_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `transaksi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

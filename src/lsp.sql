-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2023 at 09:30 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lsp`
--

-- --------------------------------------------------------

--
-- Table structure for table `failed_jobs`
--

CREATE TABLE `failed_jobs` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `connection` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `queue` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `payload` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `exception` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `meja`
--

CREATE TABLE `meja` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `status` int(11) NOT NULL DEFAULT 1,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `meja`
--

INSERT INTO `meja` (`id`, `status`, `created_at`, `updated_at`) VALUES
(1, 1, NULL, '2023-03-10 05:38:19'),
(2, 1, '2022-02-19 04:44:00', '2023-03-10 05:38:17'),
(3, 0, '2022-02-19 05:01:56', '2023-03-10 05:38:15'),
(4, 1, '2022-02-19 05:01:59', '2022-02-19 05:01:59'),
(5, 1, '2022-02-19 05:02:01', '2023-03-10 05:36:37'),
(6, 1, '2022-03-10 11:11:07', '2023-03-10 05:38:24'),
(7, 0, '2022-03-10 11:12:09', '2022-03-10 11:12:09'),
(8, 1, '2022-03-10 11:19:26', '2022-03-10 11:19:26'),
(9, 1, '2023-03-10 05:38:27', '2023-03-10 05:38:27');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `gambar` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama_menu` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(100) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `gambar`, `nama_menu`, `harga`, `stok`, `created_at`, `updated_at`) VALUES
(1, 'assets/gambar/ctlHuUioY2TNJtLfpOThr7s2wyPeIn1Xv2QIFuvN.jpg', 'Ayam Betutu', 27000, 20, '2022-02-15 08:12:59', '2023-04-30 05:46:35'),
(2, 'assets/gambar/MBOvTWachA7K3auzu2i9usJA9NxTiIBBZwJMOXAB.jpg', 'Pisang Coklat', 5000, 8, '2022-02-15 08:31:03', '2023-04-30 05:46:35'),
(3, 'assets/gambar/ezkA2RwWGVX17bauUqQaqAPBkUW73uLRXHXxdOl3.jpg', 'Gudeg Jawa', 10000, 29, '2022-02-16 03:24:01', '2023-04-30 05:46:35'),
(4, 'assets/gambar/EBwR94sPB3yDdSYxV14Rv7g5CjPf0PtHcKZeeV9X.jpg', 'Ikan Bakar', 25000, 10, '2022-02-16 03:24:20', '2023-04-30 05:46:35');

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(28, '2014_10_12_000000_create_users_table', 1),
(29, '2014_10_12_100000_create_password_resets_table', 1),
(30, '2019_08_19_000000_create_failed_jobs_table', 1),
(31, '2019_12_14_000001_create_personal_access_tokens_table', 1),
(32, '2021_12_12_123903_create_menu_table', 1),
(33, '2021_12_12_124039_create_pesanan_table', 1),
(34, '2021_12_13_121302_create_transaksi_table', 1),
(35, '2022_02_15_113957_create_meja_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tokenable_id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
  `abilities` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `menu_id` bigint(20) UNSIGNED NOT NULL,
  `transaksi_id` bigint(20) UNSIGNED NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'DIBUAT',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id`, `menu_id`, `transaksi_id`, `jumlah`, `total`, `status`, `created_at`, `updated_at`) VALUES
(1, 3, 1, 4, 40000, 'DIANTAR', '2022-02-16 17:23:21', '2022-02-16 17:23:51'),
(2, 2, 1, 3, 15000, 'DIANTAR', '2022-02-16 17:23:21', '2022-02-16 17:23:51'),
(3, 1, 1, 2, 40000, 'DIANTAR', '2022-02-16 17:23:21', '2022-02-16 17:23:51'),
(4, 1, 2, 3, 81000, 'DIANTAR', '2022-02-18 09:34:22', '2022-02-18 09:34:28'),
(5, 3, 2, 2, 20000, 'DIANTAR', '2022-02-18 09:34:22', '2022-02-18 09:34:28'),
(6, 1, 3, 1, 27000, 'DIANTAR', '2022-02-20 03:20:44', '2022-02-20 03:20:56'),
(7, 2, 3, 2, 10000, 'DIANTAR', '2022-02-20 03:20:44', '2022-02-20 03:20:56'),
(8, 4, 3, 3, 75000, 'DIANTAR', '2022-02-20 03:20:44', '2022-02-20 03:20:56'),
(9, 3, 3, 4, 40000, 'DIANTAR', '2022-02-20 03:20:44', '2022-02-20 03:20:56'),
(10, 1, 4, 3, 81000, 'DIANTAR', '2022-02-20 03:23:03', '2022-02-20 03:23:08'),
(11, 2, 4, 11, 55000, 'DIANTAR', '2022-02-20 03:23:03', '2022-02-20 03:23:08'),
(12, 2, 5, 2, 10000, 'DIANTAR', '2022-02-21 06:20:30', '2022-02-21 06:21:36'),
(13, 3, 5, 1, 10000, 'DIANTAR', '2022-02-21 06:20:30', '2022-02-21 06:21:36'),
(14, 1, 6, 1, 27000, 'DIANTAR', '2022-02-23 04:44:09', '2022-02-23 04:45:49'),
(15, 3, 6, 2, 20000, 'DIANTAR', '2022-02-23 04:44:09', '2022-02-23 04:45:49'),
(16, 1, 7, 1, 27000, 'DIANTAR', '2022-02-23 04:45:03', '2022-02-23 04:45:21'),
(17, 3, 8, 1, 10000, 'DIANTAR', '2022-02-23 05:12:04', '2022-02-23 05:12:16'),
(18, 2, 8, 2, 10000, 'DIANTAR', '2022-02-23 05:12:04', '2022-02-23 05:12:16'),
(19, 1, 8, 4, 108000, 'DIANTAR', '2022-02-23 05:12:04', '2022-02-23 05:12:16'),
(20, 1, 9, 1, 27000, 'DIANTAR', '2022-03-01 01:37:33', '2022-03-01 01:37:33'),
(21, 3, 9, 3, 30000, 'DIANTAR', '2022-03-01 01:37:33', '2022-03-01 01:37:33'),
(36, 1, 32, 2, 54000, 'DIANTAR', '2022-03-04 10:42:31', '2022-03-04 10:42:31'),
(37, 3, 32, 1, 10000, 'DIANTAR', '2022-03-04 10:42:31', '2022-03-04 10:42:31'),
(38, 2, 33, 2, 10000, 'DIANTAR', '2022-03-04 12:56:23', '2022-03-04 12:56:23'),
(39, 3, 33, 1, 10000, 'DIANTAR', '2022-03-04 12:56:23', '2022-03-04 12:56:23'),
(46, 1, 38, 2, 54000, 'DIANTAR', '2022-03-10 10:04:22', '2022-03-10 10:04:22'),
(47, 3, 38, 3, 30000, 'DIANTAR', '2022-03-10 10:04:22', '2022-03-10 10:04:22'),
(48, 3, 39, 3, 30000, 'DIANTAR', '2022-03-10 10:15:05', '2022-03-10 10:15:05'),
(49, 2, 40, 2, 10000, 'DIANTAR', '2022-03-10 10:19:02', '2022-03-10 10:19:02'),
(50, 3, 41, 3, 30000, 'DIANTAR', '2022-03-10 10:23:17', '2022-03-10 10:23:17'),
(51, 4, 42, 2, 50000, 'DIANTAR', '2022-03-10 10:34:01', '2022-03-10 10:34:01'),
(52, 3, 43, 2, 20000, 'DIANTAR', '2022-03-10 10:36:20', '2022-03-10 10:36:20'),
(53, 4, 44, 2, 50000, 'DIANTAR', '2022-03-10 11:24:35', '2022-03-10 11:24:35'),
(54, 1, 45, 2, 54000, 'DIANTAR', '2023-03-10 05:35:13', '2023-03-10 05:35:40'),
(55, 2, 45, 1, 5000, 'DIANTAR', '2023-03-10 05:35:13', '2023-03-10 05:35:40'),
(56, 3, 45, 1, 10000, 'DIANTAR', '2023-03-10 05:35:13', '2023-03-10 05:35:40'),
(57, 3, 46, 20, 200000, 'DIBUAT', '2023-03-10 13:00:10', '2023-03-10 13:00:10'),
(58, 4, 46, 2, 50000, 'DIBUAT', '2023-03-10 13:00:10', '2023-03-10 13:00:10'),
(59, 4, 47, 20, 500000, 'DIANTAR', '2023-04-30 05:03:33', '2023-04-30 05:03:33'),
(60, 2, 48, 2, 10000, 'DIANTAR', '2023-04-30 05:50:20', '2023-04-30 05:50:20'),
(61, 4, 48, 2, 50000, 'DIANTAR', '2023-04-30 05:50:20', '2023-04-30 05:50:20');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `meja` bigint(20) UNSIGNED NOT NULL,
  `total` int(11) NOT NULL,
  `bayar` int(11) DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'TERTUNDA',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `nama`, `meja`, `total`, `bayar`, `status`, `created_at`, `updated_at`) VALUES
(1, 'Kakak', 1, 95000, 600000, 'LUNAS', '2022-02-16 17:23:21', '2022-02-16 17:25:41'),
(2, 'Mura', 1, 101000, 101000, 'LUNAS', '2022-02-18 09:34:22', '2022-02-18 09:35:14'),
(3, 'Rene', 3, 152000, 152000, 'LUNAS', '2022-02-20 03:20:44', '2022-02-20 03:22:03'),
(4, 'dada', 4, 136000, 136000, 'LUNAS', '2022-02-20 03:23:03', '2022-02-20 03:23:40'),
(5, 'Sifa', 1, 20000, 20000, 'LUNAS', '2022-02-21 06:20:30', '2022-02-21 06:41:36'),
(6, 'Bede', 2, 47000, 50000, 'LUNAS', '2022-02-23 04:44:09', '2022-02-23 04:52:12'),
(7, 'Sudi', 3, 27000, 28000, 'LUNAS', '2022-02-23 04:45:03', '2022-02-23 04:51:33'),
(8, 'Hana', 1, 128000, 130000, 'LUNAS', '2022-02-23 05:12:04', '2022-02-23 05:12:50'),
(9, 'Muryadi', 2, 57000, 58000, 'LUNAS', '2022-03-01 01:37:33', '2022-03-05 11:49:37'),
(32, 'dadasdwa', 1, 64000, 70000, 'LUNAS', '2022-03-04 10:42:31', '2022-03-05 11:46:17'),
(33, 'Orada', 3, 20000, 50000, 'LUNAS', '2022-03-04 12:56:23', '2022-03-05 11:40:19'),
(38, 'Judi', 1, 84000, 85000, 'LUNAS', '2022-03-10 10:04:22', '2022-03-10 10:13:22'),
(39, 'Jona', 2, 30000, 40000, 'LUNAS', '2022-03-10 10:15:05', '2022-03-10 10:21:35'),
(40, 'gogo', 3, 10000, 20000, 'LUNAS', '2022-03-10 10:19:02', '2022-03-10 10:19:54'),
(41, 'fara', 3, 30000, 30000, 'LUNAS', '2022-03-10 10:23:17', '2022-03-10 10:24:04'),
(42, 'todi', 1, 50000, 50000, 'LUNAS', '2022-03-10 10:34:01', '2022-03-10 10:34:45'),
(43, 'vava', 1, 20000, 20000, 'LUNAS', '2022-03-10 10:36:20', '2022-03-10 10:37:01'),
(44, 'rarat', 5, 50000, 100000, 'LUNAS', '2022-03-10 11:24:35', '2022-03-10 11:25:15'),
(45, 'Rodrick', 5, 69000, 100000, 'LUNAS', '2023-03-10 05:35:13', '2023-03-10 05:36:37'),
(46, 'Evan', 7, 250000, NULL, 'TERTUNDA', '2023-03-10 13:00:10', '2023-03-10 13:00:10'),
(47, 'Yoges', 3, 500000, NULL, 'TERTUNDA', '2023-04-30 05:03:33', '2023-04-30 05:03:33'),
(48, 'ruru', 1, 60000, 60000, 'LUNAS', '2023-04-30 05:50:20', '2023-04-30 05:53:39');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `level` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'WAITER',
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `email_verified_at`, `password`, `level`, `remember_token`, `created_at`, `updated_at`) VALUES
(1, 'Andi', 'andi@gmail.com', NULL, '$2y$10$c1dh/MLcO8icdMHSzy9aKOWdiP9ifr6wwEnJtlYaSdPhJHG9bP6SO', 'ADMIN', NULL, '2022-02-15 08:01:09', '2022-02-23 05:20:30'),
(2, 'Budi', 'budi@gmail.com', NULL, '$2y$10$1VBfYqDQPlt22QF5owh86.1xx6llLdo/wLo0uiolrlznXS.WYiRQO', 'ADMIN', NULL, '2022-02-15 08:11:54', '2022-02-15 08:11:54'),
(3, 'Dodi', 'dodi@gmail.com', NULL, '$2y$10$Y4t/lXliXIZhCH7Fvq1KEuoVdcap.4siFBm2WzG9DfRFGP5ZUPto6', 'CASHIER', NULL, '2022-02-16 03:26:30', '2022-02-16 03:26:30'),
(7, 'Nuni', 'nuni@gmail.com', NULL, '$2y$10$monfckeD6rZzDZ892aySEuiB1ysorz4QhRVZyYT5t5bEWELR1Qgj6', 'WAITER', NULL, '2022-02-23 05:22:56', '2022-02-23 05:22:56'),
(9, 'Noni', 'noni@gmail.com', NULL, '$2y$10$OfRPJ3pjHMEzlQrG5ylZz.08xmh/Dy8blAv5JHw04pn5Px8jNJ8Re', 'ADMIN', NULL, '2022-02-23 05:28:48', '2022-02-23 05:43:10'),
(10, 'mouy', 'mouy@gmail.com', NULL, '$2y$10$WjtS6tj9qEPZCGRzl42QX.sHkdGIMJcNXkaJ6Ik248FbZKSb0pbkK', 'CASHIER', NULL, '2022-02-23 05:42:25', '2022-02-23 05:42:25'),
(11, 'AdminDesk', 'admindesk@gmail.com', NULL, '7c222fb2927d828af22f592134e8932480637c0d', 'ADMIN', NULL, '2022-03-10 09:21:25', '2022-03-10 09:21:25'),
(12, 'rudi', 'rudi@gmail.com', NULL, '$2y$10$bzkuwLA/P4wjNYuVcd/IqOGCcADLX0OHkAGQLd5FnFBhaJ4buheqy', 'WAITER', NULL, '2022-03-10 09:47:39', '2022-10-21 00:30:31'),
(13, 'susi', 'susi@gmail.com', NULL, '$2y$10$NY9R51M9qktuSBposh0d7eAho9DjqcV7OXvnLud1oERv83mbifaYW', 'CASHIER', NULL, '2022-03-10 09:48:13', '2022-10-21 00:30:39'),
(14, 'Celo', 'celo@gmail.com', NULL, '$2y$10$4pmCXnb81P42AtIekZhGHOZ5Vn7uayJDgqfSIRmdjgGrFmxEaPj3S', 'ADMIN', NULL, '2022-10-21 00:13:10', '2022-10-21 00:13:10'),
(15, 'rodrick', 'rodrick@gmail.com', NULL, '7c222fb2927d828af22f592134e8932480637c0d', 'WAITER', NULL, NULL, NULL),
(17, 'evan', 'evan@gmail.com', NULL, '7c222fb2927d828af22f592134e8932480637c0d', 'CASHIER', NULL, '2023-04-30 05:52:54', '2023-04-30 05:52:54');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`);

--
-- Indexes for table `meja`
--
ALTER TABLE `meja`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Indexes for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `meja`
--
ALTER TABLE `meja`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

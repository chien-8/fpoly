-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 01, 2023 lúc 02:19 AM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `du_an_1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `idCart` int(10) NOT NULL,
  `idOrder` int(10) NOT NULL,
  `idUser` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `tinhtrang` int(11) NOT NULL,
  `idSp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `cart`
--

INSERT INTO `cart` (`idCart`, `idOrder`, `idUser`, `quantity`, `tinhtrang`, `idSp`) VALUES
(1, 1, 1, 1, 3, 3),
(2, 3, 1, 1, 0, 3),
(3, 3, 1, 1, 7, 3),
(4, 4, 12, 1, 1, 3),
(5, 5, 1, 1, 3, 3),
(7, 6, 1, 1, 6, 3),
(8, 7, 1, 1, 0, 3),
(9, 7, 1, 1, 0, 3),
(10, 8, 13, 1, 1, 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `idCategory` int(10) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`idCategory`, `name`) VALUES
(1, 'update aaa'),
(2, 'Như nào'),
(6, 'áo khoác 1123aaaa'),
(7, 'áo khoác 1123aaaassss');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `comment`
--

CREATE TABLE `comment` (
  `idComment` int(10) NOT NULL,
  `content` varchar(255) NOT NULL,
  `dateComment` varchar(255) NOT NULL,
  `idProduct` int(10) NOT NULL,
  `idUser` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `placinganorder`
--

CREATE TABLE `placinganorder` (
  `idOder` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `dateOder` date NOT NULL,
  `idbill` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `placinganorder`
--

INSERT INTO `placinganorder` (`idOder`, `name`, `address`, `phone`, `dateOder`, `idbill`) VALUES
(1, 'dat', '1', 0, '0000-00-00', 0),
(2, 'dat', '1', 0, '0000-00-00', 0),
(3, 'dat', '123123', 2222, '0000-00-00', 0),
(4, 'chiến tạ', 'hà nội', 1, '0000-00-00', 0),
(5, 'Đạt coming', 'hà nội', 962096125, '0000-00-00', 0),
(6, 'Đạt coming', 'hà nội az', 962096125, '0000-00-00', 0),
(7, 'Đạt coming', 'hà nội az', 962096125, '0000-00-00', 0),
(8, 'Nguyễn Văn Đạt', 'Mĩ Đình 2 ,Nguyễn Hoàng ,Nam Từ Liêm ,Hà Nội', 123123, '0000-00-00', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `idProduct` int(10) NOT NULL,
  `namePro` varchar(255) NOT NULL,
  `price` double(10,2) NOT NULL,
  `image` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `quantity` int(11) NOT NULL,
  `idCate` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`idProduct`, `namePro`, `price`, `image`, `description`, `quantity`, `idCate`) VALUES
(3, 'M2K Tekno Platinum Tint Celery aaaaaa', 500.00, '264856015_1632391990436744_1873520468356436573_n.jpg', 'zegrgzccasca', 111, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `status`
--

CREATE TABLE `status` (
  `idStatus` int(11) NOT NULL,
  `nameStatus` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `status`
--

INSERT INTO `status` (`idStatus`, `nameStatus`) VALUES
(0, 'Hủy hàng thành công'),
(1, 'Đang xác nhận'),
(2, 'Đã xác nhận đơn hàng'),
(3, 'Đang giao hàng'),
(4, 'Giao hàng thành công'),
(5, 'Đã giao hàng'),
(6, 'Đang xác nhận hủy hàng'),
(7, 'Hủy hàng thất bại tiếp tục giao hàng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `idUser` int(10) NOT NULL,
  `nameUser` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` tinyint(50) NOT NULL DEFAULT 1,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`idUser`, `nameUser`, `address`, `phone`, `email`, `password`, `status`, `role`) VALUES
(1, 'Đạt coming', 'hà nội az', '0962096125', 'ndat165@gmail.com', '1', 1, '3'),
(11, 'Tạ Minh Chiến', 'hà nội', '0359269559', 'chientmph@fpt.edu.vn', '1', 1, ''),
(12, 'chiến tạ', 'hà nội', '0359269559', 'chien@gmail.com', '1', 1, ''),
(13, 'Nguyễn Văn Đạt', 'Mĩ Đình 2 ,Nguyễn Hoàng ,Nam Từ Liêm ,Hà Nội', '123123', 'vandatpk01@gmail.com', '1', 1, '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`idCart`),
  ADD KEY `FK_idOrder` (`idOrder`),
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idSp` (`idSp`),
  ADD KEY `tinhtrang` (`tinhtrang`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`idCategory`);

--
-- Chỉ mục cho bảng `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`idComment`),
  ADD KEY `FK_idProduct` (`idProduct`),
  ADD KEY `FK_idUser` (`idUser`);

--
-- Chỉ mục cho bảng `placinganorder`
--
ALTER TABLE `placinganorder`
  ADD PRIMARY KEY (`idOder`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`idProduct`),
  ADD KEY `Fk_idCategory` (`idCate`);

--
-- Chỉ mục cho bảng `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`idStatus`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `cart`
--
ALTER TABLE `cart`
  MODIFY `idCart` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `idCategory` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `comment`
--
ALTER TABLE `comment`
  MODIFY `idComment` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `placinganorder`
--
ALTER TABLE `placinganorder`
  MODIFY `idOder` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `product`
--
ALTER TABLE `product`
  MODIFY `idProduct` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `status`
--
ALTER TABLE `status`
  MODIFY `idStatus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `FK_idOrder` FOREIGN KEY (`idOrder`) REFERENCES `placinganorder` (`idOder`),
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`idSp`) REFERENCES `product` (`idProduct`),
  ADD CONSTRAINT `cart_ibfk_3` FOREIGN KEY (`tinhtrang`) REFERENCES `status` (`idStatus`);

--
-- Các ràng buộc cho bảng `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `FK_idProduct` FOREIGN KEY (`idProduct`) REFERENCES `product` (`idProduct`),
  ADD CONSTRAINT `FK_idUser` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);

--
-- Các ràng buộc cho bảng `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `Fk_idCategory` FOREIGN KEY (`idCate`) REFERENCES `category` (`idCategory`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
<?php

session_start();
// nhận dữ liệu từ form
$email = $_POST['email'];
$password = $_POST['password'];

// tạo kết nối đến csdl
$connect = new PDO("mysql:host=127.0.0.1;dbname=php1_asm1;charset=utf8", "root", "");
// chuẩn bị sẵn 1 câu lệnh sql để lấy user dựa vào email nhận đc từ form
$getUserByEmail = "select * from users where email = '$email'";
$stmt = $connect->prepare($getUserByEmail);
// thực thi câu lệnh sql với csdl
$stmt->execute();
// nhận dữ liệu trả về từ csdl
$user = $stmt->fetch();
// var_dump($user);die;

// nếu có user và mk trong csdl khớp với mk người dùng điền vào => tạo phần tử auth của biến
// session và điều hướng website về trang a.php
if($user && password_verify($password, $user['password'])){
    $_SESSION['auth'] = [
        'id' => $user['id'],
        'name' => $user['name'],
        'email' => $user['email'],
        'role' => $user['role'],
    ];
    header('location: a.php');
    die;
}
// không thỏa mãn thì điều hướng ngược về trang login với 1 message
header("location: login.php?msg=Đăng nhập không thành công!");

?>
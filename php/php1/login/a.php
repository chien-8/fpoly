<?php
session_start();
// nếu không tồn tại phần tử 'auth' của session hoặc giá trị của phần tử này = null
// thì điều hướng website về trang login
if(!isset($_SESSION['auth']) || $_SESSION['auth'] == null){
    header('location: login.php');die;
}

// tạo session mới

?>
<h2>Xin chào <?= $_SESSION['auth']['name']?></h2>
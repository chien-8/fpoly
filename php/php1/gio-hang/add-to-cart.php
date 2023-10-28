<?php
session_start();
$id = $_GET['id'];
require_once 'data.php';

$sp=[];
foreach ($products as $key => $value) {
    if($value['id'] == $id){
        $sp = $value;
        break;
    }
}

// kiểm tra xem sản phẩm đã có trong giỏ hàng hay chưa
// nếu chưa có thì bổ sung thêm quantity sau đó add sản phẩm vào giỏ hàng
// nếu có rồi thì tìm ra index của sản phẩm đã tồn tại trong giỏ hàng 
// sau đó tăng giá trị của quantity lên 1 đơn vị



?>
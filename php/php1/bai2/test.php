<?php

$name =$_GET['name'];
$gender=$_GET['gender'];
$ma =$_GET['ma'];
$khoa =$_GET['khoa'];
$diem1 =$_GET['diem1'];
$diem2 =$_GET['diem2'];



echo "họ và tên:$name";
echo "<br>";
echo "mã sinh viên:$ma";
echo "<br>";
echo "khóa:$khoa";
echo "<br>";
echo "điểm web1013:$diem1";
echo "<br>";
echo "điểm web2033:$diem2";
echo "<br>";
echo $gender;
?>
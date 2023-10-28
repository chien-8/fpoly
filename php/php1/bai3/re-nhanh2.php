<?php
$gender=rand(1,5);
echo "$gender<br>";
switch($gender){
    case 1:
        echo "giới tính nam";
        break;
    case 2:
        echo "giới tính nữ";
        break;
    default:
        echo "giới tính khác";
        break;
}
?>
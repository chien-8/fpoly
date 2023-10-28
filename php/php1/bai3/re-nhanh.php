<?php


//nếu thỏa mãn điều kiện có 1 số lượng câu lệnh sẽ đc thực thi


$num=rand(1,10);
echo "$num<br>";


// if($num>=9 && $num<10){
//     echo "sv xuất sắc";
// }else if($num>=7 && $num<9){
//     echo "sv gioi";

// }else if($num>=5 && $num<7){
//     echo "sv trung bình";
// }else{
//     echo "học lại";
// }

echo $num % 2 == 0 ? "chẵn":"lẻ";
?>
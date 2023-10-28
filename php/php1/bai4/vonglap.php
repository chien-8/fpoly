<?php
   //vòng lặp để thực hiện 1 đoạn lệnh nhiều lần mà không phải viết lại code
   $i=1;
   while($i<=1000){
       echo $i . "<br>";
       $i++;
   }
//1.các vòng lặp không biết trước số lần lặp
//while(dk){} nếu điều kiện còn trả về true thì vòng lặp còn chạy
//do{}while(dk) thực hiện vòng lặp ít nhất 1 lần sau đó mới kiểm tra điều kiện,nếu
//đk còn trả về true thì vòng lặp sẽ tiếp tục chạy

//2.vòng lặp biết số làn lặp
//for($i=0;$i<số;$i++){}
//foreach($arr as $key=> $value){}- chỉ có thể dùng cho mảng/chuỗi
//-tất cả các loại mảng đều có thể chạy đc


?>
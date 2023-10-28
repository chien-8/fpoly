<?php
//tạo 1 mảng gồm 5 phần tử được sinh ra ngẫu nhiên có giá trị nằm trong mảng có giá trị nằm trong mảng
//yêu cầu các phần tử ko lặp lại
$arr = [];
for ($i=0; $i < 5; $i++) { 
    if($i == 0){
        $arr[] = rand(1, 20);
    }else{
        $flag = true;
        while($flag == true){
            $randomValue = rand(1, 20);
            for ($j  = 0; $j < count($arr); $j++) {
                if($arr[$j] == $randomValue){
                    continue;
                }else{
                    $flag = false;
                    $arr[] = $randomValue;
                    break;
                }
            }
        }
    }
}

?>
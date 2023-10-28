<?php
   //tạo mảng
//    $arr=[];
//    $arr[]=2;
//    $arr[]=false;
//    $arr[]="something";

//    $arr['name']='fpt poly';
//    echo "<pre>";
//    var_dump($arr);
   //tạo ra 1 mảng gồm 20 phần tử là số ngẫu nhiên nằm trong khoảng =>100

//    $arr=[];
//    for($i=0;$i<10;$i++){
//        $arr[]=rand(1,100);
//    }
//    echo "<pre>";
//    var_dump($arr);


   //đếm số phần tử chẵn trong mảng

    // $arr=['0','1','6','10','5'];
    
    // for($i=0;$i<count($arr);$i++){
    //     if($arr[$i]%2==0){
    //         echo "số chẵn";
    //         echo ": $arr[$i]<br>";  
    //     }else{ 
    //         echo "số lẻ";
    //         echo ": $arr[$i]<br>";
           
    //     }
    // }


    // $arr=[];
    // for($i=0;$i<10;$i++){
    //     $arr[]=rand(1,100);
    // }
    // echo "<pre>";
    // var_dump($arr);
    // $chan=0;
    // $le=0;
    // foreach($arr as $key=> $value){
    //     if($value%2==0){
    //         $chan ++;
    //     }else{
    //         $le++;
    //     }
    // }
    // echo "tổng số chẵn: $chan<br>tổng số lẻ: $le";


    //tính tổng các số chẵn, và tổng các số lẻ

    // $arr=[];
    // for($i=0;$i<10;$i++){
    //     $arr[]=rand(1,5);
    // }
    // echo "<pre>";
    // var_dump($arr);
    // $tongchan=0;
    // $tongle=0;
    // foreach($arr as $key=> $value){
    //     if($value%2==0){
    //         $tongchan +=$value;
            
    //     }else{
    //         $tongle +=$value;
    //     }
    // }
    // echo "tổng số chẵn: $tongchan<br>tổng số lẻ: $tongle";


//tìm số lớn nhất trong mảng

$arr=[];
for($i=0;$i<10;$i++){
    $arr[]=rand(1,5);
}
echo "<pre>";
var_dump($arr);
$max=$arr[0];
for($i=0;$i<count($arr);$i++){
    if($max>$arr[$i]){
        echo "max $max";
    }
}

?>
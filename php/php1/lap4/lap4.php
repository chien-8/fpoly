<?php 

function tao_mang($so_ptu, $min, $max, $check_double = false)
    {
        $arr = array();
        if (!$check_double) {
            for ($i = 0; $i < $so_ptu; $i++) {
                $arr[] = rand($min, $max);
            }
        } else {
            for ($i = 0; $i < $so_ptu; $i++) {
                if ($i == 0) {
                    $arr[] = rand($min, $max);
                    continue;
                }
                $flag = true;
                while ($flag == true) {
                    $randomValue = rand($min, $max);;
                    $count = 0;
                    foreach ($arr as $value) {
                        if ($value == $randomValue) {
                            $count++;
                        }
                    }
                    if ($count == 0) {
                        $arr[] = $randomValue;
                        $flag = false;
                    }
                }
            }
        }
        return $arr;
    }
$mang=tao_mang(10,1,50,true);
echo "<pre>";
print_r($mang);
// b1. Tính tổng tất cả các số chia hết cho 3 hoặc 5
    $a=0;
    foreach($mang as $key=>$value){
        if($value %3 ==0 || $value%5==0){
            $a+=$value;
        }else{
            echo "";
        }
    }
    echo "b1. Tính tổng tất cả các số chia hết cho 3 hoặc 5";
    echo "<pre>";
    echo "tổng các số chia hết cho 3 và 5 trong mảng: $a<br><br>";

    




// *** Sinh ra 1 mảng gồm 10 phần tử nằm trong khoảng 1- 50 (sử dụng hàm phía trên) ***

// b2. Sắp xếp các giá trị của mảng theo thứ tự tăng dần (không sử dụng hàm sort có sẵn)
// b3. hiển thị các tổ hợp giá trị các phần tử có thể hình thành 1 tam giác và tính diện tích của tam giác đó
// !
function sapxep($n){
        for ($i=0;$i < count($n);$i++) {
            for ($j = $i + 1; $j < count($n); $j++) {
                if ($n[$i] > $n[$j]) {
                    $check= $n[$i];
                    $a[$i] = $n[$j];
                    $a[$j] = $check;
                }
            }
        }
        return $a;
    }
    $arr2 = $mang;
    echo "bài2: mảng sau sắp xếp tăng dần: ";
    echo "<pre>";
    var_dump(sapxep($arr2));

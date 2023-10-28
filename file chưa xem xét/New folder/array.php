 <?php
    $element = $_GET['element'];
    $min = $_GET['min'];
    $max = $_GET['max'];
    $boolean = isset($_GET['check']) ? $_GET['check'] : NULL;
    $check_double;
    if ($boolean == NULL) {
        $check_double = false;
    } else {
        foreach ($boolean as $value) {
            $check_double = $value;
        }
    }
    //  tạo mảng random
    function tao_mang($so_ptu, $min, $max, $check_double)
    {
        $arr = [];
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

    // bài 1

    $arr1 = tao_mang($element, $min, $max, $check_double);

    $count = 0;
    $arr_b1 = $arr1;
    function plus_array($a)
    {
        global $count;
        if ($a % 3 == 0 || $a % 5 == 0) {
            $count += $a;
        }
    }
    array_map("plus_array", $arr_b1);
    echo "================ bài 1 ===============<br>";
    echo "<pre>";
    var_dump($count);

    // bài 2

    function bubble_sort($a)
    {
        for ($i = 0; $i < count($a); $i++) {
            for ($j = $i + 1; $j < count($a); $j++) {
                if ($a[$i] > $a[$j]) {
                    $check = $a[$i];
                    $a[$i] = $a[$j];
                    $a[$j] = $check;
                }
            }
        }
        return $a;
    }
    $arr_b2 = $arr1;
    echo "================ bài 2 ===============<br>";
    echo "<pre>";
    var_dump(bubble_sort($arr_b2));

    // bài 3
    $arr_b3 = $arr1;
    $arr_empty = [];
    $arr_empty1 = [];
    //  tính giai thừa sử dụng đệ quy
    function de_quy($input)
    {
        if ($input == 1)
            return 1;
        return $input * de_quy($input - 1);
    }
    // áp dụng công thức tính tổ hợp
    $to_hop = de_quy($element) / (de_quy(3) * de_quy($element - 3));

    for ($play = 0; $play < $to_hop; $play++) {

        $flag = true;

        if (count($arr_empty) === 0) {
            $a_array_1 = array_rand($arr_b3, 3);
            foreach ($a_array_1 as $insert1) {
                $arr_empty1[] = $arr_b3[$insert1];
            }
            array_push($arr_empty, $arr_empty1);
            $arr_empty1 = [];
        } else {
            while ($flag) {
                $count = 0;
                $arr_empty1 = [];
                $a_array = array_rand($arr_b3, 3);
                foreach ($a_array as $insert) {
                    $arr_empty1[] = $arr_b3[$insert];
                }

                foreach ($arr_empty as $value) {
                    $check = array_diff($value, $arr_empty1);
                    if ($check === []) {
                        $count++;
                    }
                }
                if ($count == 0) {
                    array_push($arr_empty, $arr_empty1);
                    $flag = false;
                }
            }
        }
    }
    echo "================ bài 3 ===============<br>";
    var_dump(count($arr_empty));
    foreach ($arr_empty as $values) {
        echo "<pre>";
        var_dump($values);
        if ($values[0] + $values[1] > $values[2] && $values[1] + $values[2] > $values[0] && $values[0] + $values[2] > $values[1]) {
            echo "<br>thỏa mãn điều kiện hình thành tam giác <br>";
            $cv = $values[0] + $values[1] + $values[2];
            $p = $cv / 2;
            $h = 2 * (sqrt($p * ($p - $values[0]) * ($p - $values[1]) * ($p - $values[2])) / $values[0]);
            $s = ($values[0] * $h) / 2;
            echo "chu vi = $cv <br>";
            echo "dien tich = $s";
        } else {
            echo "<br>ko thỏa mãn điều kiện hình thành tam giác <br>";
        }
    }

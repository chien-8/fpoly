<?php
    $name =$_GET['name'];
    $gender=$_GET['gender'];
    $age=$_GET['age'];
    
    $age=2021-$age;

    if($gender==1 && $age>=20 || $gender==2 && $age>=18){
        echo "đủ điều kiện kết hôn";
    }else{
        echo "chưa đủ điều kiện kết hôn";
    }

   
?>

<form action="lap1-bai2.php" methop="get">
    <label>Tên</label>
    <input type="text" name="name">
    <br>
    <label>năm sinh</label>
    <input type="text" name="age">
    <br>
    <label>giới tính</label>
    <input type="text" name="gender">
    <br>
    <button type="submit">submit</button>
</form>
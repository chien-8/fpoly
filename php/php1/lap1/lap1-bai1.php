<?php
    $so =$_GET['so'];
    
    if($so % 2 ==0){
        echo "số vừa nhập là số chẵn";
    }else{
        echo "số vừa nhập là số lẻ";
    }
?>

<form  methop="get">
    <label>nhập số</label>
    <input type="text" name="so">
    <br>
    <button type="submit">submit</button>
</form>
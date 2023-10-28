<form action="baitap2.php" methop="get">
    <label>số a</label>
    <input type="text" name="soa">
    <br>
    <label>số b</label>
    <input type="text" name="sob">
    <br>
    <label>số c</label>
    <input type="text" name="soc">
    <br>
    <button type="submit">submit</button>
</form>

<?php
$a=$_GET['soa'];
$b=$_GET['sob'];
$c=$_GET['soc'];


$chuvi=$a+$b+$c;

$dientich=(sqrt($chuvi*($chuvi-$a)*($chuvi-$b)*($chuvi-$c)));
if($a<0||$b<0||$c<0 && (($a + $b) <= $c) || (($a + $c) <= $b) || (($b + $c) <= $a)){
    echo "ko thể hình thành tam giác";
}else{
    
    echo "chu vi tam giác là : $chuvi<br>";
    echo "dien tich tam giác là : $dientich";

}



?>
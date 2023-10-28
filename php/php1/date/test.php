<?php 
//27/11/2021
$today=date("d/m/Y");
echo $today;
echo "<br>";
echo time();

$ngaySinhYen=strtotime("2002-11-15 +10 months");
echo $ngaySinhYen;
echo "<br>";
echo date("D,d/m/Y",$ngaySinhYen);

?>
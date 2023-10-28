<?php
   $a=$_GET['soa'];
   $b=$_GET['sob'];
   $c=$_GET['soc'];
   
   $detal=$b*$b-4*$a*$c;
   if($detal<0){
       echo "phương trình vo nghiệm";
   }
   else if($detal>0){
       $a1=((-$b+sqrt($detal))/2*$a);
       $a2=((-$b-sqrt($detal))/2*$a);
       echo "nghiệm 1 : $a1<br>";
       echo "nghiệm 2 : $a2";
   }else{
       $b1=((-$b)/2*$a);
       echo "nghiệm kép : $b1";
   }

?>
<form action="baitap1.php" methop="get">
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

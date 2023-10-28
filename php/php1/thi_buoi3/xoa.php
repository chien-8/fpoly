<?php 
require_once "db.php";
if(isset($_GET['id'])){
    $id=$_GET['id'];
}
$sql="delete from cars where id='$id'";
$refult=getConnect();
           $stmt=$refult->prepare($sql);
           $stmt->execute();
           if($refult){
             header('location: index.php');
           }
?>

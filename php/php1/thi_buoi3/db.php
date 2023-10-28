<?php 
 
 function getConnect(){
     $connect=new PDO("mysql:host=127.0.0.1;dbname=thi_php1_lan1;charset=utf8","root","");
     return $connect;
 }
function execute($sql,$getAll=true){
    $connect=getConnect();
    $stmt=$connect->prepare($sql);
    $stmt->execute();
    $data=$stmt->fetchAll();
    if($getAll){
        return $data;
    }
    return count($data)==1 ? $data[0]:$data;
}
?>

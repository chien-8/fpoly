<?php
   $mysqli = new mysqli("localhost","root","","php1_asm1");
?>
<?php 

function getConnet(){
    $connet=new PDO("mysql:host=127.0.0.1;dbname=php1_asm1;charset=utf8", "root", "");
    return $connet;
}

function executeQueRY($sql,$getAll=true){
    $connet=getConnet();
    $stmt=$connet->prepare($sql);
    $stmt->execute();
    $data=$stmt->fetchAll();
    if($getAll){
        return $data;
    }
    return count($data)>0 ? $data[0]:$data;
}

?>
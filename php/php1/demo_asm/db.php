<?php 

function getConnect(){
    $connect = new PDO("mysql:host=127.0.0.1;dbname=php1_lab4;charset=utf8", "root", "");
    return $connect;
}

function executeQuery($sql, $getAll = true){
    $connect = getConnect();
    $stmt = $connect->prepare($sql);
    $stmt->execute();
    $data = $stmt->fetchAll();
    if($getAll){
        return $data;
    }
    return count($data) > 0 ? $data[0] : $data;
}


?>
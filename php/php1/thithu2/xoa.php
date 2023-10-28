<?php
    require_once "db.php";

    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

    $sql = "DELETE FROM doctors WHERE id=$id";
    $result = getConnect();
    $stmt=$result->prepare($sql);
    $stmt->execute();
    header('location: index.php');
    
?>





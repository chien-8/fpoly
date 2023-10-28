<?php
    require_once './db.php';
?>
<?php
    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

?>
<?php
    $sql = "DELETE FROM users WHERE id=$id";
    $result = mysqli_query($mysqli, $sql);
    header('location: a.php');
    
?>
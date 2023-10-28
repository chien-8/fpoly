<?php
    include_once 'db.php';
?>
<?php
    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

?>
<?php
    $sql = "DELETE FROM employees WHERE id=$id";
    $result = mysqli_query($mysqli, $sql);
    header('location: index.php');
    
?>
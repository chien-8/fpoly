<?php
    require_once './db.php';

?>


<?php
    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

?>
<?php
    $sql = "SELECT * FROM companies where id=$id";
    $result = mysqli_query($mysqli, $sql);
    $row = mysqli_fetch_array($result);
    
?>
<?php
    if (isset($_POST['sua2'])) {
        $id = $_POST['id'];
        $name  = $_POST['name'];
        if($row){
            if(empty($_FILES['logo']['name'])){
                $logo=$row['logo'];
            }else{
                $logo = $_FILES['logo']['name'];
                $tmp = $_FILES['logo']['tmp_name'];
            }
        }
        
        $address  = $_POST['address'];
        $sql = "UPDATE companies SET id='$id',name='$name',logo='$logo',address='$address' where id=$id";
        move_uploaded_file($tmp, './img/'. $logo);
        $result = mysqli_query($mysqli, $sql);
        if ($result) {
            header('location: index.php');
        }
    }

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="">id</label>
        <input type="number" name="id" value="<?= $row['id'] ?>"> <br>

        <label for="">name</label><br>
        <input type="text" name="name" value="<?= $row['name'] ?>"> <br>

        <label for="">logo</label><br>
        <input type="file" name="logo" value="<?= $row['logo'] ?>"> <br>

        <label for="">address</label><br>
        <input type="text" name="address" value="<?= $row['address'] ?>"> <br>

        <input type="submit" name="sua2" value="sua"> <br>

    </form>
</body>

</html>
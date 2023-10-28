<?php require_once './db.php'; ?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body >
    <?php
    if (isset($_POST['submit'])) {
        $id = $_POST['id'];
        $name = $_POST['name'];
        $logo = $_FILES['logo']['name'];
        $tmp = $_FILES['logo']['tmp_name'];
        $address = $_POST['address'];
        $sql = "INSERT INTO companies (id,name,logo,address)
                        VALUES ('$id','$name','$logo','$address')";
        move_uploaded_file($tmp, './img/'. $logo);
        $result = mysqli_query($mysqli, $sql);
        if ($result) {
            header('location: index.php');
        }
    }

    ?>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="">id</label>
        <input type="number" name="id"> <br>

        <label for="">name</label><br>
        <input type="text" name="name"> <br>

       

        <label for="">logo</label><br>
        <input type="file" name="logo"> <br>

        <label for="">address</label><br>
        <input type="text" name="address"> <br>


        <input type="submit" name="submit" value="chèn"> <br>

    </form>
</body>

</html>
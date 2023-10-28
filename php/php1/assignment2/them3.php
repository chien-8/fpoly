<?php include_once 'db.php' ?>
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
        $name = $_POST['name'];
        $email  = $_POST['email'];
        $password  = password_hash($_POST['password'],PASSWORD_DEFAULT);
        $avatar = $_FILES['avatar']['name'];
        $tmp = $_FILES['avatar']['tmp_name'];
        $role  = $_POST['role'];
        $sql = "INSERT INTO users (name,email,password,avatar,role)
                        VALUES ('$name','$email','$password','$avatar','$role')";
        move_uploaded_file($tmp, './img/'. $avatar);
        $result = mysqli_query($mysqli, $sql);
        if ($result) {
            header('location: a.php');
        }
    }

    ?>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="">name</label>
        <input type="text" name="name"> <br>

        <label for="">email</label><br>
        <input type="email" name="email"> <br>

        <label for="">password</label><br>
        <input type="text" name="password"> <br>

        <label for="">avatar</label><br>
        <input type="file" name="avatar"> <br>

        <label for="">role</label><br>
        <input type="text" name="role"> <br>

        <input type="submit" name="submit" value="chèn"> <br>

    </form>
</body>

</html>
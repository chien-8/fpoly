<?php
    require_once './db.php';

?>


<?php
    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

?>
<?php
    $sql = "SELECT * FROM users where id=$id";
    $result = mysqli_query($mysqli, $sql);
    $row = mysqli_fetch_array($result);
    
?>
<?php
    if (isset($_POST['sua3'])) {
        $name = $_POST['name'];
        $email  = $_POST['email'];
        $password  = password_hash($_POST['password'],PASSWORD_DEFAULT);
        $avatar = $_FILES['avatar']['name'];
        $tmp = $_FILES['avatar']['tmp_name'];
        $role  = $_POST['role'];
        $sql = "UPDATE users SET name='$name',email='$email',password='$password',avatar='$avatar',role='$role' WHERE id=$id";
        move_uploaded_file($tmp, './img/'. $avatar);
        $result = mysqli_query($mysqli, $sql);
        if ($result) {
            header('location: a.php');
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
        <label for="">name</label>
        <input type="text" name="name" value="<?= $row['name'] ?>"> <br>

        <label for="">email</label><br>
        <input type="email" name="email" value="<?= $row['email'] ?>"> <br>

        <label for="">password</label><br>
        <input type="password" name="password" value="<?= $row['password'] ?>"> <br>

        <label for="">avatar</label><br>
        <input type="file" name="avatar" value="<?= $row['avatar'] ?>"> <br>

        <label for="">role</label><br>
        <input type="text" name="role" value="<?= $row['role'] ?>"> <br>

        <input type="submit" name="sua3" value="sua"> <br>

    </form>
</body>

</html>
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
        $birth_date = $_POST['birth_date'];
        $salary = $_POST['salary'];
        $avatar = $_FILES['avatar']['name'];
        $tmp = $_FILES['avatar']['tmp_name'];
        $identity_card_number = $_POST['identity_card_number'];
        $sql = "INSERT INTO employees (name,birth_date,salary,avatar,identity_card_number)
                        VALUES ('$name','$birth_date','$salary','$avatar','$identity_card_number')";
        move_uploaded_file($tmp, './img/'. $avatar);
        $result = mysqli_query($mysqli, $sql);
        if ($result) {
            header('location: index.php');
        }
    }

    ?>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="">name</label>
        <input type="text" name="name"> <br>

        <label for="">birth_date</label><br>
        <input type="date" name="birth_date"> <br>

        <label for="">salary</label><br>
        <input type="number" name="salary"> <br>

        <label for="">avatar</label><br>
        <input type="file" name="avatar"> <br>

        <label for="">identity_card_number</label><br>
        <input type="text" name="identity_card_number"> <br>

        <input type="submit" name="submit" value="chèn"> <br>

    </form>
</body>

</html>
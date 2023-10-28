<?php
    include_once 'db.php';

?>
<?php
    if (isset($_GET["id"])) {
        $id = $_GET['id'];
    }

?>
<?php
    $sql = "SELECT * FROM employees WHERE id=$id";
    $result = mysqli_query($mysqli, $sql);
    $row = mysqli_fetch_array($result);
    
?>
<?php
    if (isset($_POST['sua'])) {
        $name = $_POST['name'];
        $birth_date = $_POST['birth_date'];
        $salary = $_POST['salary'];
        $avatar = $_FILES['avatar']['name'];
        $tmp = $_FILES['avatar']['tmp_name'];
        $identity_card_number = $_POST['identity_card_number'];
        $sql = "UPDATE employees SET name='$name',birth_date='$birth_date',salary='$salary',avatar='$avatar',identity_card_number='$identity_card_number' WHERE id=$id";
        move_uploaded_file($tmp, './img/'. $avatar);
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
        <label for="">name</label>
        <input type="text" name="name" value="<?= $row['name'] ?>"> <br>

        <label for="">birth_date</label><br>
        <input type="date" name="birth_date" value="<?= $row['birth_date'] ?>"> <br>

        <label for="">salary</label><br>
        <input type="number" name="salary" value="<?= $row['salary'] ?>"> <br>

        <label for="">avatar</label><br>
        <input type="file" name="avatar" value="<?= $row['avatar'] ?>"> <br>

        <label for="">identity_card_number</label><br>
        <input type="text" name="identity_card_number" value="<?= $row['identity_card_number'] ?>"> <br>

        <input type="submit" name="sua" value="sua"> <br>

    </form>
</body>

</html>
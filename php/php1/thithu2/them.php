<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    require_once "db.php";
    if (isset($_POST['submit'])) {
        $name = $_POST['name'];
        $hospital_id =$_POST['hospital_id'];
        $avatar = $_FILES['avatar']['name'];
        $tmp = $_FILES['avatar']['tmp_name'];
        $birth_date = $_POST['birth_date'];
        $salary = $_POST['salary'];
        $phone_number  = $_POST['phone_number'];
        $sql = "INSERT INTO doctors (name,hospital_id,avatar,birth_date,salary,phone_number)
                        VALUES ('$name','$hospital_id','$avatar','$birth_date','$salary','$phone_number')";
        move_uploaded_file($tmp, './img/'. $avatar);
        $result = getConnect(); 
        $stmt=$result->prepare($sql);
        $stmt->execute();
        if ($result) {
            header('location: index.php');
        }
    }

    
    ?>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="">name</label>
        <input type="text" name="name"><br>
        <label for="">hospital_id</label>
        <input type="number" name="hospital_id"><br>
        <label for="">avatar</label>
        <input type="file" name="avatar"><br>
        <label for="">birth_date</label>
        <input type="date" name="birth_date"><br>
        <label for="">salary</label>
        <input type="text" name="salary"><br>
        <label for="">phone_number</label>
        <input type="text" name="phone_number"><br>
        <input type="submit" name="submit" value="thêm">
    </form>
</body>
</html>
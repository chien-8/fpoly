<?php 
require_once "db.php";

if (isset($_GET["id"])) {
    $id = $_GET['id'];
}
$sql = "SELECT * FROM doctors WHERE id='$id'";
$doctor=executeQuery($sql,false);
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
<?php 

    if (isset($_POST['sua'])) {
        $name = $_POST['name'];
        $hospital_id =$_POST['hospital_id'];
        if($doctor){
            if(empty($_FILES['avatar']['name'])){
                $avatar=$doctor['avatar'];
            }else{
                $avatar = $_FILES['avatar']['name'];
                $tmp = $_FILES['avatar']['tmp_name'];
            }
        }
        $birth_date = $_POST['birth_date'];
        $salary = $_POST['salary'];
        $phone_number  = $_POST['phone_number'];
        $sql = "update doctors set name='$name',hospital_id='$hospital_id',avatar='$avatar',birth_date='$birth_date',salary='$salary',phone_number='$phone_number' where id='$id'";
        move_uploaded_file($tmp, './img/'.$avatar);
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
        <input type="text" name="name" value="<?= $doctor['name'] ?>"><br>
        <label for="">hospital_id</label>
        <input type="number" name="hospital_id" value="<?= $doctor['hospital_id'] ?>"><br>
        <label for="">avatar</label>
        <input type="file" name="avatar" value="<?= $doctor['avatar'] ?>"><br>
        <label for="">birth_date</label>
        <input type="date" name="birth_date" value="<?= $doctor['birth_date'] ?>"><br>
        <label for="">salary</label>
        <input type="text" name="salary" value="<?= $doctor['salary'] ?>"><br>
        <label for="">phone_number</label>
        <input type="text" name="phone_number" value="<?= $doctor['phone_number'] ?>"><br>
        <input type="submit" name="sua" value="sua">
    </form>
</body>
</html>
<?php 
require_once "db.php";
if(isset($_GET['id'])){
    $id=$_GET['id'];
}
$sql="select*from cars where id='$id'";
$car=execute($sql,false);
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
       
       if(isset($_POST['sua'])){
           $model_no=$_POST['model_no'];
           $manufacturer_id =$_POST['manufacturer_id'];
           if($car){
                if(empty($_FILES['image']['name'])){
                    $image=$car['image'];
                }else{
                    $image=$_FILES['image']['name'];
                    $tmp=$_FILES['image']['tmp_name'];
                }
           }
          
           $price=$_POST['price'];
           $manufacturer_date=$_POST['manufacturer_date'];
           $sql="update cars set model_no='$model_no',manufacturer_id='$manufacturer_id',image='$image',price='$price',manufacturer_date='$manufacturer_date' where id='$id'";
           move_uploaded_file($tmp,'./img/'.$image);
           $refult=getConnect();
           $stmt=$refult->prepare($sql);
           $stmt->execute();
           if($refult){
             header('location: index.php');
           }

       }
    ?>


    <form action="" method="post" enctype="multipart/form-data">
        <label>model_no</label>
        <input type="text" name="model_no" value="<?=$car['model_no'] ?>"><br>
        <label>manufacturer_id</label>
        <input type="number" name="manufacturer_id" value="<?=$car['manufacturer_id'] ?>"><br>
        <label>image</label>
        <input type="file" name="image" value="<?=$car['image'] ?>"><br>
        <label>price</label>
        <input type="text" name="price" value="<?=$car['price'] ?>"><br>
        <label>manufacturer_date</label>
        <input type="date" name="manufacturer_date" value="<?=$car['manufacturer_date'] ?>"><br>
        <input type="submit" name="sua" value="sua">
    </form>
</body>
</html>
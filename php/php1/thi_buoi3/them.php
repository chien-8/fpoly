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
       if(isset($_post['submit'])){
           $model_no=$_POST['model_no'];
           $manufacturer_id =$_POST['manufacturer_id '];
           $image =$_FILES['image']['name'];
           $tmp=$_FILES['image']['tmp_name'];
           $price=$_POST['price'];
           $manufacturer_date=$_POST['manufacturer_date'];
           $sql="insert into cars (model_no,manufacturer_id,image,price,manufacturer_date) values ('$model_no','$manufacturer_id',' $image','$price','$manufacturer_date')";
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
        <input type="text" name="model_no"><br>
        <label>manufacturer_id</label>
        <input type="number" name="manufacturer_id"><br>
        <label>image</label>
        <input type="file" name="image"><br>
        <label>price</label>
        <input type="text" name="price"><br>
        <label>manufacturer_date</label>
        <input type="date" name="manufacturer_date"><br>
        <input type="submit" name="submit" value="them">
    </form>
</body>
</html>
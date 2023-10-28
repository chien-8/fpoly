<?php 
    $file=$_FILES['image'];
    // echo "<pre>";
    // var_dump($file);
    // die;
    move_uploaded_file($file['tmp_name'],"../uploads/".$file['name']);
    echo "done!";



?>

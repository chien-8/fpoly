<?php
session_start();
// nếu không tồn tại phần tử 'auth' của session hoặc giá trị của phần tử này = null
// thì điều hướng website về trang login
if(!isset($_SESSION['auth']) || $_SESSION['auth'] == null){
    header('location: login.php');die;
}

// tạo session mới

?>
<h2>Xin chào <?= $_SESSION['auth']['name']?></h2>
<?php 
require_once './db.php';

$getUsersQuery="select*from users";
$users=executeQuery($getUsersQuery,true);

?>
<table>
     <thead>
         <th>name</th>
         <th>email</th>
         <th>password</th>
         <th>avatar</th>
         <th>role</th>
         <th>
             <a href="them3.php">them</a>
         </th>
     </thead>
     <tbody>
         <?php foreach($users as $p) :  ?>
             <tr>
                 <td> <?= $p['name'] ?> </td>
                 <td> <?= $p['email'] ?> </td>
                <td> <?= $p['password'] ?> </td>
                 <td> <img src="./img/<?= $p['avatar'] ?>" width="150px"> </td>
                 <td> <?=$p['role'] ?> </td>
                 <td><a href="sua3.php?id= <?php echo $p['id'] ?>" >sua</a> | <a href="xoa3.php?id= <?php echo $p['id'] ?>">xoa</a> </td>
             </tr>
         <?php endforeach ?>
     </tbody>
 </table>
 <a href="index.php">xem thông tin</a>
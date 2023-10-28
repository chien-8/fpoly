<?php 

require_once './db.php';
// lấy danh sách các sản phẩm và danh mục của toàn sản phẩm
$getEmployeesQuery="select employees.*,companies.name as congty from employees  join companies on employees.company_id=companies.id";
$employees=executeQuery($getEmployeesQuery,true);


//lấy ra ranh mục
$getCompaniesQuery="select*from companies";
$companies=executeQuery($getCompaniesQuery,true);
//lấy ra urers
?>
 <table>
     <thead>
         <th>name</th>
         <th>birth_date</th>
         <th>salary</th>
         <th>avatar</th>
         <th>identity_card_number</th>
         <th>công ty</th>
         <th>
             <a href="them1.php">them</a>
         </th>
     </thead>
     <tbody>
         <?php foreach($employees as $p) :  ?>
             <tr>
                 <td> <?= $p['name'] ?> </td>
                 <td> <?= $p['birth_date'] ?> </td>
                <td> <?= $p['salary'] ?> </td>
                 <td> <img src="./img/<?= $p['avatar'] ?>" width="150px"> </td>
                 <td> <?= $p['identity_card_number'] ?> </td>
                 <td> <?=$p['congty'] ?> </td>
                 <td><a href="sua1.php?id= <?php echo $p['id'] ?>" >sua</a> | <a href="xoa1.php?id= <?php echo $p['id'] ?>">xoa</a> </td>
             </tr>
         <?php endforeach ?>
     </tbody>
 </table>
<br>
<br>
 <table>
     <thead>
         <th>id</th>
         <th>name</th>
         <th>logo</th>
         <th>address</th>
         <th>
             <a href="them2.php">them</a>
         </th>
     </thead>
     <tbody>
         <?php foreach($companies as $p) :  ?>
             <tr>
                 <td> <?= $p['id'] ?> </td>
                 <td> <?= $p['name'] ?> </td>
                 <td> <img src="./img/<?= $p['logo'] ?>" width="150px"> </td>
                 <td> <?=$p['address']?></td>
                 <td><a href="sua2.php?id= <?php echo $p['id'] ?>" >sua</a> | <a href="xoa2.php?id= <?php echo $p['id'] ?>">xoa</a> </td>
             </tr>
         <?php endforeach ?>
     </tbody>
 </table>
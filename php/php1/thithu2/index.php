<?php 
  require_once "db.php";

  $getDoctorsQuery="select doctors.*,hospitals.name as tenbenhvien from doctors join  hospitals on doctors.hospital_id=hospitals.id";
  $doctors=executeQuery($getDoctorsQuery,true);


  $getHospitalssQuery="select*from hospitals";
  $hospitals=executeQuery($getHospitalssQuery,true);

?>

<table>
    <thead>
        <th>name</th>
        <th>tenbenhvien </th>
        <th>avatar </th>  
        <th>birth_date </th>
        <th>salary </th>
        <th>phone_number </th>
        <th>
             <a href="them.php">them</a>
         </th>
    </thead>
    <tbody>
        <?php foreach($doctors as $p): ?>
             <tr>
                 <td><?=$p['name'] ?></td>
                 <td><?=$p['tenbenhvien'] ?></td>
                 <td><img src="./img/<?=$p['avatar'] ?>" width="150px"></td>
                 <td><?=$p['birth_date'] ?></td>
                 <td><?=$p['salary'] ?></td>
                 <td><?=$p['phone_number'] ?></td>
                 <td><a href="sua.php?id= <?php echo $p['id'] ?>" >sua</a> | <a href="xoa.php?id= <?php echo $p['id'] ?>">xoa</a> </td>
             </tr>
        <?php endforeach ?>
    </tbody>
</table>


<table>
    <thead>
        <th>id</th>
        <th>name</th>
        <th>logo</th>
        <th>founding_year  </th>
        <th>address  </th>
        <th>
            <a href="them1.php">them</a>
         </th>
    </thead>
    <tbody>
        <?php foreach($hospitals as $p): ?>
             <tr>
                 <td><?=$p['id'] ?></td>
                 <td><?=$p['name'] ?></td>
                 <td><img src="./img/<?=$p['logo'] ?>" width="150px"></td>
                 <td><?=$p['founding_year'] ?></td>
                 <td><?=$p['address'] ?></td>
                 <td><a href="sua1.php?id= <?php echo $p['id'] ?>" >sua</a> | <a href="xoa1.php?id= <?php echo $p['id'] ?>">xoa</a> </td>
             </tr>
        <?php endforeach ?>
    </tbody>
</table>
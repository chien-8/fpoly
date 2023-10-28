<?php 
require_once "db.php";
$getcars="select cars.*,manufacturers.name as tencongty from cars join  manufacturers on cars.manufacturer_id =manufacturers.id";
$cars=execute($getcars,true);


$getmanufacturers="select*from manufacturers";
$manufacturers=execute($getmanufacturers,true);



?>
<table>
    <thead>
        <th>model_no </th>
        <th>tencongty</th>
        <th>image </th>
        <th>price </th>
        <th>manufacturer_date </th>
        <th><a href="them.php">them</a></th>
    </thead>
    <tbody>
        <?php foreach($cars as $p): ?>
        <tr>
            <td><?=$p['model_no'] ?></td>
            <td><?=$p['tencongty'] ?></td>
            <td><?=$p['image'] ?></td>
            <td><?=$p['price'] ?></td>
            <td><?=$p['manufacturer_date'] ?></td>
            <td><a href="sua.php?id=<?php echo $p['id']?>">sua</a>|<a href="xoa.php?id=<?php echo $p['id']?>">xoa</a></td>
        </tr>
        <?php endforeach ?>
    </tbody>
</table>
<br>

<table>
    <thead>
        <th>id </th>
        <th>name </th>
        <th>logo  </th>
        <th>owner_by  </th>
        <th>country  </th>
        <th>address</th>
        <th><a href="them.php">them</a></th>
    </thead>
    <tbody>
        <?php foreach($manufacturers as $p): ?>
        <tr>
            <td><?=$p['id'] ?></td>
            <td><?=$p['name'] ?></td>
            <td><?=$p['logo'] ?></td>
            <td><?=$p['owner_by'] ?></td>
            <td><?=$p['country'] ?></td>
            <td><?=$p['address'] ?></td>

            <td><a href="sua.php?id=<?php echo $p['id']?>">sua</a>|<a href="xoa.php?id=<?php echo $p['id']?>">xoa</a></td>
        </tr>
        <?php endforeach ?>
    </tbody>
</table>
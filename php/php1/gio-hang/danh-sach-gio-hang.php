<?php
session_start();
var_dump($_SESSION['cart']);
require_once 'data.php';

?>

<table border="1">
    <thead>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th></th>
    </thead>
    <tbody>
        <?php foreach($products as $key => $value): ?>
            <tr>
                <td><?= $value['id']?></td>
                <td><?= $value['name']?></td>
                <td><?= $value['price']?></td>
                <td>
                    <a href="add-to-cart.php?id=<?= $value['id']?>">Add</a>
                </td>
            </tr>
        <?php endforeach?>
    </tbody>
</table>
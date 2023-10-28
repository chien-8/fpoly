<?php
require_once 'db.php';

$sql = "SELECT*from brands";

$reusult = mysqli_query($mysqli, $sql);
?>
<a href="them.php">thêm</a>
<table>
    <thead>
        <th>name</th>
        <th>logo</th>
        <th>founding_year</th>
        <th>owner_by</th>
    </thead>
</table>
<tbody>
    <?php while ($row = $reusult->fetch_assoc()) : ?>
        <tr>
            <td><?= $row['name'] ?></td>
            <td><?= $row['logo'] ?></td>
            <td><?= $row['founding_year'] ?></td>
            <td><?= $row['owner_by'] ?></td>
        </tr>


    <?php endwhile ?>
</tbody>
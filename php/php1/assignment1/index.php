<?php include_once 'db.php';

$sql = "SELECT * FROM employees";

$result = mysqli_query($mysqli, $sql);


?>
<a href="them.php">them</a>
<table>
    <thead>
        <th>name</th>
        <th>birth_date</th>
        <th>salary</th>
        <th>avatar</th>
        <th>identity_card_number</th>
       
    </thead>
    <tbody>
        <?php while ($row =  $result->fetch_assoc()) :  ?>
            <tr>
                <td> <?= $row['name'] ?> </td>
                <td> <?= $row['birth_date'] ?> </td>
                <td> <?= $row['salary'] ?> </td>
                <td> <img src="./img/<?= $row['avatar'] ?>" width="150px"> </td>
                <td> <?= $row['identity_card_number'] ?> </td>
                <td><a href="sua.php?id= <?php echo $row['id'] ?>" >sua</a> | <a href="xoa.php?id= <?php echo $row['id'] ?>">xoa</a> </td>
            </tr>
        <?php endwhile ?>
    </tbody>
</table>
<?php


?>
<a href="test.php?name=someone&gender=2">Click me</a>
<form action="test.php" methop="get">
    <label>Tên</label>
    <input type="text" name="name">
    <br>
    <label>Mã sinh viên</label>
    <input type="text" name="ma">
    <br>
    <label>Khóa</label>
    <input type="text" name="khoa">
    <br>
    <label>điểm web1013</label>
    <input type="text" name="diem1">
    <br>
    <label>điểm web2033</label>
    <input type="text" name="diem2">
    <br>
    <select name="gender" id="">
        <option value="1">nam</option>
        <option value="2">nữ</option>
        <option value="3">khác</option>
    </select>
    <br>
    <button type="submit">submit</button>
</form>
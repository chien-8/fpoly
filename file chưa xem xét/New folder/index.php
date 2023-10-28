<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Lab 2</title>
</head>

<body>
    <div class="container col-lg-3">
        <!-- ==================BÀI 2============ -->

        <p class="text-center">Lab_4</p>
        <form action="./array.php" method="get">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">mời nhập vào số phần tử</label>
                <input type="number" class="form-control" name="element">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">mời nhập vào min</label>
                <input type="number" class="form-control" name="min">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">mời nhập vào max</label>
                <input type="number" class="form-control" name="max">
            </div>
            <div class="mb-3 form-check">
                <input type="radio" class="form-check-input" id="exampleCheck1" name="check[]" value="true">
                <label class="form-check-label" for="exampleCheck1">true</label>
                <br>
                <input type="radio" class="form-check-input" id="exampleCheck2" name="check[]" value="false">
                <label class="form-check-label" for="exampleCheck2">false</label>
            </div>
            <button type="submit" class="btn btn-primary w-100" name="submit_lab4">Submit</button>
        </form>

    </div>

</body>

</html>
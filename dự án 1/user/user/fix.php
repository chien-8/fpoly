




<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Danh mục</h1>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary"><a href="index.php?sp=list_user">Danh sách danh mục</a></h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <?php if(is_array($user)){extract($user);}?> 
<form class="row g-3" action="index.php?sp=fix_done_user" enctype="multipart/form-data" method="post">
  <div class="col-6">
    <label for="inputAddress" class="form-label">User name</label>
    <input type="text" class="form-control" id="inputUserName" placeholder="Name ..." name="name" value="<?=$name?>"> 
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">Role</label>
    <input type="number" class="form-control" id="inputRole" name="role" value="<?=$role?>">
  </div>
  <div class="col-md-12">
    <label for="inputEmail4" class="form-label">Email</label>
    <input type="email" class="form-control" id="inputEmail4" name="email" value="<?=$email?>">
  </div>
  <div class="col-md-12">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form-control" id="inputPassword4" name="password" value="<?=$password?>">
  </div>
  
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Apartment, studio, or floor" name="address" value="<?=$address?>">
  </div>
  <input type="hidden" name="id" value="<?=$idUser?>" id="">
  <div class="col-12">
    <button type="submit" class="btn btn-primary" name="fix_user">Add new</button>
  </div>
</form>
                        
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->
                        
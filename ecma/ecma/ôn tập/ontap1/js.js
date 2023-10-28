function KiemTra() {
    var sl = document.getElementById("sl");
    var sanpham = document.getElementById("sanpham");
    var dongia = document.getElementById("dongia");
    var loai = document.getElementById("loai").value;

    var error1 = document.getElementById("error1");
    var error2 = document.getElementById("error2");
    var error3 = document.getElementById("error3");
    var error4 = document.getElementById("error4");
    var error6 = document.getElementById("error6");


    var nhanhang = document.getElementsByName("nhanhang");



    if (sl.value.length == 0) {
        sl.style.border = "1px solid red";
        error1.innerHTML = "Số lượng không được để trống!";
        return false;
    } else if (isNaN(sl.value) == true) {
        sl.style.border = "1px solid red";
        error1.innerHTML = "Số lượng phải là số!";
        return false;
    }
    else {
        error1.innerHTML = "";
        
    }


    if (sanpham.value.length == 0) {
        sanpham.style.border = "1px solid red";
        error2.innerHTML = "Tên sản phẩm không được để trống!";
        return false;
    } else {
        error2.innerHTML = "";
        
    }


    if (dongia.value.length == 0) {
        dongia.style.border = "1px solid red";
        error3.innerHTML = "Đơn giá không được để trống!";
        return false;
    } else if (isNaN(dongia.value) == true) {
        dongia.style.border = "1px solid red";
        error3.innerHTML = "Đơn giá  phải là số!";
        return false;
    } else {
        error3.innerHTML = "";
        
    }



    if (nhanhang[0].checked !== true & nhanhang[1].checked !== true) {
        error4.innerHTML = "Bạn phải chọn nơi nhận hàng!";
        return false;
    } else {
        error4.innerHTML = "";
    }

    if (loai.value == 0) {
        error6.innerHTML = " Bạn phải chọn loại!";
        return false;
    } else {
        error6.innerHTML = "";

    }
    var confi =confirm('đơn hàng của bạn\n'+sl+'\n'+sanpham+'\n'+dongia+'\n'+loai+'\n'+nhanhang);
}
function show(rdb) {
    const nt1 = document.getElementById("nt1");
    var fee = document.getElementById('fee').value;
    if (rdb.checked && rdb.value == "out") {
        nt1.style.display = "block";
        confirm('phí vận chuyển:  ' + fee);
    } else {
        nt1.style.display = "none";
        confirm('phí vận chuyển:  0');
    }

}
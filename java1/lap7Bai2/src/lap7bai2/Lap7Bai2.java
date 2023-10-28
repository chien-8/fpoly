package lap7bai2;

public class Lap7Bai2 {

    public static void main(String[] args) {
        danhsachSV<SinhVienIT> svIT = new danhsachSV<SinhVienIT>();
        SinhVienIT sv = new SinhVienIT();
        sv.nhap();
        svIT.nhapDsSV(sv);
        svIT.xuatDsSV();
        svIT.xuatDsHLGioi();
        ///////////////
        danhsachSV<SinhVienBiz> svBiz = new danhsachSV<>();
        SinhVienBiz svb = new SinhVienBiz();
        svb.nhap();
        svBiz.nhapDsSV(svb);
        svBiz.xuatDsSV();
        svBiz.xuatDsHLGioi();
    }

}

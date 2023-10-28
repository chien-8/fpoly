package lap7bai2;

import java.util.ArrayList;
import java.util.List;

public class danhsachSV<T> {

    List<SinhVienFPoLy> ls = (List<SinhVienFPoLy>) new ArrayList<T>();

    public void nhapDsSV(T t) {

        ls.add((SinhVienFPoLy) t);
    }

    public void xuatDsSV() {
        for (SinhVienFPoLy sv : ls) {
            sv.xuat();
        }
    }

    public void xuatDsHLGioi() {
        for (SinhVienFPoLy sv : ls) {
            if (sv.getDiemTB() >= 8) {
                System.out.println("sinh vien co hoc luc gioi");
                sv.xuat();
            }
        }
    }

}

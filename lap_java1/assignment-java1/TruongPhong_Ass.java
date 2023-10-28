
package nhanvien_ass;

import java.util.Scanner;

public class TruongPhong_Ass extends NhanVien_Ass{
      private double trachNhiem;

    public double thuNhap() {
        return this.getLuong() + this.trachNhiem;

    }
    

    public TruongPhong_Ass(double trachNhiem) {
        super();
        this.trachNhiem = trachNhiem;

    }

    public TruongPhong_Ass() {
        super();
        this.trachNhiem = 2;

    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

      @Override
    public void xuatTT(){
        super.xuat();
        System.out.println("Luong trach nhiem: " + this.getTrachNhiem());
    }

    public void nhap1() {
        super.nhap1();
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi nhap luong trach nhiem: ");
        this.trachNhiem = nhap.nextDouble();

    }
}

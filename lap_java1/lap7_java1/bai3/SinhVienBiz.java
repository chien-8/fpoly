package lap7bai2;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienFPoLy{
    private double diemMKT;
    private double diemSale;

    @Override
    public double getDiemTB() {
        return (2*diemMKT+diemSale)/3;
    }

    @Override
    public void nhap() {
        Scanner s=new Scanner(System.in);
        System.out.println("moi ban nhap sv : ");
        System.out.println("nhap ten:");
        super.setHoTen(String.valueOf(s.nextLine()));
        System.out.println("nganh:");
        super.setNganh(String.valueOf(s.nextLine()));
        System.out.println("diem mkt:");
        this.diemMKT=Double.parseDouble(s.nextLine());
        System.out.println("diem sale:");
        this.diemSale=Double.parseDouble(s.nextLine());
    }

}

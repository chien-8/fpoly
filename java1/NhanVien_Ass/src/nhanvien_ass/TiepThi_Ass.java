
package nhanvien_ass;

import java.util.Scanner;

public class TiepThi_Ass extends NhanVien_Ass {
        private double doanhSo;
    private double hoaHong;

    public double thuNhap() {
        return this.getLuong() + this.doanhSo * this.hoaHong;
    }

        @Override
    public void xuatTT(){
        super.xuat();
        System.out.println("Doanh so: " + this.getDoanhSo());
        System.out.println("Hoa hong: " + this.getHoaHong());
    }

    public TiepThi_Ass() {
        super();
        this.doanhSo = 10;
        this.hoaHong = 0.1;

    }
    public TiepThi_Ass(double doanhSo, double hoaHong,
            String manv, String hoten, double luong) {
        super(manv,hoten,luong);
        
    }

    public void nhap1() {
        super.nhap1();// goi nhap của lớp cha
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi nhap doanh so = ");
        this.doanhSo = nhap.nextDouble();
        System.out.println("moi hoa hong= ");
        this.hoaHong = nhap.nextDouble();

    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
}

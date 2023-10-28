package lap5_bai3;

import java.util.Scanner;

public class SanPham_bai3 {

    private String tenSP;
    private double gia;
    static Scanner nhap = new Scanner(System.in);
    public SanPham_bai3(String tenSP, double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public SanPham_bai3() {
        
    }
    
    void nhap() {
        System.out.print("nhap tên sp:");
        this.tenSP = nhap.nextLine();
        System.out.print("nhap giá:");
        this.gia = nhap.nextDouble();
        nhap.nextLine();

    }

    void xuat() {
        System.out.println("tên sp: " + this.tenSP
                + ",giá: " + this.gia);
    }


    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}

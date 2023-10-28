
package lap4bai4;

import java.util.Scanner;


public class SP_Bai4 {
    private String tenSanpham;
    private double donGia;
    private double giamGia;

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    

    public SP_Bai4(String tenSanpham, double donGia, double giamGia) {
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SP_Bai4(String tenSanpham, double donGia) {
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("moi nhap tên sản phẩm:");
        this.tenSanpham = nhap.nextLine();
        System.out.print("mời nhập đơn giá:");
        this.donGia = nhap.nextDouble();
        System.out.print("mời nhập giảm giá:");
        this.giamGia = nhap.nextDouble();
    }

    public void xuat() {
        System.out.println("tên SP: " + this.tenSanpham
                + ",đơn giá: " + this.donGia
                + ",giảm giá: " + this.giamGia
                + ",thuế nhập khẩu: " + this.thueNK());

    }

    private double thueNK() {
        return this.donGia * 0.1;
    }
}

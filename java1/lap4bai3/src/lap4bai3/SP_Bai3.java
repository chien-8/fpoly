
package lap4bai3;

import java.util.Scanner;


public class SP_Bai3 {
    public String tenSanpham;
    double donGia;
    double giamGia;

    public SP_Bai3(String tenSanpham, double donGia, double giamGia) {
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SP_Bai3(String tenSanpham, double donGia) {
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

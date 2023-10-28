package testlap7bai2;

import java.util.Scanner;

abstract public class SinhvienPoly {

    private String hoTen;
    private String nganh;

    abstract double getDiem();

    public SinhvienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhvienPoly() {
        this.hoTen="teen";
        this.nganh="CNTT";
    }

    String getHocLuc() {
        if (this.getDiem() >= 9 && this.getDiem() <= 10) {
            return "xuat sac";
        } else if (this.getDiem() < 9 && this.getDiem() >= 7.5) {
            return " gioi";
        } else if (this.getDiem() < 7.5 && this.getDiem() >= 6.5) {
            return "kha";
        } else if (this.getDiem() < 6.5 && this.getDiem() >= 5) {
            return "TB";
        } else {
            return "yeu";
        }

    }

    void nhap() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi nhap ten: ");
        this.hoTen=nhap.nextLine();
        System.out.println("moi nhap nganh:");
        this.nganh=nhap.nextLine();

    }

    void xuat() {
        System.out.println("Sinh vien POLY:");
        System.out.println("ho ten:" + this.hoTen
                + "nganh: " + this.nganh
                + "hoc luc:" + this.getHocLuc());
    }

}

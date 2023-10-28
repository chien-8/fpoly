package keThua;

import java.util.Scanner;

abstract public class NhanVien {

    private String hoTen;
    private String queQuan;
    abstract double luong();//luong chua biet cach tinh co the la chiu tuong

    public NhanVien(String hoTen, String queQuan) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public NhanVien() {
    }

    void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi nhap ho ten:");
        this.hoTen = nhap.nextLine();
        System.out.println("moi nhap que quan:");
        this.queQuan = nhap.nextLine();
    }

    void xuat() {
        System.out.println("ho ten: " + this.hoTen
                + "que quan: " + this.queQuan);
    }
}

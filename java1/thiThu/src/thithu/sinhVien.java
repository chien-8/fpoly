
package thithu;

import java.util.Scanner;

public class sinhVien {
    private String ten;
    private String maSv;
    private double diem;
    private int tuoi;
    Scanner nhap=new Scanner(System.in);
    void nhap(){
        System.out.println("moi nhap ten:");
        this.ten=nhap.nextLine();
        System.out.println("moi nhap ma:");
        this.maSv=nhap.nextLine();
        System.out.println("moi nhap diem:");
        this.diem=nhap.nextDouble();
        System.out.println("moi nhap tuoi:");
        this.tuoi=nhap.nextInt();
        nhap.nextLine();
    }
    void xuat(){
        System.out.println("tên: "+this.ten
        +"; tuổi: "+this.tuoi
        +"; mã sv: "+this.maSv
        +"; điểm:"+this.diem);
    }

    public sinhVien(String ten, String maSv, double diem, int tuoi) {
        this.ten = ten;
        this.maSv = maSv;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    public sinhVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }
    
}

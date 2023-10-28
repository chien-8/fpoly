
package chientmph16045java;

import java.util.Scanner;

public class HoaQua {
    String ma;
    String ten;
    String nguonGoc;
     double donGia;
    public void nhap(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap tên: ");
        this.ten=nhap.nextLine();
        System.out.println("nhap ma: ");
        this.ma=nhap.nextLine();
        System.out.println("nhap nguồn gốc: ");
        this.nguonGoc=nhap.nextLine();
        System.out.println("nhap đơn giá: ");
        this.donGia=nhap.nextDouble();
    }
    public void xuat(){
        System.out.println("ten: "+this.getTen()
        +"ma:"+this.getMa()
        + "dơn gia: "+this.getDonGia()
        +"nguon gốc:"+this.getNguonGoc());
    }

    public HoaQua(String ma, String ten, String nguonGoc, double donGia) {
        this.ma = ma;
        this.ten = ten;
        this.nguonGoc = nguonGoc;
        this.donGia = donGia;
    }

    public HoaQua() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    void nhap1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

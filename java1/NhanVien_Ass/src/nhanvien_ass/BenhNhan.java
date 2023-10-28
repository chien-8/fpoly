
package nhanvien_ass;

import java.util.Scanner;

public class BenhNhan {
    String maBn;
    int tuoi;
    String hoTen;
    double vienPhi;
    public void nhap(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap tên: ");
        this.hoTen= nhap.nextLine();
        System.out.println("nhap mã bệnh nhân:");
        this.maBn=nhap.nextLine();
        System.out.println("nhap tuoi:");
        this.tuoi=nhap.nextInt();
        System.out.println("nhap vien phi: ");
        this.vienPhi=nhap.nextDouble();
        nhap.nextLine();
    }
    public void xuat(){
        System.out.println("tên: "+this.hoTen
                +"mã:"+this.maBn
                +"tuoi:"+this.tuoi
                +"vien phi:"+this.vienPhi );
    }

    public BenhNhan(String maBn, int tuoi, String hoTen, double vienPhi) {
        this.maBn = maBn;
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.vienPhi = vienPhi;
    }

    public BenhNhan() {
    }

    public String getMaBn() {
        return maBn;
    }

    public void setMaBn(String maBn) {
        this.maBn = maBn;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getVienPhi() {
        return vienPhi;
    }

    public void setVienPhi(double vienPhi) {
        this.vienPhi = vienPhi;
    }
    
}


package chientm_ph16045;

import java.util.Scanner;


public class HocSinh {
    Scanner nhap=new Scanner(System.in);
    private String hoten;
    private String maHS;
    private int tuoi;
    public void nhap(){
        System.out.println("moi nhap ho ten:");
        this.hoten=nhap.nextLine();
        System.out.println("nhap ma:");
        this.maHS=nhap.nextLine();
        System.out.println("moi nhapo tuoi:");
        this.tuoi=nhap.nextInt();
        
    }
    public void xuat(){
        System.out.println("ten: "+this.hoten
        +"; ma:"+this.maHS
        +"; tuoi:"+this.tuoi);
    }

    public HocSinh(String hoten, String maHS, int tuoi) {
        this.hoten = hoten;
        this.maHS = maHS;
        this.tuoi = tuoi;
    }

    public HocSinh() {
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}

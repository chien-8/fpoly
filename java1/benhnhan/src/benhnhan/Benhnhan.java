package benhnhan;

import java.util.Scanner;

public class Benhnhan {
private  String maBN;
private  String ten;
private  int tuoi;
private  boolean baoHiem;
private double tien;

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTen() {//lấy ra
        return ten;
    }

    public void setTen(String ten) {//nhap vao
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(boolean baoHiem) {
        this.baoHiem = baoHiem;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

void nhap(){
    Scanner nhap=new Scanner(System.in);
    System.out.print("moi nhap mã bệnh nhân: ");
    this.maBN=nhap.nextLine();
    System.out.print("moi nhap tên bệnh nhân: ");
    this.ten=nhap.nextLine();
    System.out.print("moi nhap tuoi bệnh nhân: ");
    this.tuoi=nhap.nextInt();
    System.out.print("moi nhap bao hiem: ");
    this.baoHiem=nhap.hasNextBoolean();
}
 void xuat(){
        System.out.println("ma bn: "+this.maBN
        +",ho ten: "+this.ten
        +",tuoi:"+this.tuoi
        +",bảo hiem:"+this.baoHiem);
    }
public Benhnhan(String maBN,String ten,int tuoi,boolean baoHiem,double tien){
       this.maBN=maBN;
       this.ten=ten;
       this.tuoi=tuoi;
       this.baoHiem=baoHiem;
       this.tien = tien;
       
 }

    public Benhnhan() {
        this.maBN="ph100";
       this.ten="chien";
       this.tuoi=15;
    
       this.baoHiem=true;
       this.tien=6;
    }
   

    @Override
    public String toString() {
        return "Benhnhan{" + "maBN=" + maBN + ", ten=" + ten + ", tuoi=" + tuoi + ", baoHiem=" + baoHiem + ", tien=" + tien + '}';
        
    }

    void setBaoHiem(String tam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

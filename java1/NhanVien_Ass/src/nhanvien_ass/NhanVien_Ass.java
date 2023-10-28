
package nhanvien_ass;

import java.util.Scanner;

abstract public class NhanVien_Ass {
    String hoTen;
    private String maNv;
    double luong;
    abstract public double thuNhap();
    public double thueTN(){
       if(this.thuNhap()<9){
           return 0;
       }else if(this.thuNhap()<=15){
           return 0.1*this.thuNhap();
       }else{
           return 0.12*this.thuNhap();
       }
        
    }

    public NhanVien_Ass(String hoTen, String maNv, double luong) {
        this.hoTen = hoTen;
        this.maNv = maNv;
        this.luong = luong;
    }

    public NhanVien_Ass() {
    }
    public void nhap1(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi ban nhap luong:");
        this.luong=nhap.nextDouble();
        nhap.nextLine();
        System.out.println("moi ban nhap ma nv:");
        this.maNv=nhap.nextLine();
        System.out.println("moi ban nhap ho ten:");
        this.hoTen=nhap.nextLine();
        nhap.nextLine();
    }
    public abstract void xuatTT();
    public void xuat(){
        System.out.println("Ma nv: " + this.getMaNv());
        System.out.println("Ho ten: " + this.getHoTen());
        System.out.println("Luong: " + this.getLuong());
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    
    void xeploai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void showData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getHoten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    

        
    
    
}

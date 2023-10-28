
package testthioff;

import java.util.Scanner;

public class GiaoVien {
    private String hoTen;
    private int tuoi;
    double luong;

    public GiaoVien(String hoTen, int tuoi, double luong) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public GiaoVien() {
    }
    
    public void nhap(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi nhap tên:");
        this.hoTen=nhap.nextLine();
        System.out.println("moi nhap tuoi:");
        this.tuoi=nhap.nextInt();
        System.out.println("moi nhap luong:");
        this.luong=nhap.nextDouble();
        
    }
    public void xuat(){
        System.out.println("ho ten: "+this.getHoTen()
        +"tuoi: "+this.getTuoi()
        +"luong:"+this.getLuong());
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}






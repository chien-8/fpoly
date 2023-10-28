
package keThua;

import java.util.Scanner;

public class NhanVienFullTime extends NhanVien{
    String luongF;
    double soGio;
    double luong(){
        double tam;
        if(this.luongF.equalsIgnoreCase("f1")) tam=150;
        else if(this.luongF.equalsIgnoreCase("f2")) tam=160;
        else if(this.luongF.equalsIgnoreCase("f3")) tam=170;
        else tam=180;
        return this.soGio*tam;
    }

    public NhanVienFullTime(String hoTen, String queQuan) {
        super(hoTen, queQuan);
        // goi ham tao co doi so cua cha
        this.luongF=luongF;
        this.soGio=100;
    }

    public NhanVienFullTime(String[] args) {
        super(); //goi ham k doi so cua cha
        this.luongF=luongF;
        this.soGio=200;
    }

    public NhanVienFullTime() {
    }
    
    public void nhap(){
        super.nhap();// goi ham nhap cua cha
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi nhap luong:");
        this.luongF=nhap.nextLine();
        System.out.println("moi nhap so gio");
        this.soGio=nhap.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.print("luong f:"+this.luongF
        +"so gio: "+this.soGio
        +"luong:"+this.luong());
    }
}

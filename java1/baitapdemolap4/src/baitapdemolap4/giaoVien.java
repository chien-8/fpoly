package baitapdemolap4;

import java.util.Scanner;

public class giaoVien {
    String gioiTinh;
    String hoTen;
    int tuoi;
    double luong;
    private String thue;
    public giaoVien(String hoTen,String gioiTinh,double luong,int tuoi){
        this.hoTen=hoTen;
        this.gioiTinh=gioiTinh;
        this.tuoi=tuoi;
        this.luong=luong;
    }

    public giaoVien() {
        this.hoTen="sab";
        this.gioiTinh="nam";
        this.tuoi=40;
        this.luong=6000000;
    }
    
    
    
    void nhap(){
        Scanner nhap = new Scanner (System.in);
        System.out.print("moi nhap tên :");
        this.hoTen=nhap.nextLine();
        System.out.print("mời nhập gioi tinh:");
        this.gioiTinh=nhap.nextLine();
        nhap.nextLine();
        System.out.print("mời nhập tuoi:");
        this.tuoi=nhap.nextInt();
        System.out.print("mời nhập luong:");
        this.luong=nhap.nextDouble();
    }
    void xuat(){
        System.out.println("tên : "+this.hoTen
        +"gioi tinh: "+this.gioiTinh
        +"tuoi: "+this.tuoi
        +"luong: "+this.luong
        +"thue: "+this.thue());
    }
    double thue(){
        if(this.luong>20000000){
           return this.luong*0.1;
        }else if(this.luong>10000000 && this.luong<20000000){
           return this.luong*0.05; 
        }else{
           return 0;
        }
        
        
    }
}

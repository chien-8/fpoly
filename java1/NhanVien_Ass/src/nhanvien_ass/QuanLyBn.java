
package nhanvien_ass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyBn {
    ArrayList<BenhNhan> list=new ArrayList<BenhNhan>();
    Scanner nhap=new Scanner(System.in);
    public void nhap1(){
        while(true){
            BenhNhan s= new BenhNhan();
            s.nhap();
            list.add(s);
            System.out.println("ban có muon nhap tiêp(y/n");
            if(nhap.nextLine().equalsIgnoreCase("n")) 
                break;
        }
    }
    public void xuat1(){
        System.out.println("danh sach:");
        for(BenhNhan a: list){
            a.xuat();
        }
    }
    public void capNhat(){
        System.out.println("nhap ma can cap nhat:");
        String ma=nhap.nextLine();
        boolean kt=false;
        for(BenhNhan a:list){
            if(a.getMaBn().equalsIgnoreCase(ma)){
                a.nhap();
                kt=true;
                break;
            }
        }if(kt==false){
            System.out.println("ko co ma trong ds");
        }
    }
    public void tim(){
        System.out.println("moi nhap ma:");
        String s=nhap.nextLine();
        boolean kt=false;
        for(BenhNhan b:list){
            if(b.getMaBn().equalsIgnoreCase(s)){
                b.xuat();
                break;
            }
            if(kt==false){
                System.out.println("ko co ma trong danh sach");
            }
        }
    }
    public void SX(){
        Comparator<BenhNhan> com1=new Comparator<BenhNhan>(){
            @Override
            public int compare(BenhNhan o1, BenhNhan o2) {

            return o2.getHoTen().compareToIgnoreCase(o1.getHoTen());
            }         
        };
        System.out.println("danh sach sap xep giam dan theo tên:");
        Collectors.sort(list,com1);
        for(BenhNhan a:list){
            a.xuat();
        }
    }
    public void xoa(){
        System.out.println("moi nhap ma:");
        String s=nhap.nextLine();
        boolean kt=false;
        for(BenhNhan b:list){
            if(b.getMaBn().equalsIgnoreCase(s)){
                list.remove(b);
                b.xuat();
                break;
            }
            if(kt==false){
                System.out.println("ko co ma trong danh sach");
            }else{
                System.out.println("danh sach sau xoa:");
                this.xuat1();
            }
        }
    }
    public void bnBH(){
        BenhNhanBH a=new BenhNhanBH();
        a.nhap();
        a.xuat2();
    }
    public void TimL(){
         BenhNhan max = list.get(0);
        for(int i = 1;i < list.size();i++){
            if(max.getVienPhi() < list.get(i).getVienPhi()){
                max = list.get(i);
            }
        }
        max.xuat();
    }
    public void menu(){
        int chon;
        while(true){
            System.out.println("1.nhap");
            System.out.println("2.xuat");
            System.out.println("3.cap nhat theo ma");
            System.out.println("tim theo mã");
            System.out.println("5.sắp xép");
            System.out.println("6.xóa");
            System.out.println("7.bệnh nhân bao hiểm");
            System.out.println("8.tìm bn viện phí lớn nhất");
            System.out.println("9.thoát");
            System.out.print("moi ban chon chuc năng");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: this.nhap1();
                break;
                case 2: this.xuat1();
                break;
                case 3: this.capNhat();
                break;
                case 4: this.tim();
                break;
                case 5: this.SX();
                break;
                case 6: this.xoa();
                break;
                case 7: this.bnBH();
                break;
                case 8: this.TimL();
                break;
                case 9: break;
                default:
                    System.out.println("nhap sai nhap lai:");
            }
            
            
        }
    }
}


package chientmph16045java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHoaQua {
    static ArrayList<HoaQua> list=new ArrayList<>();
    static Scanner nhap=new Scanner(System.in);
    public void menu(){
        int chon;
        while(true){
            System.out.println("=============================");
            System.out.println("1.nhap");
            System.out.println("2.xuat");
            System.out.println("3.cap nhat theo ma");
            System.out.println("4.tim theo ten nhap");
            System.out.println("5.sắp xep theo nguon goc");
            System.out.println("6.xoa");
            System.out.println("7.hoa qua nhap kjhau");
            System.out.println("8.tim hoa qua co dơn gia lơn nhat");
            System.out.println("9.thoat");
            System.out.println("===============================");
            System.out.print("moi ban chon chưc năng:");
            chon = nhap.nextInt();
            nhap.nextLine();
            switch (chon) {
                case 1:
                    this.nhap1();
                    break;
                case 2:
                    this.xuat1();
                    break;
                case 3:
                    this.capnhat();
                    break;
                case 4:
                    this.tim();
                    break;
                case 5:
                    this.sapxep();
                    break;
                case 6:
                    this.xoa();
                    break;
                case 7:
                    this.hoaNK();
                    break;
                case 8:
                    this.dongialon();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("ban nhap 2 vui long nhap lại:");
            }
        }
    }
    public void nhap1(){
        while(true){
           HoaQua a=new HoaQua();
           a.nhap();
           list.add(a);
           System.out.println("ban co muon nhap tiep ko(y/n)");
           if(nhap.nextLine().equalsIgnoreCase("n")) break;
       }
    }
    public void xuat1(){
        System.out.println("danh sach vua nhap:");
        for(HoaQua s:list){
            s.xuat();
        }
    }
    public void capnhat(){
        System.out.println("moi nhap ma hoa qua can cap nhat: ");
        String a=nhap.nextLine();
        boolean kt=false;
        for(HoaQua s: list){
            if(s.getMa().equalsIgnoreCase(a)){
                s.nhap();
                kt=true;
                break;
            }
        }
        if(kt==false){
            System.out.println("ko co ma hoa qua trong danh sach"); 
       }
   }
    public void tim(){
        System.out.println("moi nhap ten hoa qua can tim: ");
        String a=nhap.nextLine();
        boolean kt=false;
        for(HoaQua s: list){
            if(s.getTen().equalsIgnoreCase(a)){
                s.xuat();
                kt=true;
                break;
            }
        }
        if(kt==false){
            System.out.println("ko co tên hoa qua trong danh sach"); 
       }
    }
    public void sapxep(){
        Comparator<HoaQua> com1=new Comparator<HoaQua>() {
            @Override
            public int compare(HoaQua o1, HoaQua o2) {
            return o2.getNguonGoc().compareToIgnoreCase(o1.getNguonGoc());
            }
        };
        System.out.println("danh sach sap sep giam dan theo nguồn gốc:");
        Collections.sort(list,com1);
        for(HoaQua s:list){
            s.xuat();
        }
   }
    public void xoa(){
        System.out.println("nhap ma  can xoa: ");
        String ten = nhap.nextLine();
        boolean kt = false;
        int i = 0;
        while (i < list.size()) {
            HoaQua x = list.get(i);
            if (x.getMa().equalsIgnoreCase(ten)) {
                list.remove(x);
                kt = true;
            } else {
                i++;
            }
        }
        if (kt == true) {
            System.out.println("danh sach hoa qua sau xoa:");
            this.xuat1();
        } else {
            System.out.println("ko co ma trong danh sach:");

        }
    }
    public void hoaNK(){
        HoaQuaXuatKhau a=new HoaQuaXuatKhau();
        a.nhap2();
        a.xuat2();
    }
    public void dongialon(){
         HoaQua max = list.get(0);
        for(int i = 1;i < list.size();i++){
            if(max.getDonGia() < list.get(i).getDonGia()){
                max = list.get(i);
            }
        }
        max.xuat();
    }
}

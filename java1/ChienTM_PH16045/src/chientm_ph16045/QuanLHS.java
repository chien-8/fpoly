
package chientm_ph16045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLHS {
    static ArrayList<HocSinh> list=new ArrayList<HocSinh>();
    static Scanner nhap=new Scanner(System.in);
    public void nhap1(){
        while(true){
            HocSinh a=new HocSinh();
            a.nhap();
            list.add(a);
            System.out.println("ban co muon nhap tiep hay ko(y/n)");
            if(nhap.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
    }
    public void xuat1(){
        System.out.println("danh sach vua nhap:"); 
       for(HocSinh s:list){
            s.xuat();
        }
    }
    public void xuatKT(){
        System.out.println("moi ban nhap tuoi min:");
        int min=nhap.nextInt();
        System.out.println("moi ban nhap tuoi max:");
        int max=nhap.nextInt();
        boolean kt=false;
        for(HocSinh s:list){
            if(min <= s.getTuoi() && s.getTuoi() <= max){
                s.xuat();
                kt=true;
                break;
            }
        }
        if(kt==false){
            System.out.println("ko co sinh vien co do tuoi trong danh sach");
        }
   }
    public void sapX(){
        Comparator<HocSinh> com1=new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.getTuoi()>o2.getTuoi()) return -1;
                else if(o1.getTuoi()==o2.getTuoi()) return 0;
                else return 1;
            }
        };
        Collections.sort(list,com1);
        System.out.println("sap xep giam dan theo tuoi cua ");
        this.xuat1();
    }
    public void hsChuyen(){
        HSCHUYEN a=new HSCHUYEN(9,"a","a",18);

    }
    
    public void menu(){
        int chon;
        while(true){
            System.out.println("=============menu============");
            System.out.println("1.nhap");
            System.out.println("2.xuat");
            System.out.println("3.xuat theo khoang tuoi");
            System.out.println("4.sap xep");
            System.out.println("5.ke thua");
            System.out.println("0.thoat");
            System.out.println("==============================");
            System.out.print("moi ban chon chuong trinh:");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: this.nhap1();
                break;
                case 2: this.xuat1();
                break;
                case 3: this.xuatKT();
                break;
                case 4: this.sapX();
                break;
                case 5: this.hsChuyen();
                break;
                case 0: break;
                default:
                    System.out.println("ban nhap sai vui long nhap lai");
            }
            if(chon==0){
                break;
            }
       }
    }
}

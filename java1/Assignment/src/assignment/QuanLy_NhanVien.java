
package assignment;

import static assignment.NhanVien_Ass.slnv;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy_NhanVien {
    ArrayList<NhanVien_Ass> list=new ArrayList<NhanVien_Ass> ();
    Scanner nhap=new Scanner(System.in);
    void nhapNV(){
        NhanVien_Ass sp=new NhanVien_Ass();
        sp.nhap();
        list.add(sp);
    }
    void xuatNV(){
        System.out.println("danh sach nhan vien vua nhap:");
        for(NhanVien_Ass x:list){
            x.xuat();
        }
    }
    void timNV(){
        String tam;
        System.out.println("nhap nhan vien can tim:");
        tam=nhap.nextLine();
        int kiemtra = 0;
        for (NhanVien_Ass a : list) {
            if (a.getMaNv().equals(tam)) {
                kiemtra = 1;
            }
            if (kiemtra == 0) {
                System.out.println("khong co nhan vien can tim ");
            } else {
                System.out.println("co nhan vien can tim theo ma trong danh sach,thong tin: ");
                this.xuatNV();
            }
        }
    }
    void xoaNV(){
        System.out.println("moi nhap ma nhan vien ban muon xoa:");
        String tam=nhap.nextLine();
        boolean kt=false;
        int i =0;
        while(i<list.size()){
            NhanVien_Ass x=list.get(i);
            if(x.getMaNv().equals(tam)){
                list.remove(x);
                kt=true;
            }else{
                i++;
            }
        }
        if(kt){
            System.out.println("khong co ma nhan vien can xoa trong danh sach");
        }else{
            System.out.println("danh sach nhan vien sau khi xoa:");
            this.xuatNV();
        }
    
    }
    void capnhatTT(){
        Scanner nhap=new Scanner(System.in);
        String ma=nhap.nextLine();
        for(int i=0;i<slnv;i++){
            if(NhanVien_Ass.maNv[i].equalsIgnoreCase(ma)){
                System.out.println("cap nhat thong tin moi: ten, email, luong");
                this.xuatNV();
            }
        }
    }
    void timNVtheoluong(){
        
    }
    void sapxep1(){

    }
    void sapxep2(){

    }
    void xuatTheoL(){
        
    }
    void menu(){
        int chon;
        while(true){
            System.out.println("+================MENU===============+");
            System.out.println("1.nhap danh sach nhan vien:");
            System.out.println("2.xuat:");
            System.out.println("3.tim va hien thi nhan vien theo ma:");
            System.out.println("4.xoa nhan vien theo ma:");
            System.out.println("5.cap nhat thong tin theo ma nhap tu ban phim:");
            System.out.println("6.tim nhan vien theo khoan luong:");
            System.out.println("7.sap xep theo ho ten:");
            System.out.println("8.sap xep theo luong:");
            System.out.println("9.5 nhan vien co thu nhap cao nhat:");
            System.out.println("0.thoat");
            System.out.println("+===================================+");
            System.out.println("moi ban chon chuc nang:");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1:this.nhapNV();break;
                case 2:this.xuatNV();break;
                case 3:this.timNV();break;
                case 4:this.xoaNV();break;
                case 5:this.capnhatTT();break;
                case 6:this.timNVtheoluong();break;
                case 7:this.sapxep1();break;
                case 8:this.sapxep2();break;
                case 9:this.xuatTheoL();break;
                default:System.out.println("ban nhap sai cu phap moi ban nhap lai:");
            }if(chon==0){
                break;
            }
        }
    }
}

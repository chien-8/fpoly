
package lap5_bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLy_SP {
    Scanner nhap=new Scanner(System.in);
    ArrayList<SanPham_bai3> listSp=new ArrayList<SanPham_bai3>();
    // khai báo araylist dể quản lý sp
    void nhapSP(){
        SanPham_bai3 sp=new SanPham_bai3();//tao doi tuong sp ten la sp
        sp.nhap();//goi nhap noi dung cua san pham
        listSp.add(sp);//them sp vao arraylist
    }
    void xuatSP(){
        System.out.println("danh sach san pham:");
        for(SanPham_bai3 x:listSp){
//            System.out.println(x);
            x.xuat();
        }
    }
    void sapxepSP(){
        Comparator<SanPham_bai3> com1=new Comparator<SanPham_bai3>() {
            @Override
            public int compare(SanPham_bai3 o1, SanPham_bai3 o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(o1.getGia()>o2.getGia()) return -1;
                else if(o1.getGia()==o2.getGia()) return 0;
                else return 1;
                //thay doi 1 va -1 de xuat tang dan hoac giam dan ;-1 truoc la giam dan ;nguoc lai
            }
        };
        Collections.sort(listSp,com1);
        System.out.println("danh sach sau sap xep giảm dần theo giá của ");
        this.xuatSP();
//        Comparator<SanPham_bai3> com2=new Comparator<SanPham_bai3>() {
//            @Override
//            public int compare(SanPham_bai3 o1, SanPham_bai3 o2) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                return 02.getTenSP().compareToIgnoreCase(o1.getTenSP());
//            }
//        };
    }
    void xoaSP(){
        System.out.println("nhap ten sp can tim: ");
        String tam=nhap.nextLine();
        boolean kt=false;
        int i=0;
        while(i<listSp.size()){
            SanPham_bai3 x= listSp.get(i);
            if(x.getTenSP().equalsIgnoreCase(tam)){
                listSp.remove(x);
                kt=true;
            }else{
                i++;
            }
        }
        if(kt){
            System.out.println("danh sach sau xoa:");
            this.xuatSP();
        }else{ 
            System.out.println("khong co ten sp can xoa trong danh sach:");
            
        }
//        String tam;
//        System.out.println("nhap ten sp can tim: ");
//        tam=nhap.nextLine();
//        int kiemtra=0;
//        for(SanPham_bai3 x:listSp){
//            if(x.getTenSP().equalsIgnoreCase(tam)){
//                kiemtra=1;listSp.remove(x);
//            }
//        }
//        if(kiemtra==0)
//            System.out.println("khong co ten sp can xoa trong danh sach");
//        else{ 
//            System.out.println("danh sach sau xoa:");
//            this.xuatSP();
//        }
        
        
    }
    void tbGia(){
        double tong = 0;
        for(SanPham_bai3 x: listSp){
            tong=tong+x.getGia();
        }
        System.out.println("trung binh gia: "+ tong/listSp.size());
    }
    void menu(){
        int chon;
        while(true){
        System.out.println("+============menu=============+");
        System.out.println("1.nhap san pham: ");
            System.out.println("2.xuat sp:");
            System.out.println("3.xap xep sp:");
            System.out.println("4.xoa sp:");
            System.out.println("5.trung binh gia sp:");
            System.out.println("0.thoat");
            System.out.println("+==========================+");
            System.out.print("moi chon chuc nang:");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1:this.nhapSP(); break;
                case 2:this.xuatSP(); break;
                case 3:this.sapxepSP();break;
                case 4:this.xoaSP(); break;
                case 5:this.tbGia(); break;
                case 0: break;
                default: System.out.println("ban da nhap sai moi nhap lai:");
            }if(chon==0){
                break;
            }
        }
    }
}

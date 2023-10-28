
package assment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLyNhanVien {
     Scanner nhap=new Scanner(System.in);
    ArrayList<NhanVien> listSp=new ArrayList<NhanVien>();
    TiepThi th1 = new TiepThi();
    TiepThi th2 = new TiepThi();
    TruongPhong tp1 = new  TruongPhong();
    
    
    void nhap(){
        NhanVien nv1=new NhanVien();//tao doi tuong sp ten la sp
        nv1.nhap1();//goi nhap noi dung cua san pham
        listSp.add(nv1);//them sp vao arraylist
        listSp.add(th1);
        listSp.add(th2);
        listSp.add(tp1);
        
    }
    void xuatSP(){
        System.out.println("danh sach san pham:");
        for(NhanVien SanPham:listSp){
//            System.out.println(x);
            SanPham.toString();
            th1.toString();
             th2.toString();
              tp1.toString();
        }
    }
    void sapxepSP(){
        Comparator<NhanVien> com1=new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(o1.hoTen>o2.hoTen) return -1;
                else if(o1.getHoten()==o2.setHoten(hoten)) return 0;
                else return 1;
                //thay doi 1 va -1 de xuat tang dan hoac giam dan ;-1 truoc la giam dan ;nguoc lai
            }
        };
        Collections.sort(listSp,com1);
        System.out.println("danh sach sau sap xep theo gia: ");
        this.xuatSP();
//        Comparator<SanPham_bai3> com2=new Comparator<SanPham_bai3>() {
//            @Override
//            public int compare(SanPham_bai3 o1, SanPham_bai3 o2) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                return 02.getTenSP().compareToIgnoreCase(o1.getTenSP());
//            }
//        };
    }
    
    void hien(){
        System.out.println("cac sinh vien co diem tu 5 den 7.5 la:");
        for (NhanVien SanPham : listSp) {
            if(SanPham.getLuong()>30){
                SanPham.showData();
            }
                
        }
    }
     void xoaSP(){
        System.out.println("nhap te  can tim: ");
        String ManV=nhap.nextLine();
        boolean kt=false;
        int i=0;
        while(i<listSp.size()){
            NhanVien x= listSp.get(i);
            if(x.getHoten().equalsIgnoreCase(ManV)){
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
            System.out.println("co ten trong danh sach la:");
            
        }

    }
}

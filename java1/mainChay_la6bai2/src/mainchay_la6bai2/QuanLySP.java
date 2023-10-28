
package mainchay_la6bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLySP {
    Scanner nhap=new Scanner(System.in);
    ArrayList<SanPham_Nokia> listSp= new ArrayList<SanPham_Nokia>();
    void nhapSP(){
        SanPham_Nokia sp=new SanPham_Nokia();
        sp.nhap();
        listSp.add(sp);
    }
    void xuatSP(){
        System.out.println("danh sách vừa nhap: ");
        for(SanPham_Nokia x:listSp){
            x.xuat();
        }
    }    
    
    
}

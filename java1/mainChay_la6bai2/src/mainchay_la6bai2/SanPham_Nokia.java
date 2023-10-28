
package mainchay_la6bai2;

import java.util.Scanner;

public class SanPham_Nokia {
    String tenSP;
    double donGia;
    String hang;
    Scanner nhap=new Scanner(System.in);

    public SanPham_Nokia(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public SanPham_Nokia() {
        
    }
    
    void nhap(){
        System.out.print("moi nhap tên san pham:");
        this.tenSP=nhap.nextLine();
        System.out.print("moi nhap gia:");
        this.donGia=nhap.nextDouble();
        nhap.nextLine();
        
    }
    void xuat(){
        System.out.println("tên sp: "+this.tenSP
        +",giá: "+this.donGia);
    }
    
}

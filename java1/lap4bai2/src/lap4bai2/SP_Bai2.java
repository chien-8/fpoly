
package lap4bai2;

import java.util.Scanner;


public class SP_Bai2 {
    public String tenSanpham ;
    double donGia;
    double giamGia;

    void nhap(){
    Scanner nhap = new Scanner (System.in);
        System.out.print("moi nhap tên sản phẩm:");
        this.tenSanpham=nhap.nextLine();
        System.out.print("mời nhập đơn giá:");
        this.donGia=nhap.nextDouble();
        System.out.print("mời nhập giảm giá:");
        this.giamGia=nhap.nextDouble();
    }
    void xuat(){
        System.out.println("tên SP: "+this.tenSanpham
        +",đơn giá: "+this.donGia
        +",giảm giá: "+this.giamGia
        +",thuế nhập khẩu: "+this.thueNK());
        
    }
    double thueNK(){
        return this.donGia*0.1;
    }
}
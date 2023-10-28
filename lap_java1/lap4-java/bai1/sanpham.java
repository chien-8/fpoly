package lap4bai1;

import java.util.Scanner;

public class sanpham {
    public String tenSanpham ;
    double donGia;
    double giamGia;

//    public sanpham(String tenSanpham, double donGia, double giamGia) {
//        this.tenSanpham = tenSanpham;
//        this.donGia = donGia;
//        this.giamGia = giamGia;
//        //hàm có đối số
//    }
//
//    public sanpham() {
//        //hàm tọa ko có đối số
//        this.tenSanpham = "aaa";
//        this.donGia = 10;
//        this.giamGia = 1;
//    }
    
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
        +"đơn giá: "+this.donGia
        +"giảm giá: "+this.giamGia
        +"thuế nhập khẩu: "+this.thueNK());
        
    }
    double thueNK(){
        return this.donGia*0.1;
    }
}
// private: thuộc tính riêng tư
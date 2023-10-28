
package testthioff;

import java.util.Scanner;

public class GiaoVienCoHuu extends GiaoVien{
    private int namKy;

    public GiaoVienCoHuu(int namKy) {
        this.namKy = namKy;
    }

    public GiaoVienCoHuu() {
    }
    public GiaoVienCoHuu(String hoTen, int tuoi, double luong) {
        super(hoTen, tuoi, luong);
    }
    public void nhap2(){
        super.nhap();
        Scanner nhap= new Scanner(System.in);
        System.out.println("moi nhap năm ký hợp đồng: ");
        this.namKy=nhap.nextInt();
    }
    public void xuat2(){
        super.xuat();
        System.out.println("nam ky hop dong: "+this.namKy);
        
    }
}

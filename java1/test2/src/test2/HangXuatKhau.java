
package test2;

import java.util.Scanner;


public class HangXuatKhau extends HangHoa{
    private String QuocGia;
    private double thue;
    public void xuat2() {
        super.xuat1();
        System.out.println("ten quoc gia:"+this.getQuocGia());
        System.out.println("thuế:"+this.getThue());
        
        
    }

    public void nhap2(){
        super.nhap1();
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi nhap tên quốc gia:");
        this.QuocGia=nhap.nextLine();
        
    }

    public HangXuatKhau(String QuocGia, double thue) {
        super();
        this.QuocGia = QuocGia;
        
    }

    public HangXuatKhau() {
       
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public double getThue() {
        return this.DonGia*0.1;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }


            
}

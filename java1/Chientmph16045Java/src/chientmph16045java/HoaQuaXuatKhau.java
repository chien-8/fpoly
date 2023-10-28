package chientmph16045java;

import java.util.Scanner;

public class HoaQuaXuatKhau extends HoaQua{
    Scanner sc = new Scanner(System.in);
    private String HinhThucNhapKhau;

    public HoaQuaXuatKhau(int HinhThucNhapKhau, String Ma, String Ten, String NguonGoc, double DonGia) {
        super(Ma, Ten, NguonGoc, DonGia);
        
    }

    public HoaQuaXuatKhau() {
        
    }
    public void nhap2(){
        super.nhap();
        System.out.println("Nhap loai bao hiem: ");
        HinhThucNhapKhau = sc.nextLine();
    }
    public void xuat2(){
        super.xuat();
        System.out.println("loại nhap khâu "+this.HinhThucNhapKhau);
        System.out.println(" thue: "+ this.Theu());
    }

  
     public double Theu(){
        if(getHinhThucNhapKhau().equalsIgnoreCase("chinh ngach")){
            return this.donGia*0.3;
        } else if(getHinhThucNhapKhau().equalsIgnoreCase("tieu ngach")){
             return this.donGia*0.1;
        }else {
             return this.donGia*0.05;
        }
        
    }

    public String getHinhThucNhapKhau() {
        return HinhThucNhapKhau;
    }

    public void setHinhThucNhapKhau(String HinhThucNhapKhau) {
        this.HinhThucNhapKhau = HinhThucNhapKhau;
    }
}


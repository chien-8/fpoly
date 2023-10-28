
package test2;

import java.util.Scanner;

public class HangHoa {
    private String MaHang; 
    private String TenHang;
    int Soluong;
    double DonGia;
    void nhap1(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("moi nhap thong tin:");
        System.out.println("moi nhap tên:");
        this.TenHang=nhap.nextLine();
        System.out.println("nhap mã :");
        this.MaHang=nhap.nextLine();
        System.out.println("nhap số lượng:");
        this.Soluong=nhap.nextInt();
        System.out.println("nhap dơn gia: ");
        this.DonGia=nhap.nextDouble();
    }
    void xuat1(){
        System.out.println("tên:"+this.TenHang);
        System.out.println("mã:"+this.MaHang);
        System.out.println("số lượng:"+this.Soluong);
        System.out.println("đơn giá:"+this.DonGia);
    }

    public HangHoa(String MaHang, String TenHang, int Soluong, double DonGia) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
    }

    public HangHoa() {
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
}

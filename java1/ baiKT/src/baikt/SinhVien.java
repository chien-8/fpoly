
package baikt;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String canCuoc;
    private double diem;
    Scanner nhap=new Scanner(System.in);

    public SinhVien(String hoTen, String email, String sdt, String canCuoc, double diem) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.canCuoc = canCuoc;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCanCuoc() {
        return canCuoc;
    }

    public void setCanCuoc(String canCuoc) {
        this.canCuoc = canCuoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    void nhap(){
        System.out.println("moi ban nhap tên:");
        this.hoTen=nhap.nextLine();
        System.out.println("moi nhap email: ");
        this.email=nhap.nextLine();
        System.out.println("moi ban nhap sđt:");
        this.sdt=nhap.nextLine();
        System.out.println("moi nhap căn cước:");
        this.canCuoc=nhap.nextLine();
        System.out.println("moi nhap điểm:");
        this.diem=nhap.nextDouble();
    }
    void xuat(){
        System.out.println("tên: "+this.hoTen
        +"emal: "+ this.email
        +"sđt: "+this.sdt
        +"căn cước:"+this.canCuoc
        +"ddiem: "+this.diem);
    }
    void xeploai(){
        if(this.diem>=8 && this.diem<=10 ){
            System.out.println("loại tốt");
        }else if(this.diem<8 && this.diem>=7){
            System.out.println("loại khá");           
        }else if(this.diem<7 && this.diem>=5){
            System.out.println("loai trung binh");
        }else{
            System.out.println("loai yeu");
        }
    }        

}

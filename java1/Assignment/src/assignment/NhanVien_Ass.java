 
package assignment;

import java.util.Scanner;

public class NhanVien_Ass {
    static int slnv;
    static String[] maNv;
    static private String[] ten,email;
    static double[] luong;
    static Scanner nhap=new Scanner(System.in);

    public NhanVien_Ass() {
    }
    
    
    void nhap(){
        
        System.out.println("moi ban nhap so luong nhan vien:");
        slnv=Integer.parseInt(nhap.nextLine());
        maNv=new String[slnv];//tao mang ma nhan vien
        ten=new String[slnv];//tao mang ten nhan vien
        email=new String[slnv];//tao mang email  nhan vien
        luong=new double[slnv];//tao mang luong nhan vien
        for(int i=0;i<slnv;i++){
            System.out.println("nhap ten nhan vien:");
            ten[i]=nhap.nextLine();
            System.out.println("nhap ma nhan vien:");
            maNv[i]=nhap.nextLine();
            System.out.println("nhap email nhan vien:");
            email[i]=nhap.nextLine();
            System.out.println("nhap luong nhan vien:");
            luong[i]=Double.parseDouble(nhap.nextLine());
        }
    }
    void xuat(){
        System.out.println("danh sach nhan vien vua nhap:");
        for(int i=0;i<slnv;i++){
            System.out.println("ten nv:  "+ten[i]
            +"ma nv:"+maNv[i]
            +"email:"+email[i]
            +"luong:"+luong[i]);
        }
    }

    public static int getSlnv() {
        return slnv;
    }

    public static void setSlnv(int slnv) {
        NhanVien_Ass.slnv = slnv;
    }

    public static String[] getMaNv() {
        return maNv;
    }

    public static void setMaNv(String[] maNv) {
        NhanVien_Ass.maNv = maNv;
    }

    public static String[] getTen() {
        return ten;
    }

    public static void setTen(String[] ten) {
        NhanVien_Ass.ten = ten;
    }

    public static String[] getEmail() {
        return email;
    }

    public static void setEmail(String[] email) {
        NhanVien_Ass.email = email;
    }

    public static double[] getLuong() {
        return luong;
    }

    public static void setLuong(double[] luong) {
        NhanVien_Ass.luong = luong;
    }

    public static Scanner getNhap() {
        return nhap;
    }

    public static void setNhap(Scanner nhap) {
        NhanVien_Ass.nhap = nhap;
    }

   
    
}

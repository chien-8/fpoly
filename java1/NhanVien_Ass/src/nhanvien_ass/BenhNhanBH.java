
package nhanvien_ass;

import java.util.Scanner;

public class BenhNhanBH extends BenhNhan{
    static Scanner sc = new Scanner(System.in);
    private int loaiBH;

    public BenhNhanBH(String maBn, int tuoi, String hoTen, double vienPhi) {
        super(maBn, tuoi, hoTen, vienPhi);
    }

    public BenhNhanBH() {
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap loai bao hiem: ");
        this.loaiBH = Integer.parseInt(sc.nextLine());
    }
    public void xuat2(){
        super.xuat();
        System.out.printf(" Tien bao hiem: ", this.tienBaoHiem());
    }
    public double tienBaoHiem(){
        if(this.getLoaiBH()==1){
            return this.getVienPhi()*0.5;
        } else if(this.getLoaiBH()==2){
            return this.getVienPhi()*0.3;
        } else {
            return this.getVienPhi()*0.1;
        }
    }
    public int getLoaiBH() {
        return loaiBH;
    }

    public void setLoaiBH(int loaiBH) {
        this.loaiBH = loaiBH;
    }
}

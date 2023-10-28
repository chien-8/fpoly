
package chientm_ph16045;
public final class HSCHUYEN extends HocSinh{
    double diemTB;

    HSCHUYEN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void nhap2(){
        super.nhap();
        System.out.println("moi nhap diem TB:");
        this.diemTB=nhap.nextDouble();
    }
    public void xuat2(){
        super.xuat();
        System.out.println("; diem TB:"+this.diemTB);
    }

    public HSCHUYEN(double diemTB, String hoten, String maHS, int tuoi) {
        super(hoten, maHS, tuoi);
        this.diemTB = diemTB;
    }

    public HSCHUYEN(double diemTB) {
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
}

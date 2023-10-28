package lap7bai2;

import java.util.Scanner;

public class SinhVienIT extends SinhVienFPoLy {

    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    @Override
    public double getDiemTB() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }

    @Override
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("moi ban nhap sv IT: ");
        System.out.println("nhap ten: ");
        super.setHoTen(String.valueOf(s.nextLine()));
        System.out.println("nganh:");
        super.setNganh(String.valueOf(s.nextLine()));
        System.out.println("diem java:");
        this.diemJava = Double.parseDouble(s.nextLine());
        System.out.println("diem html:");
        this.diemHTML = Double.parseDouble(s.nextLine());
        System.out.println("diem css:");
        this.diemCSS = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("xuat-sinh vien IT: ");
        System.out.println("Diem java: " + this.diemJava
                + ";diem HTML: " + this.diemHTML
                + ";diem CSS: " + this.diemCSS);

    }

}

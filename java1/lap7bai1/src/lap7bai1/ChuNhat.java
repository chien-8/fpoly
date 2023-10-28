package lap7bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuNhat {

    Double dai, rong;

    public ChuNhat(Double dai, Double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public ChuNhat() {
    }

    public Double getChuvi() {
        return (this.dai + this.rong) * 2;
    }

    public Double getDientich() {
        return this.dai * this.rong;
    }

    public void nhap() {
        for (int i = 1; i <= 2; i++) {
            Scanner nhap = new Scanner(System.in);
            System.out.println("moi nhap chieu dai:");
            this.dai = nhap.nextDouble();
            System.out.println("moi nhap chieu rong:");
            this.rong = nhap.nextDouble();
        }
    }

    public void xuat() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("thong tin hinh chu nhat:");
            System.out.println("chieu dai: " + this.dai
                    + "rong:" + this.rong
                    + "chu vi: " + this.getChuvi()
                    + "dien tich: " + this.getDientich());
        }
    }

}

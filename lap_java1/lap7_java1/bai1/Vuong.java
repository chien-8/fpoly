package lap7bai1;

import java.util.Scanner;

public class Vuong extends ChuNhat {

    public Vuong() {
    }

    public Vuong(Double canh) {
        super(canh, canh);
    }

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi nhap canh hinh vuong: ");
        super.dai = super.rong = nhap.nextDouble();
    }

    public void xuat() {
        System.out.println("thong tin hinh vuong:");
        System.out.println("chieu dai: " + super.dai
                + "chu vi: " + this.getChuvi()
                + "dien tich: " + this.getDientich());
    }
}

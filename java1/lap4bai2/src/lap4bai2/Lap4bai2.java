
package lap4bai2;

import java.util.Scanner;

public class Lap4bai2 {
     public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi ban nhap thong tin sp1:");
        SP_Bai2 sp1 = new SP_Bai2();
        sp1.nhap();
        System.out.println("moi ban nhap thong tin sp2");
        SP_Bai2 sp2 = new SP_Bai2();
        sp2.nhap();
        System.out.println("thong tin sp vua nhap la:");
        System.out.println("sp1:");
        sp1.xuat();
        System.out.println("sp2:");
        sp2.xuat();
    }
    
}

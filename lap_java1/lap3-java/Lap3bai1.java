package lap3bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Lap3bai1 {

    public static void main(String[] args) {
       Scanner nhap = new Scanner(System.in);
        int n;
        boolean ok = true;
        System.out.print("Nhập vào số :");
        n = nhap.nextInt();
        for (int i = 2; i < n - 1; i++) {
            if (n % 2 == 0) {
                ok = false;               
            }
        }
        if (ok == true) {
            System.out.println("" + n + " Là số nguyên tố");
        } else {
            System.out.println("" + n + " Không phải là số nguyên tố");
        }
        

}
}

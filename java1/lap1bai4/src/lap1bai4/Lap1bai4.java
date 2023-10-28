
package lap1bai4;

import java.util.Scanner;

public class Lap1bai4 {

    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        float a,b,c;
        float Delta,canDelta;
        System.out.print("mời nhập a: ");
        a=nhap.nextFloat();
        System.out.print("mời nhập b: ");
        b=nhap.nextFloat();
        System.out.print("mời nhập c: ");
        c=nhap.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        Delta= (float) (Math.pow(b,2)-4*a*c);
        canDelta= (float) Math.sqrt(Delta);
        System.out.printf("delta = %f",Delta);
        System.out.printf("căn delta = %f",canDelta);
    }
    
}

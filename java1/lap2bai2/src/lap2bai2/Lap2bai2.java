
package lap2bai2;

import java.util.Scanner;


public class Lap2bai2 {

    
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        float a,b,c;
        float Delta,canDelta;
        float x1,x2;
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
        if(Delta>0){
            x1=(-b+canDelta)/(2*a);
            x2=(-b-canDelta)/(2*a);
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        }else if(Delta==0){
            x1=-b/(2*a);
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        }else{
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    
}


package lap2bai1;

import java.util.Scanner;

public class Lap2bai1 {

    
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int a,b;
        System.out.print("nhâp a: ");
        a=nhap.nextInt();
        System.out.print("nhâp b: ");
        b=nhap.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("phương trình vô số nghiệm");
            }else{
                System.out.println("phuong trình vô nghiệm");
            }
        }else{
            int x=-b/a;
            System.out.printf("nghiệm của pt là: %d",x);
        }
    }
    
}

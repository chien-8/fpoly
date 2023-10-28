
package lap1bai3;

import java.util.Scanner;


public class Lap1bai3 {

   
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        System.out.println("nhập cạnh khối lập phương: ");
        int canh=nhap.nextInt();
        int V=canh*canh*canh;
        System.out.printf("thể tích khối lập phương là: %d",V);
    }
    
}

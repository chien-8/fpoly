
package lap1bai2;

import java.util.Scanner;


public class Lap1bai2 {

    public static void main(String[] args) {
    Scanner nhap=new Scanner(System.in);
    int C,S;
    int canhnho;
    System.out.print("nhập chiều dài: ");
    int dai= nhap.nextInt();
    System.out.print("nhập chiều rộng: ");
    int rong= nhap.nextInt();
    C=(dai+rong)*2;
    S=dai*rong;
    canhnho=Math.min(dai, rong);
    System.out.printf("chu vi: %d diện tích: %d cạnh nhỏ nhất:%d",C,S,canhnho);
    }
    
}


package lap1bai1;

import java.util.Scanner;

public class Lap1bai1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen=scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f điểm",hoTen,diemTB);
 
    }
    
}

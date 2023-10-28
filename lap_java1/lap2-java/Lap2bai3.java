
package lap2bai3;

import java.util.Scanner;


public class Lap2bai3 {

    
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int a;
        System.out.println("mời nhập số điện đã dùng: ");
        a=nhap.nextInt();
        if(a>=0 && a<=50){
            int tien=a*1000;
            System.out.printf("số tiền điện phải trả là: %d",tien);
        }else if(a>50){
            int tien=50*1000+(a-50)*1200;
            System.out.printf("số tiền điện phải trả là: %d",tien);
        }else{
            System.out.printf("bạn đã nhập sai số điện");
        }
    }
    
}

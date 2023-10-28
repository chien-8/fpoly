package lap3bai2;

import java.util.Scanner;

public class Lap3bai2 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int x;
        System.out.println("mời bạn nhập số: ");
        x = nhap.nextInt();
        System.out.printf("bảng cửu chương của %d là: ", x);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d", x, i, x * i);
            System.out.println("");
        }
//        System.out.println("bảng cửu chương: ");
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                if(i<=10){
//                    System.out.printf("%d X %d = %d",i,j,i*j);
//                    System.out.println("");
//                }
//            }
//            System.out.println("");
//            System.out.println("");
//        }
    }

}


package lap3bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Lap3bai3 {

    public static void main(String[] args) {
        int i;
        int n;
        double trungBinh, tong = 0, count = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử:");
        n = nhap.nextInt();
        int mang[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Nhập mảng [" + i + "]");
            mang[i] = nhap.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Mảng vừa nhâp:" + mang[i]);
        }
        for (i = 0; i < n; i++) {
            Arrays.sort(mang);
        }
        System.out.println("Sắp xếp:" + Arrays.toString(mang));
        int min = mang[0];
        for (i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                count++;
            }
            min = Math.min(min, mang[i]);
        }
        trungBinh = tong / count;
        System.out.println("Mảng nhỏ nhất là:" + min);
        System.out.println("Trung bình các số chia hết cho 3 là:" + trungBinh);
    }
    
}

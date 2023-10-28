package lap2menu;

import java.util.Scanner;

public class Lap2menu {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        while (true) {
            System.out.println("+---------------------------------+");
            System.out.println("1.giải phương trình bậc nhất");
            System.out.println("2.giải phương trình bậc hai");
            System.out.println("3.tính tiền điện");
            System.out.println("4.kết thúc");
            System.out.println("+---------------------------------+");
            int z;
            System.out.println("mời chọn chức năng: ");
            z = nhap.nextInt();
            switch (z) {
                case 1: {
                    int a, b;
                    System.out.print("nhâp a: ");
                    a = nhap.nextInt();
                    System.out.print("nhâp b: ");
                    b = nhap.nextInt();
                    if (a == 0) {
                        if (b == 0) {
                            System.out.println("phương trình vô số nghiệm");
                        } else {
                            System.out.println("phuong trình vô nghiệm");
                        }
                    } else {
                        int x = -b / a;
                        System.out.printf("nghiệm của pt là: %d", x);
                    }

                }
                break;
                case 2: {
                    float a, b, c;
                    float Delta, canDelta;
                    float x1, x2;
                    System.out.print("mời nhập a: ");
                    a = nhap.nextFloat();
                    System.out.print("mời nhập b: ");
                    b = nhap.nextFloat();
                    System.out.print("mời nhập c: ");
                    c = nhap.nextFloat();
                    if (a == 0) {
                        if (b == 0) {
                            System.out.println("Phương trình vô nghiệm!");
                        } else {
                            System.out.println("Phương trình có một nghiệm: "
                                    + "x = " + (-c / b));
                        }
                        return;
                    }
                    Delta = (float) (Math.pow(b, 2) - 4 * a * c);
                    canDelta = (float) Math.sqrt(Delta);
                    if (Delta > 0) {
                        x1 = (-b + canDelta) / (2 * a);
                        x2 = (-b - canDelta) / (2 * a);
                        System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
                    } else if (Delta == 0) {
                        x1 = -b / (2 * a);
                        System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
                    } else {
                        System.out.println("Phương trình vô nghiệm!");
                    }
                }
                break;
                case 3: {
                    int a;
                    System.out.println("mời nhập số điện đã dùng: ");
                    a = nhap.nextInt();
                    if (a >= 0 && a <= 50) {
                        int tien = a * 1000;
                        System.out.printf("số tiền điện phải trả là: %d", tien);
                    } else if (a > 50) {
                        int tien = 50 * 1000 + (a - 50) * 1200;
                        System.out.printf("số tiền điện phải trả là: %d", tien);
                    } else {
                        System.out.printf("bạn đã nhập sai số điện");
                    }
                }
                break;
                case 4: {
                    System.out.println("trương trình kết thúc");
                }
            }
            if (z > 4 && z < 0);
            break;

        }

    }

}

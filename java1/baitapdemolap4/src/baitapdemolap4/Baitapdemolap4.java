
package baitapdemolap4;

import java.util.Scanner;

public class Baitapdemolap4 {

    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        giaoVien gv1=new giaoVien();
        gv1.toString();
        giaoVien gv2=new giaoVien();
        gv2.nhap();
        gv2.toString();
        gv1.xuat();
        gv2.xuat();
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2;

import java.util.Scanner;


public class Mang2 {
    
public static Scanner scanner = new Scanner(System.in);
 
    
    public static void main(String[] args) {
//        System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        int[] canNang = new int[40];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            canNang[i] = scanner.nextInt();
//        }
//        System.out.print("Các phần tử của mảng: ");
//        show(canNang);
//        double total = 0;
//        for(int i=0; i<canNang.length; i++){
//            total = total + canNang[i];
//        }
//        double average = total / canNang.length;
//        System.out.format("\n Kết quả là: %.1f", average);
//        
//    }
// 
//    
//    public static void show(int[] canNang) {
//        for (int i = 0; i < canNang.length; i++) {
//            System.out.print(canNang[i] + " ");
//        }
       Scanner nhap= new Scanner(System.in);
       int canNang[] =new int[40];
       int n; // 
       int i;
       int min;
       int j;
       int tq;
       while(true){
           System.out.println("nhap n: ");
           n=nhap.nextInt();
           if(n>5 && n< 20) break;
       }
       for(i=0;i<n;i++){
           System.out.print("nhap canNang["+i+"]= ");
           canNang[i]=nhap.nextInt();
       }
        System.out.println("mang can nang vau nhap: ");       
        for(i=0;i<n;i++)
            System.out.print(canNang[i]+"\t");
        
        min=canNang[0];
        for(i=0;i<n;i++)
            if(canNang[i]<min) min=canNang[i];
            System.out.println("vị trí min :");
        for(i=0;i<n;i++){
            if(canNang[i]==min);
                System.out.println(i+"\t");
        }
        System.out.println("mang can nang sắp xép giảm dần");
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(canNang[i]<canNang[j]){
                    tq =canNang[i];
                    canNang[i]=canNang[j];
                    canNang[j]=tq;
                }
            }
        }        
        for(i=0;i<n;i++)
            System.out.print(canNang[i]+"\t");        




    }
}
    
   
    


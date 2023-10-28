/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manggiamdan;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Manggiamdan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,j,m;
        Scanner nhap =new Scanner(System.in);
        n= nhap.nextInt();
        int manggd[]=new int[n];
        System.out.println("nhập các phần tử mảng: ");
        for(i=0;i<n;i++)
            manggd[i]=nhap.nextInt();
    }
    
}

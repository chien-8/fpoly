/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,i;
        int tich=1;
        Scanner nhap = new Scanner(Systen.in);
        
        System.out.println("moi ban nhap so n: ");
        n= nhap.nextInt();
        if(n%2 ==0){
            System.out.println("so vua nhap la so chan");
        }else{
            System.out.println("so vua nhap la so le");
        }
        for(i=1;i<=n;i++){
            tich *= i;
        }
        System.out.println("gia thua cua n la: "+tich);
    }
    
}

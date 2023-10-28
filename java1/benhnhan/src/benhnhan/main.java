
package benhnhan;

import java.util.Scanner;



public class main {
    static Scanner nhap=new Scanner(System.in);
    public static void main(String[] args) {
         
        // nhap mabn,tuoi cho doi tuong bn1
        //
        Benhnhan bn1=new Benhnhan();
        System.out.println("moi nhap ma benh nhan moi: ");
        String tam;
        tam=nhap.nextLine();
        bn1.setMaBN(tam);
        System.out.println("moi nhap bao hiem moi:");
        bn1.setBaoHiem(tam);
        System.out.printf("benh nhan sau nhap mã: " );
        bn1.xuat();
    }
    
}
//pub +ctrl+cách+enter---->public static void main(String[] args)
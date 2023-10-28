
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

    public static void main(String[] args) {
         ArrayList<Double> a = new ArrayList<>();
        Scanner nhap=new Scanner(System.in);
        double tong=0;
        int i=0;
        while(true){
             System.out.print("moi nhap so thuc : ");
             double x=nhap.nextDouble();
             a.add(x);
             tong=tong + a.get(i);
             i++;       
             System.out.println("nhap tiep k (y/n)?");
             nhap.nextLine();
             if(nhap.nextLine().equalsIgnoreCase("n")){
                 break;
             }
         }
    }
    
}

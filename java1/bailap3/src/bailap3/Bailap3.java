
package bailap3;

import java.util.Scanner;
import javafx.scene.shape.Line;


public class Bailap3 {

   
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        int n;
        String hoTen[]=new String[40];
        System.out.print("nhap số học sinh của lớp: ");
        n=nhap.nextInt();
        for( int i=0;i<n;i++){
            System.out.println("nhập họ và tên sinh viên thứ "+i+" : ");
            System.out.print("họ và tên : ");
            nhap.nextLine();
            hoTen[i]=nhap.nextLine();
        }
        int diem[]=new int[n];
        for( int i=0;i<n;i++){
            System.out.println("nhập điểm sinh viên "+i+" : ");
            System.out.print("diểm: ");
            diem[i]=nhap.nextInt();
        }for( int i=0;i<n;i++){
            if( diem[i]>=0 && diem[i]<5){
                System.out.println("tên: "+hoTen[i]+" \n diểm: "+diem[i]+" \n học lực: yếu");
            }else if(diem[i]>=5 && diem[i]<6.5){
                System.out.println("ten: "+hoTen[i]+" \n diem: "+diem[i]+" \n hoc luc: trung binh");
            }else if(diem[i]>=6.5 && diem[i]<7.5){
                System.out.println("tên: "+hoTen[i]+" \n diểm: "+diem[i]+" \n học lực: khá");
            }else if(diem[i]>=7.5 && diem[i]<9){
                System.out.println("tên: "+hoTen[i]+" \n diểm: "+diem[i]+" \n học lực: gioi");
            }else if(diem[i]>=9 && diem[i]<=10){
                System.out.println("tên: "+hoTen[i]+" \n diểm: "+diem[i]+" \n học lực: xuat sac");
            }
            
        
        }
            
        
    }
    
}


package lap5bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
     private ArrayList<Double> list = new ArrayList<>();
    public void nhap(){
        System.out.println("moi nhap danh sach số thực");
        Scanner nhap = new Scanner(System.in);
        int i = 1;
        do {            
            System.out.println("mời bạn nhap số:");
            double so=nhap.nextDouble();
            list.add(so);
            System.out.println("ban có muốn nhập tiếp (1:có, 0:thoát):");
            i=nhap.nextInt();
        } while (i==1);

    }
    public void hienThi(){
        System.out.println("danh sách số thực vừa nhâp là: ");
        for(Double item:list){
            System.out.println("  "+item);
        }
        System.out.println();
    }
    public void tinhTong(){
        double sum=0;
        for(Double item: list){
            sum+=item;
        }
        System.out.println("tổng: "+sum);
    }
}

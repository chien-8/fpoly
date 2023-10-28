package lap4bai1;
import java.util.Scanner;
public class Lap4bai1 {
    public static void menu(){
        System.out.println("+-----------menu----------+");
        System.out.println("1. nhập sản phẩm");
        System.out.println("2.xuất sản phẩm");
        System.out.println("3.thoát");
        System.out.println("+-------------------------+");
    }

    
    public static void main(String[] args) {
        int chon ;
        Scanner nhap=new Scanner(System.in);
        sanpham sp =new sanpham();
        //
        //tạo đối tượng sản phẩm từ class SanPham gọi phương thức tạo ko đối số
        while(true){
            menu();
            System.out.print("mời nhập chọn chức năng: ");
            chon=nhap.nextInt();
            switch(chon){
                case 1:
                    sp.nhap(); break;
                case 2:
                    sp.xuat(); break;
                case 3:break;
                default: System.out.println("bạn nhập sai menu");
            }
            if(chon==3) break;
        }
    }
    
}

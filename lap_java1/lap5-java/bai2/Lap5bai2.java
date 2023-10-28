package lap5bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lap5bai2 {

    private String hoTen;
    static Scanner nhap = new Scanner(System.in);
    static ArrayList<String> listHt = new ArrayList<String>();

    public Lap5bai2() {
        
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    

    void nhap() {
        while (true) {
            Scanner nhap = new Scanner(System.in);
            System.out.print("moi nhap ho ten:");
            this.hoTen = nhap.nextLine();
            if (hoTen.equals("")) {
                break;
            } else {
                listHt.add(hoTen);
            }

        }
    }

    void xuat() {
        System.out.print("danh sách vừa nhập là: ");
        for (String a : listHt) {
            System.out.println(a);
        }

    }

    void sapxep() {
        Comparator<String> com1=new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
            
        };
        Collections.sort(listHt,com1);
        Collections.reverse(listHt);
        System.out.println("sắp xếp giảm dần của");
        this.xuat();

    }
    void ngauNhien(){
        Collections.shuffle(listHt);
        System.out.println("danh sách ngẫu nhiên là :");
        for(String chay: listHt){
            System.out.println(chay + " ");
        }
    }

    void xoa() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap họ tên bạn muốn xóa:");
        hoTen=nhap.nextLine();
        for(String string :listHt){
            if(hoTen.equals(string)){
                listHt.remove(string);
                break;
            }
        }
        System.out.println("danh sách sau khi xóa:");
        for (String string : listHt) {
            System.out.println(string +" ");
        }

    }

    void menu() {
        int chon;
        while (true) {
            System.out.println("+----------menu------------+");
            System.out.println("1.nhap ");
            System.out.println("2.xuat");
            System.out.println("3.sắp xếp ");
            System.out.println("4.xóa tên");
            System.out.println("5.ngẫu nhiên");
            System.out.println("6.thoát");
            System.out.println("+--------------------------+");
            System.out.print("mời chọn chức năng:");
            chon = nhap.nextInt();
            nhap.nextLine();

            switch (chon) {
                case 1:
                    this.nhap();
                    break;
                case 2:
                    this.xuat();
                    break;
                case 3:
                    this.sapxep();
                    break;
                case 4:
                    this.xoa();
                    break;
                case 5:
                    this.ngauNhien();
                    break;
                case 6:;
                    break;
                default:
                    System.out.println("moi nhap lại");
            }
           
            if (chon == 6) {
                break;
            }

        }
    }

}

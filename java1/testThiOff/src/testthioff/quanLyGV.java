
package testthioff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class quanLyGV {
    static ArrayList<GiaoVien> list=new ArrayList<GiaoVien>();
    Scanner nhap=new Scanner(System.in);
    
    public void nhap1(){
          while (true) {
            GiaoVien sp = new GiaoVien();
            sp.nhap();
            list.add(sp);
            System.out.println("Nhập tiếp?: (y/n)");
            if (nhap.nextLine().equalsIgnoreCase("N")) {
                break;
            }
          }
    }
                

    
    public void xuat1(){
        System.out.println("danh sach giao vien:");
        for(GiaoVien Sp: list){
            Sp.xuat();
            System.out.println();
        }
    }
    public void xuattheoTuoi(){
        Scanner z=new Scanner(System.in);
        System.out.println("tim gv theo khoang tuoi:");
        System.out.print("moi nhap tuoi thap nhat: ");
        double min=z.nextDouble();
        System.out.print("moi nhap tuoi cao nhap: ");
        double max=z.nextDouble();
        boolean kt=false;
        for(GiaoVien gV: list){
            if(min<=gV.getTuoi() && gV.getTuoi()<=max){
                gV.xuat();
                System.out.println();
                kt=true;
                
            }
        }
        if(kt==false){
            System.out.println("ko có gv trong khoang tuoi can tim");
        }
    }
    
    public void timTheoTen(){
        System.out.println("nhap ten can tim:");
        String s=nhap.nextLine();
        boolean kt=false;
        for(GiaoVien gv:list){
            if(gv.getHoTen().equalsIgnoreCase(s)){
                gv.xuat();
                kt=true;
                break;
            }
        }if(kt==false){
            System.out.println("ko co ten giao vien trong danh sach");
        }
    }
    public void sapXeptheoTen(){
        Comparator<GiaoVien> com1=new Comparator<GiaoVien>(){
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
            }
        };
        System.out.println("danh sach sap xep giam dan theo ten:");
        Collections.sort(list,com1);
        for(GiaoVien x:list){
            x.xuat();
        }
    }
    public void xoaTheoTen(){
              System.out.println("nhap ten can xoa: ");
        String ten = nhap.nextLine();
        boolean kt = false;
        int i = 0;
        while (i < list.size()) {
            GiaoVien x = list.get(i);
            if (x.getHoTen().equalsIgnoreCase(ten)) {
                list.remove(x);
                kt = true;
            } else {
                i++;
            }
        }
        if (kt== true) {
            System.out.println("danh sach sau xoa:");
            this.xuat1();
        } else {
            System.out.println("ko co ten trong danh sach:");

        }
    }
    public void xuatGVCoHieu(){
        GiaoVienCoHuu co=new GiaoVienCoHuu();
        co.nhap2();
        co.xuat2();
    }
    public void menu(){
        int chon;
        while(true){
            System.out.println("1.Nhập danh sách Giáo viên (1đ )");
            System.out.println("2.Xuất danh sách (0.5đ )");
            System.out.println("3.Xuất danh sách Giáo viên theo khoảng Tuổi(1 đ )");
            System.out.println("4.Tìm Giáo viên theo họ tên (1 đ)");
            System.out.println("5.Sắp xếp GV theo họ tên giảm dần. (1đ)");
            System.out.println("6.Xóa Gv theo họ tên nh");
            System.out.println("7.xuat thong tin giao vien cơ huu");
            System.out.println("8.Thoát ");
            System.out.print("moi ban chon chưc nang:");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: this.nhap1();
                break;
                case 2: this.xuat1();
                break;
                case 3: this.xuattheoTuoi();
                break;
                case 4: this.timTheoTen();
                break;
                case 5: this.sapXeptheoTen();
                break;
                case 6: this.xoaTheoTen();
                break;
                case 7: this.xuatGVCoHieu();
                break;
                case 8: break;
                default:
                    System.out.println("nhap sai -> nhap lai:");
            }
            if(chon==0){
                break;
            }
        }
    }

    private void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}







//Tạo lớp GiaoVien bao gồm các thông tin gồm: Họ tên, Tuổi, Luong, (chỉ được truy cập trong cùng 1 gói)  (1điểm)
//1.	Sử dụng ArrayList<GiaoVien> để nắm giữ danh sách Giáo viên (0,5đ)
//Viết chương trình thực hiện việc quản lý như menu sau: (1 điểm  )
//		1.Nhập danh sách Giáo viên (1đ ) 
//		Khi nhập có hỏi tiếp hay ko? (0,5đ)
//		2.Xuất danh sách (0.5đ )
//		3.Xuất danh sách Giáo viên theo khoảng Tuổi(1 đ )
//		4.Tìm Giáo viên theo họ tên (1 đ)
//              5. Sắp xếp GV theo họ tên giảm dần. (1đ)
//              6. Xóa Gv theo họ tên nh
//              8.Thoát 
//2.	Tạo lớp GiaoVienCoHuu kế thừa từ GiaoVien cần thêm thông tin là Năm ký hợp đồng . (0,5đ )
//Bổ sung vào menu chức năng số 7 là Kế thừa, khi lựa chọn chức năng này xuất thông tin của giáo viên cơ hữu.(1đ )
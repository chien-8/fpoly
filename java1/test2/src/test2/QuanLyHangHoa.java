package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHangHoa {

    static Scanner nhap = new Scanner(System.in);
    static ArrayList<HangHoa> list = new ArrayList<HangHoa>();

    public void nhap() {
        while (true) {
            HangHoa s = new HangHoa();
            s.nhap1();
            list.add(s);
            System.out.println("Nhập tiếp?: (y/n)");
            if (nhap.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("danh sach: ");
        for (HangHoa s : list) {
            s.xuat1();
        }
    }

    public void capNhat() {
        System.out.println("moi ban nhap ma nhan vien can cap nhap:");
        String ma = nhap.nextLine();
        boolean kt = false;
        for (HangHoa s : list) {
            if (s.getMaHang().equalsIgnoreCase(ma)) {
                s.nhap1();
                kt = true;
                break;
            }
        }
        if (kt == false) {
            System.out.println("ko tim thây mã nhan vien");
        }
    }

    public void timTheoTen() {
        System.out.println("moi nhap tên hang cân tim:");
        String s = nhap.nextLine();
        boolean kt = false;
        for (HangHoa ten : list) {
            if (ten.getTenHang().equalsIgnoreCase(s)) {
                ten.xuat1();
                kt = true;
                break;
            }
        }
        if (kt == false) {
            System.out.println("ko co ten hang trong danh sach");
        }
    }

    public void SXtheoTenGiam() {
        Comparator<HangHoa> com1 = new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return o2.getTenHang().compareToIgnoreCase(o1.getTenHang());
            }
        };
        System.out.println("danh sach sắp xếp giam dần thoe tên :");
        Collections.sort(list, com1);
        for (HangHoa x : list) {
            x.xuat1();
        }
    }

    public void xoaTheoMa() {
        System.out.println("nhap mã can tim: ");
        String ManV = nhap.nextLine();
        boolean kt = false;
        int i = 0;
        while (i < list.size()) {
            HangHoa x = list.get(i);
            if (x.getMaHang().equalsIgnoreCase(ManV)) {
                list.remove(x);
                kt = true;
            } else {
                i++;
            }
        }
        if (kt == true) {
            System.out.println("danh sach sau xoa:");
            this.xuat();
        } else {
            System.out.println("ko co ten trong danh sach:");

        }
    }

    public void hangXuatKhau() {
        HangXuatKhau a = new HangXuatKhau();
        a.nhap2();
        a.xuat2();
    }

    public void tim() {
        for(HangHoa a:list){
            
        }

    }

    public void menu() {
        int chon;
        while (true) {
            System.out.println("=================menu================");
            System.out.println("1.Nhập danh sách hàng (1đ )");
            System.out.println("2.Xuất danh sách (0.5đ )");
            System.out.println("3.Cập nhật lại thông tin hàng theo mã nhập từ bàn phím (1 đ )");
            System.out.println("4.Tìm Hàng theo tên hàng nhập vào (1 đ)");
            System.out.println("5.Sắp xếp hang theo tên giảm dần. (1đ)");
            System.out.println("6.Xóa hàng theo mã nhập vào (1đ)");
            System.out.println("7.hang xuất khẩu");
            System.out.println("8.Tìm hàng có đon giá lớn nhất.");
            System.out.println("9.Thoát");
            System.out.println("======================================");
            System.out.print("moi ban chon chuc nang:");
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
                    this.capNhat();
                    break;
                case 4:
                    this.timTheoTen();
                    break;
                case 5:
                    this.SXtheoTenGiam();
                    break;
                case 6:
                    this.xoaTheoMa();
                    break;
                case 7:
                    this.hangXuatKhau();
                    break;
                case 8:
                    this.tim();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("ban nhap sai moi nhap lại;");

            }
            if (chon == 0) {
                break;
            }
        }
    }
}




package baikt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {

    Scanner nhap = new Scanner(System.in);
    ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    void nhapSv() {
        SinhVien sv = new SinhVien();
        sv.nhap();
        list.add(sv);
    }

    void xuatSv() {
        System.out.println("danh sach sv vua nhap la:");
        for (SinhVien x : list) {
            x.xuat();
            x.xeploai();
        }
    }

    void themSv() {
        System.out.println("moi ban nhap them thong tin sinh vien:");
        SinhVien sv = new SinhVien();
        sv.nhap();
        list.add(sv);

    }

    void sapxepSv() {
        Comparator<SinhVien> com1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return -1;
                } else if (o1.getDiem() == o2.getDiem()) {
                    return 0;
                } else {
                    return 1;
                }
            }

        };
        Collections.sort(list, com1);
        System.out.println("sắp xếp giảm dần của");
        this.xuatSv();
    }

    void kiemtraSv() {
        int kiemtra = 0;
        for (SinhVien a : list) {
            if (a.getHoTen().equalsIgnoreCase("LE ANH TUAN")) {
                kiemtra = 1;
            }
            if (kiemtra == 0) {
                System.out.println("danh sach sinh vien ko co LE ANH TUAN");
            } else {
                System.out.println("danh sach co le anh tuan ");

            }
        }
    }

    void xuatdiemSv() {
        for (SinhVien y : list) {
            if (y.getDiem() <= 7.5 && y.getDiem() >= 5) {
                y.xuat();
            }
        }
    }

    void menu() {
        int chon;
        while (true) {
            System.out.println("+============menu=============+");
            System.out.println("1.nhap thong tin sinh vien: ");
            System.out.println("2.them sinh vien vao danh sach :");
            System.out.println("3.xuat:");
            System.out.println("4.sap xep sinh vien theo diem giam dan:");
            System.out.println("5.kiem tra ten sinh vien trong danh sach:");
            System.out.println("6.xuat cac sv diem tu 5 -->7,5:");
            System.out.println("0.thoat");
            System.out.println("+==========================+");
            System.out.print("moi chon chuc nang:");
            chon = nhap.nextInt();
            nhap.nextLine();
            switch (chon) {
                case 1:
                    this.nhapSv();
                    break;
                case 2:
                    this.themSv();
                    break;
                case 3:
                    this.xuatSv();
                    break;
                case 4:
                    this.sapxepSv();
                    break;
                case 5:
                    this.kiemtraSv();
                    break;
                case 6:
                    this.xuatdiemSv();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ban da nhap sai moi nhap lai:");
            }
            if (chon == 0) {
                break;
            }
        }
    }

}

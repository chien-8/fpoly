package nhanvien_ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNv_Ass {

    Scanner nhap = new Scanner(System.in);
    ArrayList<NhanVien_Ass> listSp = new ArrayList<NhanVien_Ass>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        int chon;
        while(true){
            System.out.println("1. Nhap nhan vien tiep thi");
            System.out.println("2. Nhap truong phong");
            System.out.println("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    TiepThi_Ass nvtt = new TiepThi_Ass();
                    nvtt.nhap1();
                    listSp.add(nvtt);
                    break;
                case 2:
                    TruongPhong_Ass tp = new TruongPhong_Ass();
                    tp.nhap1();
                    listSp.add(tp);
                    break;
            }
            System.out.println("Ban co muon tiep tuc? (y/n):");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("n")) break;
        }


    }

    public void xuatSP() {
        System.out.println("danh sach san pham:");
        for (NhanVien_Ass SanPham : listSp) {
            SanPham.xuatTT();
        }
    }
    
    
    
    
    
    
    public void timNvTheoMa(){
        System.out.println("nhap mã can tim: ");
        String s = nhap.nextLine();
        boolean kt = false;
        for(NhanVien_Ass nv: listSp){
            if(nv.getMaNv().equalsIgnoreCase(s)){
                nv.xuatTT();
                kt=true;
                break;
            }
        }if(kt==false){
            System.out.println("ko có mã nhân viên trong danh sách");
        }
        
   
    }




    
    public void xoaNv() {
        System.out.println("nhap mã can tim: ");
        String ManV = nhap.nextLine();
        boolean kt = false;
        int i = 0;
        while (i < listSp.size()) {
            NhanVien_Ass x = listSp.get(i);
            if (x.getMaNv().equalsIgnoreCase(ManV)) {
                listSp.remove(x);
                kt = true;
            } else {
                i++;
            }
        }
        if (kt== true) {
            System.out.println("danh sach sau xoa:");
            this.xuatSP();
        } else {
            System.out.println("ko co ten trong danh sach:");

        }

    }
    
    public void capNhatNV(){
        System.out.println("Nhap ma nhan vien can cap nhat: ");
        String maNV = nhap.nextLine();
        boolean kt = false;
        for(NhanVien_Ass nv : listSp){
            if(nv.getMaNv().equalsIgnoreCase(maNV)){
                nv.nhap1();
                kt = true;
            } 
        }
        if(kt == false) System.out.println("Khong tim thay nhan vien !");
    }
    
    
    
    
    public void timNvTheoL(){
        Scanner s=new Scanner(System.in);
        System.out.println("tim theo khoang luong:");
        System.out.print("nhap khoang thap nhat:");
        double min=s.nextDouble();
        System.out.print("nhap khoang cao nhat:");
        double max=s.nextDouble();
        boolean found=false;
        for(NhanVien_Ass nhanVien :listSp){
            if(min<=nhanVien.getLuong() && nhanVien.getLuong()<=max){
                nhanVien.xuatTT();
                System.out.println();
                found=true;
            }
        }
        if(found==false){
            System.out.println("khong co nhan vien nao co khoang luong can tim");
        }

        
    }
    
    
    
    
    
        public void sapxepSP() {
        Comparator<NhanVien_Ass> com1=new Comparator<NhanVien_Ass>() {
            @Override
            public int compare(NhanVien_Ass o1, NhanVien_Ass o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return o2.hoTen.compareToIgnoreCase(o1.hoTen);
            }
        };
        System.out.println("danh sách sắp xếp tăng dần thoe tên là:");
        Collections.sort(listSp,com1);
        for(NhanVien_Ass x: listSp){
            x.xuatTT();
        }
    }
        public void sapxepLuong(){
        Comparator<NhanVien_Ass> com1=new Comparator<NhanVien_Ass>() {
            @Override
            public int compare(NhanVien_Ass o1, NhanVien_Ass o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(o1.getLuong()>o2.getLuong()) return  -1;
            else if(o1.getLuong()==o2.getLuong()) return 0;
            else return 1;
            }
        };
        Collections.sort(listSp,com1);
        System.out.println("danh sach nv sep theo luong giam dan la:");
        for(NhanVien_Ass x: listSp){
            x.xuatTT();
        }
                
    }
    public void xuat5Nv(){
      Collections.sort(listSp,(a,b)->(int) (b.thuNhap()-a.thuNhap()));
        System.out.println("danh sach nhan vien có thu nhap cao nhat:");
        for(int i=0;i<5 && i<listSp.size();i++){
            listSp.get(i).xuatTT();
        }
    }
    
    
    
    
    
    
    
    public void menu(){
        int chon;
        while(true){
            System.out.println("=======================menu==========================");
            System.out.println("1.Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2.Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4.Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7.Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8.Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9.Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("0.Thoát");
            System.out.println("=======================================================");
            System.out.print("moi ban chon chức năng:");
            chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1 : this.nhap();
                break;
                case 2 : this.xuatSP();
                break;
                case 3: this.timNvTheoMa();
                break;
                case 4 : this.xoaNv();
                break;
                case 5: this.capNhatNV();
                break;
                case 6: this.timNvTheoL();
                break;
                case 7: this.sapxepSP();
                break;
                case 8: this.sapxepLuong();
                break;
                case 9: this.xuat5Nv();
                break;
                case 0: break;
                default:
                    System.out.println("ban da nhap sai moi nhap lai:");
            }
            if(chon==0){
                break;
            }
        }
    }

    

}








/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Lap4 {

 String HoTen;
    int Tuoi,DiemTB,maSV;
    void nhap(){
        Scanner nhap = new Scanner(System.in);
         System.out.println("nhap ho ten sinh vien");
        this.HoTen = nhap.nextLine();
        
        System.out.println("nhap tuoi la");
        this.Tuoi = nhap.nextInt();
        System.out.println("nhap diem trung binh");
        this.DiemTB= nhap.nextInt();
        System.out.println("nhap ma sinh vien");
        this.maSV= nhap.nextInt();
    }    
    void xuat(){
        System.out.println("maSV"+this.maSV+"Hoten"+this.HoTen+"DiemTB"+this.DiemTB
        +"Tuoi"+this.Tuoi);
       
    } 
    void xepLoai(){
        if(DiemTB >= 8){
            System.out.println("giỏi");
        }else if(DiemTB >= 7 ){
            System.out.println("khá");
        }else if(DiemTB >= 5 ){
            System.out.println("trung binh");
        }else{
            System.out.println("yếu ");
        }
    }
    public static void main(String[] args) {
           lap4 SV1 = new SinhVien();
           SV1.nhap();
           SV1.xuat();
           SV1.xepLoai();
           lap4 SV2 = new SinhVien();
           SV2.nhap();
           SV2.xuat();
           SV2.xepLoai();
           
    
}
}

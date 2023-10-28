
package testlap7bai2;

import java.util.Scanner;


public class SinhvienIT extends SinhvienPoly{

    @Override
    double getDiem() {
        return (this.diemCSS+this.diemHTML+this.diemJava*2)/4;
    }
    double diemJava;
    double diemHTML;
    double diemCSS;
    public void nhap(){
        Scanner nhap=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap diem java: ");
        this.diemJava=nhap.nextDouble();
        System.out.println("nhap diem html: ");
        this.diemHTML=nhap.nextDouble();
        System.out.println("nhap diem css: ");
        this.diemCSS=nhap.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.println("diem java: "+this.diemJava
       +"diem html:"+this.diemHTML
        +"diem css:"+this.diemCSS);
    }
}

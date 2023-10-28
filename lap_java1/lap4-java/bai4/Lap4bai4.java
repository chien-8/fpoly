
package lap4bai4;

public class Lap4bai4 {

    public static void main(String[] args) {
        SP_Bai4 sp1=new SP_Bai4("sp1",40,3);
        sp1.xuat();
        String ten=sp1.getTenSanpham();
        System.out.println("tên sp: "+ten);
        sp1.setTenSanpham("sp mới");
        sp1.xuat();
        SP_Bai4 sp2=new SP_Bai4("sp2",800);
        sp2.xuat();
        String ten2 =sp2.getTenSanpham();
        System.out.println("tên sp: "+ten);
        sp2.setTenSanpham("sp mới");
        sp2.xuat();
    }
    
}

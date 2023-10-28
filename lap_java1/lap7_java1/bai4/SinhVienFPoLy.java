
package lap7bai2;

abstract class SinhVienFPoLy {
    private String hoTen;
    private String nganh;
    abstract public double getDiemTB();
    abstract public void nhap();
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public void xuat(){
        System.out.println("Sinh vien poly: ");
        System.out.printf("ho ten: %s; nganh: %s; hoc luc: %s",this.hoTen,this.nganh,this.getHocLuc());
        System.out.println("");
    }
    public String getHocLuc(){
        String xepLoai="";
        if(this.getDiemTB()<5){
            xepLoai="yeu";
        }else if(this.getDiemTB()<6.5){
            xepLoai="TB";
        }else if(this.getDiemTB()<8){
            xepLoai="kha";
        }else{
            xepLoai="goi";
        }
        return xepLoai;
    }
    
}

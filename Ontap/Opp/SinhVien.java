package Ontap.Opp;

public class SinhVien {
    //Khoi tao thuoc tinh
    private String hoTen;
    private double diem;
    private String MaSV;
    private String lop;

    //constructor mac dinh 
    //Khoi tao cac gia tri mac dinh ngay khi doi tuong vua dc tao ra
    public SinhVien(){
        hoTen = "Kien";
        diem = 8;
    }
    //Constructor co doi so
     public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //Phuong thuc
    //Phuong thuc khong co kieu tra ve
    public void hienThiThonTin(){
        System.out.println("Ho va ten: " + hoTen + " .Diem trung binh : " +diem );
    }
   
    //phuong thuc co kieu tra ve 
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }

    //Get va Set

    //Get cho phep lay va xem duoc bien private
    public String getHoTen() {
        return hoTen;
    }
    public double getDiem() {
        return diem;
    }
   
    //Set cho phep thay doi bien trong private
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
   


    //toString
    
 @Override
    public String toString() {
        return "SinhVien [hoTen=" + hoTen + ", diem=" + diem + "]";
    }
    
    

}

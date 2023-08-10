package Ontap.Opp;

public class demo {
    public static void main(String[] args) {
       //Khoi tao doi tuong thuoc class Sinh Vien
     SinhVien sv1 = new SinhVien();
     SinhVien sv2 = new SinhVien();
     SinhVien sv3 = new SinhVien("Hieu");
     SinhVien sv4 = new SinhVien("Hieu",8);
     //in ra phuong thuc khong co kieu tra ve
     sv1.hienThiThonTin();
     sv2.hienThiThonTin();
     sv3.hienThiThonTin();
     sv4.hienThiThonTin();
      //test in ra phuong thuc co kieu tra ve
     double diemTBSV4 = sv4.tinhDTB(8, 8.8 );
     System.out.println("Diem trung binh co kieu tra ve cua sv4: "+diemTBSV4);

     //get gọi, lấy biến private
      System.out.println(sv4.getHoTen());
      System.out.println(sv4.getDiem());
      //set thay đổi biến private
      sv4.setHoTen("Long");
      sv4.hienThiThonTin();
     System.out.println("========");

     //toString
     System.out.println(sv4);

     //Khoi tao doi tuong thuoc lop class Oto
     Oto BMW_x5 = new Oto();
     //Goi thuoc tinh va gan gia tri cho cac thuoc tinh cua MBW_x5
        BMW_x5.tenXe = "BMW_X5";
        BMW_x5.hangXe = "Mazda";
        BMW_x5.soCho = 4;
        BMW_x5.mauXe = "Black";
        BMW_x5.namSX = 2022;
    //Goi cac thuoc tinh va in ra thong tin
    System.out.println("Thong tin chi tiet cua xe: ");
    System.out.println("Ten xe: "+BMW_x5.tenXe);
    System.out.println("Hang xe: "+BMW_x5.hangXe);
    System.out.println("So cho cua xe: "+BMW_x5.soCho);
    System.out.println("Mau xe: "+BMW_x5.mauXe);
    System.out.println("Nam San xuat xe: "+BMW_x5.namSX);
    // goi cac phuong thuc
    BMW_x5.chay();


   }

}

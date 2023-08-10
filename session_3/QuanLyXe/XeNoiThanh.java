package session_3.QuanLyXe;

import java.util.Scanner;

public class XeNoiThanh extends ChuyenXe {
  
    protected String soTuyen;
    protected double soKmDiDuoc;

    //Constructor
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tuyen: ");
        this.soTuyen = sc.nextLine();
        System.out.print("Nhap so Km di duoc: ");
        this.soKmDiDuoc = sc.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("So tuyen: "+ this.soTuyen);
        System.out.println("So Km di duoc: "+ this.soKmDiDuoc);
    }

    
    


    
    
   
}

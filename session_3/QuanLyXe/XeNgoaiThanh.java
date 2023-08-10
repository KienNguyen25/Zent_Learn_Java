package session_3.QuanLyXe;

import java.util.Scanner;

public class XeNgoaiThanh extends ChuyenXe {
    protected String noiDen;
    protected double soNgayDiDuoc;
   
    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }
    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, double soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap noi den: ");
        this.noiDen = sc.nextLine();
        System.out.print("Nhap so ngay di duoc: ");
        this.soNgayDiDuoc = sc.nextDouble();
    }
    
 

    
   



    





   

    
    
}

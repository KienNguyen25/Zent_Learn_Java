package session_3.QuanLyXe;

import java.util.Scanner;

public class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;
   

    //Constructor 
     public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    //Phuong thức
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so chuyen: ");
        this.maSoChuyen = sc.nextLine();
        System.out.print("Nhap vao ho ten tai xe: ");
        this.hoTenTaiXe = sc.nextLine();
        System.out.print("Nhap vao so xe: ");
        this.soXe = sc.nextLine();
    }

    public void xuatThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma so chuyen: "+ this.maSoChuyen);
        System.out.println("Ho ten tai xe: "+ this.hoTenTaiXe);
        System.out.println("So xe: "+ this.soXe);
    }

    public double tongDoanhThu(){
        return doanhThu;
    }
  

}

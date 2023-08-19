package ThietKeLopSinhVien;

import java.util.Scanner;

/**
 * SinhVien
 */
public class SinhVien {
    //Thuoc tinh
    private String hoTen,lop,maSV,truong,email,gioiTinh,queQuan;
    private int namSinh,sdt;
    //Constructor
    
    public SinhVien(String hoTen, String lop) {
            this.hoTen = hoTen;
            this.lop = lop;
        }

    public SinhVien(String hoTen, String lop, String maSV) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
    }

    public SinhVien(String hoTen, String lop, String maSV, String truong) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.truong = truong;
    }

    public SinhVien(String hoTen, String lop, String maSV, String truong, String email) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.truong = truong;
        this.email = email;
    }

    public SinhVien(String hoTen, String lop, String maSV, String truong, String email, int sdt) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.truong = truong;
        this.email = email;
        this.sdt = sdt;
    }
    public SinhVien(){

    }

    //getter and setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thong tin SV");
        System.out.println("=============================");
        System.out.print("Nhap ho ten sinh vien: ");
         hoTen = sc.nextLine();
        System.out.println("Nhap lop sinh vien: ");
        lop = sc.nextLine();
        System.out.println("Nhap maSV: ");
        maSV = sc.nextLine();
        System.out.println("Nhap truong sinh vien: ");
        truong = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        System.out.println("Nhap SDT sinh vien: ");
        sdt = sc.nextInt();
        System.out.println("Nhap gioi tinh sinh vien: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap que quan sinh vien: ");
        queQuan = sc.nextLine();
        System.out.println("Nhap nam sinh sinh vien: ");
        namSinh = sc.nextInt();
    }
    public void xuatTT(){
        System.out.println("Xuat thong tin sinh vien");
        System.out.println("=======================");

        System.out.println("Sinh Vien: "+ this.hoTen);
        System.out.println("Sinh Vien lop: "+ this.lop);
        System.out.println("Sinh Vien truong: "+ this.truong);
        System.out.println("Ma Sinh Vien: "+ this.maSV);
        System.out.println("Que quan: "+ this.queQuan);
        System.out.println("Gioi tinh: "+ this.gioiTinh);
        System.out.println("Sinh nam: "+ this.namSinh);
        System.out.println("Sdt: "+ this.sdt);
        System.out.println("email: "+ this.email);
    }

    
    
    
    
    

}
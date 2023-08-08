package session_2.exe_08;

import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private String lop;
    private int namSinh;
    private String gioiTinh;
    private String queQuan;
    private String soDienThoai;
    private String email;
    private String maSV;
    private float diemTrungBinh;
    private boolean dangHoc;

    public SinhVien() {

    }
    public SinhVien(String hoTen, String lop, int namSinh, String gioiTinh, String queQuan,
                    String soDienThoai, String email, String maSV, float diemTrungBinh, boolean dangHoc) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maSV = maSV;
        this.diemTrungBinh = diemTrungBinh;
        this.dangHoc = dangHoc;
    }

    // Getter và setter cho các thuộc tính
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public boolean isDangHoc() {
        return dangHoc;
    }

    public void setDangHoc(boolean dangHoc) {
        this.dangHoc = dangHoc;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();

        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();

        System.out.print("Nhập email: ");
        email = scanner.nextLine();

        System.out.print("Nhập mã SV: ");
        maSV = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextFloat();

        System.out.print("Đang học? (true/false): ");
        dangHoc = scanner.nextBoolean();

        scanner.nextLine(); 
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lớp: " + lop);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Email: " + email);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Đang học: " + (dangHoc ? "Có" : "Không"));
    }
}

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        SinhVien[] danhSachSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.println("---------------------------");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSinhVien[i] = sv;
            System.out.println();
        }

    }
}
       

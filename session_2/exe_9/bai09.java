package session_2.exe_9;

import java.util.Scanner;

class HocSinh {
    private String hoTen;
    private String lop;
    private float diemTrungBinh;

    public HocSinh(String hoTen, String lop, float diemTrungBinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTrungBinh = diemTrungBinh;
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

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}

public class bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin học sinh A
        System.out.println("Nhập thông tin học sinh A:");
        System.out.print("Họ tên: ");
        String hoTenA = scanner.nextLine();

        System.out.print("Lớp: ");
        String lopA = scanner.nextLine();

        System.out.print("Điểm trung bình: ");
        float diemTrungBinhA = scanner.nextFloat();
        scanner.nextLine(); 

        // Nhập thông tin học sinh B
        System.out.println("Nhập thông tin học sinh B:");
        System.out.print("Họ tên: ");
        String hoTenB = scanner.nextLine();

        System.out.print("Lớp: ");
        String lopB = scanner.nextLine();

        System.out.print("Điểm trung bình: ");
        float diemTrungBinhB = scanner.nextFloat();

        // Tạo đối tượng học sinh A và B
        HocSinh hocSinhA = new HocSinh(hoTenA, lopA, diemTrungBinhA);
        HocSinh hocSinhB = new HocSinh(hoTenB, lopB, diemTrungBinhB);

        // So sánh điểm trung bình và in ra kết quả
        if (hocSinhA.getDiemTrungBinh() > hocSinhB.getDiemTrungBinh()) {
            System.out.println("Học sinh " + hocSinhA.getHoTen() + " có điểm trung bình cao hơn.");
        } else if (hocSinhA.getDiemTrungBinh() < hocSinhB.getDiemTrungBinh()) {
            System.out.println("Học sinh " + hocSinhB.getHoTen() + " có điểm trung bình cao hơn.");
        } else {
            System.out.println("Học sinh " + hocSinhA.getHoTen() + " và " + hocSinhB.getHoTen() + " có cùng điểm trung bình.");
        }
    }
}

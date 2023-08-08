package session_1.exe_2;

import java.util.Scanner;

public class tongHieuTichThuong {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng từ lớp Scanner
        Scanner ban_phim = new Scanner(System.in);
        
        // Lưu giá trị người dùng nhập vào:

        System.out.println("Nhap vao so a: ");
        int a = ban_phim.nextInt();

        System.out.println("Nhap vao so b: ");
        int b = ban_phim.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        float thuong = (float)a / b; 
        int phan_du = a % b; 

        // In thông tin sinh viên

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + phan_du);

    }
}

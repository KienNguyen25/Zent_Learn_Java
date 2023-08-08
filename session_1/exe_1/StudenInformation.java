package session_1.exe_1 ;

import java.util.Scanner;

/**
 * StudenInformation
 */
public class StudenInformation {
    public static void main(String[] args) {

        // Khởi tạo một đối tượng từ lớp Scanner
        Scanner ban_phim = new Scanner(System.in);

        // Lưu giá trị người dùng nhập vào:
        System.out.print("Nhập họ và tên: ");
        String hoTen = ban_phim.nextLine();

        System.out.print("Nhập lớp: ");
        String lop = ban_phim.nextLine();

        System.out.print("Nhập trường: ");
        String truong = ban_phim.nextLine();

        System.out.print("Nhập giới tính: ");
        String gioi_tinh = ban_phim.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String ngay_sinh = ban_phim.nextLine();

        System.out.print("Nhập quê quán: ");
        String que_quan = ban_phim.nextLine();

         // In thông tin sinh viên
        System.out.println("Thông tin sinh viên:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Lớp: " + lop);
        System.out.println("Trường: " + truong);
        System.out.println("Giới tính: " + gioi_tinh);
        System.out.println("Ngày sinh: " + ngay_sinh);
        System.out.println("Quê quán: " + que_quan);
    }
    
}
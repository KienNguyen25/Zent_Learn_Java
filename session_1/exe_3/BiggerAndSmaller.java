package session_1.exe_3;

import java.util.Scanner;

/**
 * BiggerAndSmaller
 */
public class BiggerAndSmaller {

    public static void main(String[] args) {
        //Khởi tạo một đối tượng từ lớp Scanner
        Scanner ban_phim = new Scanner(System.in);

        //Lưu giá trị người dùng nhập vào
        System.out.print("Nhập vào số a: ");
        double a = ban_phim.nextDouble();

        System.out.print("Nhập vào số b: ");
        double b = ban_phim.nextDouble();

        double max = (a > b) ? a : b;

        //in ra kết quả
         System.out.println( "Gia tri lon nhat la  : " + max );
    }
}
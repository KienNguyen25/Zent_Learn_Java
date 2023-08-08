package session_1.exe_4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương N: ");
        int  N = ban_phim.nextInt();

        int sum = 0;

       // Nhập và kiểm tra N số nguyên dương
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập số:  ");
            int number = ban_phim.nextInt();
            
            if (number % 4 == 0 || (number / 100) % 10 == 3) {
                sum += number;
            }
        }

          // In kết quả ra màn hình
        System.out.println("Tổng các số chia hết cho 4 hoặc có chữ số hàng trăm là 3 là: " + sum);
    }
}

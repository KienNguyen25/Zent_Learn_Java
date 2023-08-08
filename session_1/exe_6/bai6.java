package session_1.exe_6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Chương trình đếm số âm, số dương");

        Scanner ban_phim = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên N: ");
        int N = ban_phim.nextInt();

        int count_soNguyenDuong = 0;
        int count_soNguyenAm = 0;
        int count_so_0 = 0;

         for (int i = 0; i < N; i++) {
            System.out.print("Nhập số thứ " + (i ) + ": ");
            int num = ban_phim.nextInt();
            
            if (num > 0) {
                count_soNguyenDuong++;
            } else if (num < 0) {
                count_soNguyenAm++;
            } else {
                count_so_0++;
            }
        }
        
        // In kết quả ra màn hình
        System.out.println("Số lượng số nguyên dương: " + count_soNguyenDuong);
        System.out.println("Số lượng số nguyên âm: " + count_soNguyenAm);
        System.out.println("Số lượng số 0: " + count_so_0);
        
    }
}

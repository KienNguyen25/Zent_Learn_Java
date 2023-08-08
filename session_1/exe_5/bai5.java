package session_1.exe_5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        //Khởi tạo đối tượng từ lớp Scanner
        Scanner ban_phim = new Scanner(System.in);
        
        System.out.println("Nhập vào giá trị M: ");
        int  M = ban_phim.nextInt();

        System.out.println("Nhập vào giá trị N: ");
        int N = ban_phim.nextInt();

        System.out.println("Nhập vào giá trị K: ");
        int K = ban_phim.nextInt();

        int sum = 0;

        for(int i = N; i<= M; i++){
            if (i % K == 0) {
                sum += i;
            }
        }

          System.out.println("Tổng các số chia hết cho " + K + " trong khoảng từ " + N + " đến " + M + " là: " + sum);
    }
    
}

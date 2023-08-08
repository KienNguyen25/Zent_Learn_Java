package session_2.exe_1;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        System.out.println("Chuong tinh tinh tong cac so nguyen chia het cho 4");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong so nguyen duong thu N: ");
        int n  = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.println("Nhap vao mot so nguyen duong thu :" + i);
            int number = sc.nextInt();

            if(number % 4 == 0){
                sum += number;
            }
        }
        System.out.println("Tong cac so chia het cho 4 la : "+ sum);
    }
    
}

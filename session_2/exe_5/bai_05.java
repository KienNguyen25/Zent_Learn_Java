package session_2.exe_5;

import java.util.Scanner;

public class bai_05 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong");
        Scanner sc = new Scanner(System.in );

        System.out.println("Nhap vao mot so nguyen bat ki: ");
        int n = sc.nextInt();
        double sum = tinhTong(n);

        System.out.println("tong cua  S = 1 + 1/2 + 1/3 + ... + 1/" + n + " la: " + sum);

    }

    public static double tinhTong(int n){
        double sum = 0;
        for(int i = 1; i<=n; i++){
             sum += 1 / i;
        }
        return sum;
    }
}

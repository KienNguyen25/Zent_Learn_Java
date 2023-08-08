package session_2.exe_2;

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        System.err.println("Chuong trinh tinh tong nhap vao 3 gia tri");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao gia tri cua M: ");
        int M = sc.nextInt();
        System.out.print("Nhap vao gia tri cua N: ");
        int N = sc.nextInt();
        System.out.print("Nhap vao gia tri cua K: ");
        int K = sc.nextInt();
        
        int sum = tinhTong(M,N,K);


        System.out.println("Tong cac so chia het cho" + K+ " trong khoang tu "+ M+ " den N la:  " + sum);

    }

    public static int tinhTong(int M, int N, int K){
        int sum = 0;
        for(int i = N; i<=M ; i++){
             if (i % K == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

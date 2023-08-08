package Ontap.Ham;

import java.util.Scanner;

public class baitap1 {
    //de bai: Viết chương trình nhập vào 3 giá trị M, N, K tinh tong 3 so
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong 3 so M,N,K:");
        System.out.println("=========================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri cua M: ");
        int M = sc.nextInt();

        System.out.print("Nhap vao gia tri cua N: ");
        int N = sc.nextInt();

        System.out.print("Nhap vao gia tri cua K: ");
        int K = sc.nextInt();

        int sum = tinhTongBaSo(M, N, K);

        System.out.println("Ket qua cua 3 so "+ M + " + "+ N + " + " + K + " = " +sum);

    }

    public static int tinhTongBaSo( int M, int N, int K){
        return M+N+K;
    }


}

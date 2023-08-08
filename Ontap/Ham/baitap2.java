package Ontap.Ham;

import java.util.Scanner;

public class baitap2 {
    //Đề bài: Viết chương trình nhập vào 3 giá trị M, N, K (M >=N) và thực hiện tính tổng các số chia hết cho K trong khoảng từ N đến M.
    //Chú ý: Xét trong khoảng từ N đến M
    public static void main(String[] args) {
        System.out.println( "Chuong trinh tinh tong cac so chia het cho K trong khoang tu M den N la: " );
        System.out.println("======================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao gia tri cua M: ");
        int M = sc.nextInt();

        System.out.print("Nhap vao gia tri cua N: ");
        int N = sc.nextInt();
        System.out.print("Nhap vao gia tri cua K: ");
        int K = sc.nextInt();

        int sum = tinhTongChiaHetChoK(M, N, K);
        System.out.println("Tong cac so chia het cho" + K+ " trong khoang tu "+ M+ " den " + N+  " la:  " + sum);
    }
    public static int tinhTongChiaHetChoK( int M, int N ,int K){
        int sum = 0;
        for(int i = N; i<=M; i++){
            if( i % K == 0){
                sum += i;
            }
        }
        return sum;
    }




}

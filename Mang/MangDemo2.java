package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class MangDemo2 {
    /*
     * Viết chuong trinh tạo 1 mảng 1 chiều gồm các phần tử là số nguyên có n phần tử, n do người dùng nhập vào từ bàn phím
     */
    public static void main(String[] args) {
        System.out.println("chuong trinh nhập số nguyên");
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu toi da cua mang: ");
        int n = sc.nextInt();
        int[] soNguyen = new int[n];
        System.out.println("So phan tu cua mang la: "+ soNguyen.length);
        for(int i=0;i<soNguyen.length;i++){
            System.out.println("soNguyen["+i+"]= ");
            soNguyen[i] = sc.nextInt();
        }
        //Xuất mảng đã xem
        System.out.println("Mang so Nguyen la: ");
        System.out.println(Arrays.toString(soNguyen));


    }
}

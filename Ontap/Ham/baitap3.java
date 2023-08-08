package Ontap.Ham;

import java.util.Scanner;

public class baitap3 {

    //Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n với n nguyên dương được nhập từ bàn phím.
 public static void main(String[] args) {
    System.out.println("Chuong trinh tinh tong cac so");
    System.out.println("======================");

    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao 1 so nguyen: ");
    int n = sc.nextInt();

    double sum = tinhTong(n);
    System.out.println("tong cua S = 1 + 1/2 + 1/3 +....+ 1/"+ n + " = " + sum);
 }   

 public static double tinhTong( int n){
  float sum = 0.0f;
    for(int i = 1; i<= n; i++){
        sum += 1.0f / i;
    }

    return sum;
 }



}

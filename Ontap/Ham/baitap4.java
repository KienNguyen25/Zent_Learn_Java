package Ontap.Ham;

import java.util.Scanner;

import session_2.exe_6.dienTichHinhTron;

public class baitap4 {
    //Đề bài: Viết chương trình sử dụng hàm tính diện tích hình tròn với bán kính r bất kỳ được nhập từ bàn phím. ( r được nhập trong hàm Main ).
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh dien tich hinh tron");
        System.out.println("=========================");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap R ban kinh hinh tron: ");
        double r = sc.nextDouble();
        double S = DienTichBanKinhHinhTron(r);

        System.out.println("r = " + r + "=> S = " + S);

    }

    public static double DienTichBanKinhHinhTron(double r){
        double Pi = 3.14;
        return r*r*Pi;
    }

}

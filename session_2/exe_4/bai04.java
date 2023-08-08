package session_2.exe_4;

import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong giai thua");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so bat ki: ");
        int n = sc.nextInt();
        double sum = tinhTong(n);

        System.out.println("TOng cua S = 1 /1! + 2 /2! + ....+ " + n+ "/"+n+" = "+ sum);

    }

    public static double tinhTong(int n){
        double sum = 0;
        double giai_thua = 1.0;

        for(int i =1 ; i<= n; i++){
            giai_thua *= i;

            sum =+ i / giai_thua; 
        }

        return sum;
    }
}

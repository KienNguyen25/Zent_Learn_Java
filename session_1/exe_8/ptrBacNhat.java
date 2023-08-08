package session_1.exe_8;

import java.util.Scanner;

public class ptrBacNhat {
    public static void main(String[] args) {
        // double a,b,x;
        Scanner ban_phim = new Scanner(System.in);

        System.out.print("Nhap vao a: ");
        double a = ban_phim.nextDouble();

        System.out.println("Nhap vao b: ");
        double b = ban_phim.nextDouble();
           
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }

    }
}

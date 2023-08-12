package session_4;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh kiem tra chuoi palindrome");
        System.out.println("===========================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
        String s = sc.nextLine();
        StringBuffer chuoi = new StringBuffer(s);
        if (s.equals(chuoi.reverse().toString())) {
            System.out.println("Day la chuoi palindrome");
        } else {
             System.out.println("Day ko phai la chuoi palindrome");

        }

    }
}

import java.util.Scanner;

/**
 * toantu
 */
public class toantu {

    public static void main(String[] args) {
        //Khai bao bien
        // int a,b;

        //Khai bao Scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao gia tri a: ");
        int a = sc.nextInt();

        System.out.println("Nhap vao gia tri b: ");
        int b = sc.nextInt();

        int tong = a + b;

        System.out.println("Tong cua: "+  a + " + " + b + " = " + tong);

    }
}
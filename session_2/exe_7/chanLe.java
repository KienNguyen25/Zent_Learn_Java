package session_2.exe_7;

import java.util.Scanner;

public class chanLe {
    public static void main(String[] args) {
        System.out.println("Chuong trinh kiem tra chan le");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so can kiem tra :" );
        int n = sc.nextInt();

        if (so_chan_le(n)) {
             System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");

        }

    }
    public static boolean so_chan_le( int number){
        return number %2==0;
    }
}

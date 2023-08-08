import java.util.Scanner;

public class vong_lap {
    public static void main(String[] args) {
        //nhập vào bàn phím 1 số nguyên tính tổng từ 1 đến số nguyên đó và in ra màn hinh
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);

        //c2 
            // int n;
            // Scanner sc = new Scanner(System.in);



        

    }
}

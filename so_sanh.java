import java.util.Scanner;

public class so_sanh {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao gia tri a: ");
        a = sc.nextInt();

        
        System.out.println("Nhap vao gia tri b: ");
        b = sc.nextInt();

        System.out.println(a + " = " + b + " : " + (a==b));
        System.out.println(a + " ! " + b + " : " + (a!=b));
        System.out.println(a + " < " + b + " : " + (a<b));
        System.out.println(a + " <= " + b + " : " + (a<=b));
        System.out.println(a + " > " + b + " : " + (a>b));
        System.out.println(a + " >= " + b + " : " + (a>=b));
        System.out.println("-------------");
       
        System.out.println("Ca 2 la so chan: " + (a%2==0 && b%2==0));
        System.out.println("co it nhat 1 so chan: " + (a%2 ==0 || b%2==0));
    }
}

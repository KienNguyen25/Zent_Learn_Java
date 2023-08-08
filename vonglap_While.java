import java.util.Scanner;

public class vonglap_While {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        System.out.println("Chuong trinh tinh tong");
        Scanner  sc = new Scanner(System.in);

        System.out.println("Nhap vao 1 so nguyen: ");
        int n = sc.nextInt();

        while(i<=n){
            sum += i;
            i++;
        }

        System.out.print("Tong tu 1 den: "+ n+ " la: " + sum);

    }
}

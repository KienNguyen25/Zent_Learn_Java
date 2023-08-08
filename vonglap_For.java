import java.util.Scanner;

/**
 * vonglap_For
 */
public class vonglap_For {

    public static void main(String[] args) {
         int s = 0;
        for (int i = 0; i <= 100; i++) {
            s+= i;
            if(s>=100){
                break;
            }
    }
    System.out.println("number: "+ s);

    // int i = 1;
    // while(i<=10){
    //     System.out.println("hello");
    //     i++;
    // }

    System.out.println("Chuong trinh tinh tong");

    Scanner sc = new Scanner(System.in);

    System.out.print("NHap vao mot so N: ");
    int n = sc.nextInt();
    int sum = 0;

    for(int i = 0; i <= n; i++){
        sum += i;
    }

    System.out.println("tong tu 1 den " + n + "la: " + sum);

    }


}

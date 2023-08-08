import java.util.Scanner;

public class function_demo {
    public static void main(String[] args) {
    //    tinhTongM(5,6);
    // tinhTong(); 

    // tinhTongN();
    tinhTong1_N(5);
    }
    public static void tinhTongM(int a, int b){

        System.out.println("Tinh tong: "+ (a + b));
    }

    // public static void tinhTong(){
    //     Scanner sc = new Scanner(System.in);
    //     int a,b;

    //     System.out.println("Nhap vao gia tri a: ");
    //     a = sc.nextInt();

    //     System.out.println("Nhap vao gia tri b: ");
    //     b = sc.nextInt();

    //     System.out.println("Tinh tong: "+ (a+b));
    // }

    // public static void tinhTongN(){
    //     Scanner sc = new Scanner(System.in);
    //     int n, tong = 0;

    //     System.out.println("n = ");
    //     n = sc.nextInt();

    //     for(int i = 0; i<=n; i++){
    //         tong += i;
    //     }

    //     System.out.println("Tong = "+ tong);
    // }


    public static float tinhThuong(int a, int b){
        return a/b;
    }

    public static int tinhTong1_N(int n){
        int tong = 0;
        for(int i=0; i<=n;i++){
            tong += i;
        }
        return tong;

    }

        
}

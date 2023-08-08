import java.util.Scanner;

public class array_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu N: ");

        int n = sc.nextInt();
        //Cach khoi tao mang
        int a[] = new int [n];
        for (int i = 0; i<n; i++){
            System.out.print("a ["+i+"] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap la: ");
        for(int i = 0; i<n; i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
    
        System.out.println("----------------------");

        int mang[] = new int[5];
        Scanner ban_phim = new Scanner(System.in);

        for(int i = 0; i<mang.length; i++){
            System.out.println("Nhap phan tu thu: " +i+ " :");
            mang[i] =ban_phim.nextInt();
        }
        int tong = 0;

        for(int i = 0; i<mang.length;i ++){
            tong += mang[i];
        }
        System.out.println("Tong =" + tong);

    }
}

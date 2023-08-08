import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        //Cach khoi tao mang
        String a[] = new String[5];
        // String name[] = new String[18];
        a[0] = "Java";
        a[1] = "PHP";
        a[2] = "C++";
        a[3] = "Javascript";
        a[4] = "Python";

        System.out.println("cac ngon ngu lap trinh: ");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        // for(int i = 0; i<=a.length; i++){
        //     System.out.println(a[i]);
        // }



        //C2
        String b[] = {"Oto", "Xe may", "Xe dap", "may bay"};

        for(int i = 0; i <=b.length; i++){
            System.out.println("Cac loai phuong tien: " + b[i]);
        }
    }
}

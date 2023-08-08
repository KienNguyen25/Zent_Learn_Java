package Ontap.Ham;

/**
 * ham
 */
public class demo {

    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong 2 so nguyen: ");
        int sum = tinhtong(3, 5);
        System.out.println("TOng = " + sum);
        System.out.println("===============");
        checkAge(14);
        tong(4,5);
    }

  

    public static void checkAge(int age ){
        if(age >= 18){
            System.out.println("Ban da tren 18 tuoi");
        }else{
            System.out.println("Ban chua du 18 tuoi");
        }
    }

    //Ham tinh tong 2 so khong tra ve gia tri
    public static void tong(int x, int y){
        System.out.println("tinh tong cua 2 so x + y = " + (x+ y));
    }
    //Ham tinh tong co gia tri tra ve
      public static int tinhtong( int x, int y){
        return x+y;
    }
}


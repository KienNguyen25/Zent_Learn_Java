import java.util.Scanner;

/**
 * nhap_banphim
 */
public class nhap_banphim {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Thong tin Sinh Vien: ");

        System.out.println("Nhap Ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap lop: ");
        String lop = sc.nextLine();

        System.out.println("NHap Truong: " );
        String truong = sc.nextLine();

        System.out.println("Nhap Gioi tinh: ");
        String gioi_tinh = sc.nextLine();
        System.out.println("NHap vao Ngay Sinh:  ");
        String ngay_sinh = sc.nextLine();
        System.out.println("Nhap Que quan : ");
        String que_quan = sc.nextLine();

        System.out.println("Xin chao " +hoVaTen);
        System.out.println("Lop" +lop);
        System.out.println("Truong"+ truong);
        System.out.println("Gioi tinh" + gioi_tinh);
        System.out.println("Ngay sinh" + ngay_sinh);
        System.out.println("Que quan" + que_quan);
    }
}
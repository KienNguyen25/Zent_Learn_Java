package session_4;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

//Đề bài: Viết một chương trình đảo ngược trật tự các ký tự trong từng từ của một xâu (nhập vào từ bàn phím). Ví dụ “To Be Or Not To Be” sẽ trở thành “oT eB rO toN oT eB”.
public class exe2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh dao nguoc");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky: ");
        String s = sc.nextLine();

        StringBuffer string = new StringBuffer(s);
        string.reverse();
        String sn = string.toString();
        System.out.println(sn);

    }
}

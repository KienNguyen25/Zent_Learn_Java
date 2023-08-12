package session_4;
//Đề bài: Viết một chương trình đọc vào chuỗi số bất kỳ : ví dụ 1132422323, sau đó in ra màn hình dưới dạng : 1,132,422,323

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trinh doc chuoi so bat ky");
        System.out.println("Nhap vao mot chuoi bat ky: ");
        String number = sc.nextLine();
        StringBuffer chuoi = new StringBuffer(number);
             for(int i=number.length()-3;i>0;i-=3){
            chuoi.insert(i, ".");
        }
        number=chuoi.toString();
        System.out.print(number+"vnd");
     
    }
}

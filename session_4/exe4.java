package session_4;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh chuan hoa chuoi nhap vao");
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi = sc.nextLine();
        String[] kiTu = chuoi.split("\\s");
        String s = "";
        
        for(int i = 0; i < kiTu.length; i++){
            s += String.valueOf(kiTu[i].charAt(0)).toUpperCase() + kiTu[i].substring(1);        
            if(i == (kiTu.length - 1)){
                s = s + ".";
            }else{
                s = s + " ";
            }
        }
        System.out.println(s);
    }
}

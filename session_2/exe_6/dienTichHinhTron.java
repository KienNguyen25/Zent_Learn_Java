package session_2.exe_6;

import java.util.Scanner;

/**
 * dienTichHinhTron
 */
public class dienTichHinhTron {

    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh dien tich hinh tron");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinh = sc.nextDouble();
        double dienTich = DienTichHinhTron(banKinh);
        
        System.out.println("Voi ban kinh hinh tron la " +banKinh + ". Dien tich hinh tron la: " + dienTich); 
        
    }
    
    public static double DienTichHinhTron(double banKinh){
        double pi = 3.14;
        return banKinh*banKinh*pi;
    }
}
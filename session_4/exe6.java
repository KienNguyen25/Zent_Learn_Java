package session_4;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh in ra ky tu dau tien va cuoi cung trong chuoi:");
        System.out.println("==============================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi = sc.nextLine();
        String[] kiTu = chuoi.split("\\s");
        String dauTien = "";
        String cuoiCung = "";
        for(int i = 0; i < kiTu.length; i++){
            if(i == 0){
                dauTien = kiTu[i];
            }else{
                cuoiCung = kiTu[i];
            }
        }
        System.out.println("Ki tu dau tien: "+dauTien);
        System.out.println("Ki tu cuoi cung: "+cuoiCung);

    }
}

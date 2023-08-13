package session_4;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        System.out.println("Chuon trinh tach ho, ten dem, ten");
        System.out.println("======================");
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao mot chuoi : ");
        String chuoi = sc.nextLine();
        String[] kiTu = chuoi.split("\\s");
        String ho = "";
        String dem = "";
        String ten = ""; 
        if(kiTu.length==2){
            ho = kiTu[0];
            ten = kiTu[1];
        }else if(kiTu.length==1){
            ten = kiTu[0];
        }else{
            for(int i = 0; i < kiTu.length; i++){
                if(i == 0){
                    ho = kiTu[i];
                }else if(i == kiTu.length-1){
                    ten = kiTu[i];
                }else{
                    dem += kiTu[i] + " ";
                }
            }
        }

        System.out.println("Ho: "+ho);
        System.out.println("Dem: "+dem);
        System.out.println("Ten: "+ten);
      
    }
    }


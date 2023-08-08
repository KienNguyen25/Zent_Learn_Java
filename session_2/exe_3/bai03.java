package session_2.exe_3;

public class bai03 {
    public static void main(String[] args) {
        int count = 0;
        
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 || i % 7 == 0){
                count++;
            }
        }
        System.out.println("Cac so nguyen chia het cho 3 hoac 7 trong doan tu 1 den 100 la: " + count);
    }
}

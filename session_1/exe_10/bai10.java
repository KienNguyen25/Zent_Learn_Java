package session_1.exe_10;

public class bai10 {
     public static void main(String[] args) {
        //Biến đếm số lượng
        int count = 0; 
        
        // Duyệt qua các số từ 1 đến 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
            }
        }
        
        // In kết quả ra màn hình
        System.out.println("Số lượng các số nguyên chia hết cho 3 hoặc 7 nằm trong khoản 1 đến 100 là: " + count);
    }
}

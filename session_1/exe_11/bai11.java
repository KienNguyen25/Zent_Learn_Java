package session_1.exe_11;

public class bai11 {
    public static void main(String[] args) {
        int count = 0; // Biến đếm số lượng số chẵn
        int sum = 0; // Biến lưu tổng
        
        // Duyệt qua các số chẵn đầu tiên
        for (int i = 2; count < 10; i += 2) {
            sum += i;
            count++;
        }
        
        // In kết quả ra màn hình
        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
    }
}

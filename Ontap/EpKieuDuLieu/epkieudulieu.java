package Ontap.EpKieuDuLieu;

public class epkieudulieu {
    //Ép kiểu rộng : là ép kiểu từ dữ liệu bé đến lớn . Không lo mất mát dữ liệu
    //ex: Int -> Long -> Float -> Double

    //Ép kiểu hẹp: là ép kiểu dữ liệu từ lớn đến bé . Có thế mất dữ liệu
    //ex: double -> float -> long -> int
    public static void main(String[] args) {
        //ép kiểu rộng
        int a = 2;
        int b = 4;
        double kq = (double) a/b;
        System.out.println("Ket qua = " + kq); //int -> double

        //ép kiểu rộng
        int c = 128;
        
    }
}

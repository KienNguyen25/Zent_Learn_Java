public class Main{
    public static void main(String[] args) {
        Xe oto = new Xe();

        oto.hangXe = "Mazda";
        oto.mauXe = "Trang";
        oto.soCho = 5;
        oto.namSX = "2022";

        System.out.println("Hãng Xe: " + oto.hangXe);
        System.out.println("Màu sơn: " + oto.mauXe);

        oto.chay();
    }
}
    
 class Xe { 
    String hangXe;
    String mauXe;
    int soCho;
    String namSX;

    //Phuong thuc
    public void chay(){
        System.out.println("Xe chay nhanh");
    }
}

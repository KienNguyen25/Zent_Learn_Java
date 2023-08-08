package Ontap.kethua.overriding.QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        //Khởi tạo đối tượng khoa Toán
        KhoaToan toan1 = new KhoaToan("Nguyen Huu Kien", "7777");
        toan1.tinhDTB();

        //Khởi tao đối tượng khoa Anh
        KhoaAnh anh1 = new KhoaAnh("Nguyen văn B","1111");
        anh1.tinhDTB();

        //Khởi tao đối tượng khoa Văn
        KhoaVan van1 = new KhoaVan("Nguyen văn C","22222");
        van1.tinhDTB();
    }
}

package Ontap.kethua.overriding.QuanLyDiem;

/**
 * KhoaToan
 */
public class KhoaToan extends NamHoc2023{

    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }


    //overriding tính theo phương thức riêng
    
    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm TB của khoa Toan");

    }

    
}
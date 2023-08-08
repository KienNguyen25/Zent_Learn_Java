package Ontap.kethua.overriding.QuanLyDiem;

/**
 * KhoaToan
 */
public class KhoaAnh extends NamHoc2023{

    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }


    //overriding tính theo phương thức riêng
    
    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm TB của khoa Anh");

    }

    
}
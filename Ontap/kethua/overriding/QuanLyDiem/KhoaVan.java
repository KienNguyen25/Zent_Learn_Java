package Ontap.kethua.overriding.QuanLyDiem;

public class KhoaVan extends NamHoc2023 {

    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
        //TODO Auto-generated constructor stub
    }


      //overriding tính theo phương thức riêng
    @Override
    public void tinhDTB() {
            System.out.println("Đây là phương thức tính điểm TB của Khoa Văn");

    }

    
    
}

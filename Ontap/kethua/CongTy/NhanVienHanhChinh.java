package Ontap.kethua.CongTy;

/**
 * NhanVienHanhChinh
 */
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh(String ten, String queQuan, int cccd, int sdt) {
        super(ten, queQuan, cccd, sdt);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }

    
}
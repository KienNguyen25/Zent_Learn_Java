package Ontap.kethua.CongTy;

public class NhanVienDiCa extends NhanVien{
    //Khai báo thêm thuộc tính ca
    //ca1: làm ngày
    //ca2: làm đêm
    protected int ca;

    public NhanVienDiCa(String ten, String queQuan, int cccd, int sdt) {
        super(ten, queQuan, cccd, sdt);
    }
    public NhanVienDiCa(String ten, String queQuan, int cccd, int sdt, int ca) {
        super(ten, queQuan, cccd, sdt);
        this.ca = ca;
    }

    //Override có thể hiểu đc là tái định nghĩa hoặc ghi đề phương thức tinhLuong();
    @Override
    public double tinhLuong() {
        return luongCoBan * 1.05; //cao hơn so với lương nv hành chính
    }
    
}

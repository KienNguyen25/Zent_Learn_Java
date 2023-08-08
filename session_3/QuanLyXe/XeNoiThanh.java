package session_3.QuanLyXe;

public class XeNoiThanh extends ChuyenXe {
    protected String soTuyen;
    protected double soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc ) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void xuatThongTin() {

    }

    @Override
    public double tongDoanhThu() {
        return doanhThu;
    
    }
}

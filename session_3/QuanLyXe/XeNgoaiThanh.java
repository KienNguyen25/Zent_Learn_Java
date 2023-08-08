package session_3.QuanLyXe;

public class XeNgoaiThanh extends ChuyenXe {
    protected String noiDen;
    protected double soNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }

     public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,double soNgayDiDuoc ) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

	@Override
	public double tongDoanhThu() {
		return doanhThu;
	}

    @Override
    public void xuatThongTin() {
       
    }

    







   

    
    
}

package session_3.QuanLyXe;

public abstract class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    //Constructor 
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public abstract void xuatThongTin();
    // public abstract void xuatThongTin() {
    //     System.out.println("Mã số chuyến: " + maSoChuyen);
    //     System.out.println("Họ tên tài xế: " + hoTenTaiXe);
    //     System.out.println("Số xe: " + soXe);
    //     System.out.println("Doanh thu: " + doanhThu);
    // }

    public abstract double tongDoanhThu();
        

}

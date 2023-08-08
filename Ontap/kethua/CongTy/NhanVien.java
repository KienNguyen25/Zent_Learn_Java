package Ontap.kethua.CongTy;
// khac bao lop Nhan vien la phuong thuc truu tuong
//Luu y
/*
 * 1. Trong lớp có phuong thức Abstract thì lớp đó cũng phải là Abstract
 * 2.Phương thức Abstract là phương thức chỉ có định nghĩa tên hàm, các đối số không có nội dung hàm
 * 3.Lớp Abstract: là một lớp trừu tượng, không thể khởi tạo nó bằng toán tử new
 * 4.Class con kế thừa từ Abstract thì phải định nghĩa lại các phương thức Abstract từ cha nó
 */
public  abstract class NhanVien {
    protected String ten;
    protected String queQuan;
    protected int cccd;
    protected int sdt;
    protected double luongCoBan = 850; //850$

    //Constructor khoi tao doi tuong tu dong
    public NhanVien(String ten, String queQuan, int cccd, int sdt) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.cccd = cccd;
        this.sdt = sdt;
    }

    //Phuong thuc truu tuong Tinh Luong
    // luu y phuong thuc truu tuong ko co phan than
    public abstract double tinhLuong();


    
}

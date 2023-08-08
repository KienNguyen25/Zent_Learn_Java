package Ontap.kethua.CongTy;

public class mainNhanVien {
    // khac bao lop Nhan vien la phuong thuc truu tuong
//Luu y
/*
 * 1. Trong lớp có phuong thức Abstract thì lớp đó cũng phải là Abstract
 * 2.Phương thức Abstract là phương thức chỉ có định nghĩa tên hàm, các đối số không có nội dung hàm
 * 3.Lớp Abstract: là một lớp trừu tượng, không thể khởi tạo nó bằng toán tử new
 * 4.Class con kế thừa từ Abstract thì phải định nghĩa lại các phương thức Abstract từ cha nó
 */
    public static void main(String[] args) {
        // NhanVien nv1 = new NhanVien("Nhan vien 1", "Ha Noi", 12345, 0123456);
        // double luongNV = nv1.tinhLuong();
        // System.out.println("Luong nv1 la: "+luongNV);


        //Tao doi tuong la nhan vien hanh chinh
        NhanVienHanhChinh nvhc1 = new NhanVienHanhChinh("Nhan vien hanh chinnh 1 ", "Hai Phong", 44444, 23444545);
        double luongNVHC1 = nvhc1.tinhLuong();
        System.out.println("Luong co ban cua Nhan vien hanh chinh 1 la: "+ luongNVHC1);

        //Tao doi tuong la nhan vien di ca
        NhanVienDiCa nvdc1 = new NhanVienDiCa("Nhan vien di ca 1", "Bac Ninh", 22222, 8477273);
        double luongNVDC1 = nvdc1.tinhLuong();
        System.out.println("Luong co ban cuua nhan vien di ca 1 la: "+ luongNVDC1);

        NhanVienDiCa ca2 = new NhanVienDiCa("Nhan vien di ca 2", "Nghe An", 333333, 023423423, 2);
        double luongCa2 = ca2.tinhLuong();
        System.out.println("Luong nv ca 2 la: "+luongCa2);
        System.out.println(ca2.ca);
    }
}

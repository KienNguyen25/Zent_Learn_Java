package Ontap.kethua.overriding.QuanLyDiem;

/**
 * NamHoc2023
 */
public class NamHoc2023 {
    //thuoc tinh
    protected String ten;
    protected String cccd;

    //Constructor
    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    //Phuong thuc
    public void tinhDTB(){
        System.out.println("Đây là phương thức tính điểm TB của class cha");
    }

    

    
}
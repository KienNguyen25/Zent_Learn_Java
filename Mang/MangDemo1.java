package Mang;

import java.util.Arrays;

public class MangDemo1 {
    public static void main(String[] args) {
        //1. Khai bao mang:
        String[] mangStr;
        int[] mangNguyen;
        boolean[] mangBool;
        Float[] mangFl;
        //2. Khoi tao mang kem theo kich thuoc
        String[] mangStr2 = new String[15];  //Chứa được tối đa 15 phần tử
        int[] mangNguyen2 = new int[7];     //Chứa được tối đa 7 phần tử là kiểu số nguyên
        //3. Khởi tạo mảng kèm giá trị ban đầu
        String[] mangStr3 = new String[]{"Kien","Hieu","Long","ky"};
        String[] mangStr4 = {"iphone 11","iphone 12","iphone 13"};
        int[] mangNguyen3 = new int[]{1,2,3,4,5};
        //Truy xuat phan tu cua mnag
        System.out.println(mangStr4[0]);
        System.out.println(mangStr3[2]);
        System.out.println(mangNguyen3[3]);
        //TRa ve so phan tu cua mang
        System.out.println("chieu dai cua mangString3 la: "+mangStr3.length);

        //Duyet mang dung for
        //c1: Dùng để xuất các phần tử
        String[] mangStr5 = {"iphone 11","iphone 12","iphone 13"};
        for(String pt : mangStr5){
            System.out.println(pt);
        }
        int[] mangNguyen6 = new int[]{1,2,3,4,5};
        for(int pt: mangNguyen6){
            System.out.println(pt);
        }
        System.out.println("=======================");
        //c2: dùng for duyệt qua index
        //lưu ý: index mảng từ 0 -> length -1
        String[] mangStr8 = new String[]{"Kien","Hieu","Long","ky"};
        for(int i=0;i<mangStr8.length;i++){
            System.out.println(mangStr8[i]);
        }
        //Gan gia tri cho mang
        System.out.println("Sau khi gan lai gia tri cho mang: ");
        mangStr8[0] = "Obama";
          for(int i=0;i<mangStr8.length;i++){
            System.out.println(mangStr8[i]);
        }

        //Update toàn bộ danh sách 
        int[] mangNguyen9 = new int[]{1,2,3,4,5};
        for(int i = 0; i<mangNguyen9.length;i++){
            mangNguyen9[i] += 5;
        }
        System.out.println("Mang nguyen sau khi thay doi: ");
        for(int i = 0; i<mangNguyen9.length;i++){
            System.out.println(mangNguyen9[i]);
        }


        //Sắp xếp tăng dần
        int[] mang10= {8,2,6,9,1};
        Arrays.sort(mang10);
        System.out.println("Mang sau sap xep la: ");
        System.out.println(Arrays.toString(mang10));

        //Đảo ngược mảng
         int[] mang11= {8,2,6,9,1};
         for(int i=0, j=mang11.length-1; i<j; i++,i--){
            int temp = mang11[i];
            mang11[i] = mang11[j];
            mang11[j] = temp;
         }
         System.out.println("Mang sau dao nguoc la: ");
         System.out.println(Arrays.toString(mang11));





    }
}

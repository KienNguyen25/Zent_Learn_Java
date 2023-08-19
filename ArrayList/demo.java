package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        //1. Khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        // Khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        //Xuất list
        // System.out.println(lst);
        // System.out.println(lst2);
        System.out.println(lst3);

        //2. Add thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(3);
        lst4.add(2);
        lst4.add(5);
        System.out.println("lst4 moi add la: ");
        System.out.println(lst4);
        // add(index, element) phần tử vào vị trí chỉ định
        lst4.add(1,10);
        System.out.println(lst4);

        //3. size : trả về số phần tử của list
        System.out.println("So phan tu cua lst4 la: "+lst4.size());

        //4. get(int index): Trả về giá trị list tại ví trí index
        System.out.println("gia tri thu 1 cua lst4 la: "+lst4.get(1));
        
        //5. remove: Xóa phần tử tại vị trí
        lst4.remove(2);
        System.out.println("lst4 sau khi xóa giá trị tại vị trí index thứ 2 là: ");
        System.out.println(lst4);

        // remove (1 phần tử được chỉ định)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5 = "+lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("Giá trị của lst5 sau xóa là: "+ lst5);

        //6. set(index, element) : thay đổi giá trị
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6 = "+lst6);
        lst6.set(2, 99);
        System.out.println("lst6 sau thay đổi là: "+lst6);

        //7. contains() : Kiểm tra Collection có chứa phần tử nào đó không
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean ktra = lst7.contains(4);
        System.out.println(ktra);

        //8. Collections.sort(list) : Sắp xếp tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(34,21,68,3,200));
        Collections.sort(lst8);
        System.out.println(lst8);

        //9. indexOf(): Tìm vị trí đầu tiên của element trong list
        //nếu không tồn tại trả về -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(34,21,68,3,200));
        System.out.println(lst9.indexOf(3));

        //10. Duyệt list 
        // Cách 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(34,21,68,3,200));
        System.out.println("Dùng duyet for");
        for(int vl : lst10){
            System.out.println(vl);
        }
        //Cách 2: khi cần sử dụng chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(34,21,68,3,200));
        System.out.println("=====================");
        System.out.println("dung duyet for chuyen doi so index");
        for(int i=0; i<lst11.size(); i++){
            int vl = lst11.get(i);
            System.out.println(vl);
        }

        





    }
}

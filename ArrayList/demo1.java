package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
         ArrayList<Integer> lst10 = new ArrayList<>(List.of(34,21,68,3,200));
        System.out.println("Dùng duyệt for");
        for(int vl : lst10){
            System.out.println(vl);
        }
    }   
}

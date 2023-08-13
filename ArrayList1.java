import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * ArrayList
 */

public class ArrayList1 {

    public static void main(String[] args) {
     ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add(0,"Ford");  //add vao index 0
    cars.add("Mazda");
    System.out.println(cars);

    //Phuong thuc get -> lay ra gia tri tai index i
    System.out.println(cars.get(1)); //tại đây lấy ra vị trí thứ 1 là "Volvo"

     //Phương thức contains -> Kiểm tra xem phần tử có trong arraylist hay không
     System.out.println(cars.contains("Mazda"));

      //indexOf -> Trả về index, nếu không tồn tại trả về -1
      System.out.println(cars.indexOf("BMW"));

       // lastIndexOf -> Trả về index cuối cùng của object trong al
       System.out.println(cars.lastIndexOf("Mazda"));
       // remove -> Xóa phần tử trong ArrayList
       System.out.println(cars.remove("Ford"));
       System.out.println(cars);

       // // size trả về số phần tử của list
       System.out.println(cars.size());
       System.out.println(cars);

        // set -> Ghi đè lên vị trí i
        cars.set(0,"Nguyen Huu Kien");
        System.out.println(cars);

        //sắp xếp mảng sort()
        Collections.sort(cars);
        System.out.println(cars);

        //in toàn bộ mảng   
        //C1: dung for
        for(int i = 0 ; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        System.out.println("===========");
        //c2: dùng foreach
        for(String item: cars){
            System.out.println(item);
        }
        // Xóa toàn bộ phần tử trong al
        cars.clear();
    }
}
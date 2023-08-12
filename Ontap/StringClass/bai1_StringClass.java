package Ontap.StringClass;

public class bai1_StringClass {
    public static void main(String[] args) {
        String s = "Vi sao e biet anh nghi gi" + 
                    "\nVi em dau phai long toi?";
        System.out.println(s);

    //Lop StringBuilder là một lớp dùng để quản lý một chuỗi có thể thay đổi kích thước và nội dung
    //append(string): thêm string vào cuối chuỗi gốc
    //insert(index,string): chèn string từ vị trí index
    //delete(start,end): XÓa tất cả các kí tự từ vị trí start đến vị trí end -1
    //string.length(): Trả về độ dài của chuỗi tính cả space


    //Cac phương thức thường dùng
    //1.append(string): thêm vào cuối mỗi chuỗi
    StringBuilder chuoi = new StringBuilder();
    chuoi.append("Hello");
    chuoi.append(", Nguyen Huu Kien");
    chuoi.append(", rat vui dc gap ban");
    System.out.println(chuoi);
    //2.insert(vị trí index, chuỗi cần chèn)
    chuoi.insert(6," chen");
    System.out.println(chuoi); 
    //3.delete(start,end) :Xóa tất cả các kí tự từ vị trí start đến vị trí end -1
    chuoi.delete(7, 12); 
    System.out.println(chuoi);
    //4.length(): tra ve do dai cua chuoi
    System.out.println(chuoi.length());
    //5. reverse() : Đảo ngược chuỗi
    chuoi.reverse();
    String sn = chuoi.toString(); //chuyen sang chuỗi
    System.out.println(sn);


    //5.IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi 
    //trả về -1 nếu không thấy
    String s1 = " tôi đi tìm tôi";
    System.out.println(s1.indexOf("tôi"));
    //6. LastIndexOf: Trả về vị trí index xuất hiện cuối cùng của kí tự hoặc chuỗi 
    //trả về -1 nếu không tìm thấy
    System.out.println(s1.lastIndexOf("tôi"));

    //7. Contains : Kiểm tra chuỗi con
    String s2 = ".mp3";
    String s3 = "tuhoc.mp3"; 
    //Kiểm tra s3 có chứa cụm string của s2 không
    boolean check = s3.contains(s2);
    if(check){
        System.out.println(" có chứa .mp3 trong chuỗi");
    }else{
        System.out.println("Không tìm thấy .mp3 trong chuỗi");
    }

    //8. Substring : Trích lọc chuỗi con từ chuỗi ban đầu
    //subtring(int beginIndex)
    //subtring(int beginIndex, int endIndex)
    String s4 = "abcdfgh";
    System.out.println(s4.length());
    String s5 = s4.substring(3) ;
    System.out.println(s5);
    String s6 = s4.substring(3,6) ;
    System.out.println(s6);

    //9. replace(Str old, Str new)
    //Hàm có nhiệm vụ thay thế tất cả chuỗi con oldString của chuỗi gốc bằng chuỗi con newString và trả về chuỗi mới tương ứng.
    String s7 = "a1a2a3a4a5";
    String s8 = s7.replace("a", "A");
    System.out.println(s8);

    //10. Xóa toàn bộ khoảng trắng ở đầu và cuối
    //trim()
    String s9 = "       Nguyen Huu Kien         ";
    String s10 = s9.trim();
    System.out.println(s9);
    System.out.println(s10);

    //11. Cách 1 dùng biểu thức chính quy 
    // dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
    // \s+ đại diện cho: một hoặc nhiều khoảng trắng liên tiếp
    // $ đại diện cho kết thúc dòng
    // \s+$ đại diện cho một hoặc nhiều khoảng trắng liên tiếp ngay trước kết thúc dòng
    // \ là kí tự đặc biệt nên trong java cần thêm một \ trước nó nữa
    //replaceAll(): thay thế toàn bộ
    String s11 = s9.replaceAll("\\s+$", "");
    System.out.println(s9);
    System.out.println(s9.length());
    System.out.println(s11);
    System.out.println(s11.length());
    //cách 2: Biểu thức chính quy 
    // dùng ^\\s+ để xóa tất cả các khoảng trắng ở đầu chuỗi
    String s12 = "      Nguyen Huu Kien     ";
    String s13 = s12.replaceFirst("^\\s+", "");
    System.out.println(s12);
    System.out.println(s13);

    //11. startsWith(String prefix)
    //Hàm này sẽ kiểm tra xem xâu có bắt đầu bằng xâu prefix không, trả lại true nếu đúng, ngược lại thì trả lại false.
    String s14 = "Zent Group";
    System.out.println(s14.startsWith("Ze"));

    //12 . split tách chuỗi
    String s15 = "Hello,word";
    String[] mang = s15.split(",");
    //duyệt mảng
        for(int i = 0; i <mang.length; i++){
            System.out.println(mang[i]);
        }

    //13. toLowerCase() và toUpperCase()
    String s16 = "Toi HoC laP trinH taI Zent";
    String s17 = s16.toLowerCase(); //viết thường
    String s18 = s16.toUpperCase(); //in Hoa
    System.out.println(s17);
    System.out.println(s18);

    //14. toCharArray() : tách chuỗi thành từng kí tự rồi cho vào mảng
    String s19 = "qeiwkxm123";
    char[] mang1 = s19.toCharArray();
    //duyệt mảng
    for(int i = 0; i<mang1.length; i++){
        System.out.println(mang1[i]);
    }

 





    }
}

package ArrayList;
/**
 * ArrayList2
 */
public class SinhVien {
    public String name;
    public int old;

    //constructor
    public SinhVien(String name, int old) {
        this.name = name;
        this.old = old;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.old;
    }
    


    

    
}
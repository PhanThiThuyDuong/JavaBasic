import java.util.ArrayList;
import java.util.List;

public class BT5 {
    public void CollectionJava (){
        List<String> nhanVien = new ArrayList<String>();
        nhanVien.add("Họ và Tên");
        nhanVien.add("Tuổi");
        nhanVien.add("Dịa chỉ");
        nhanVien.add("Quê quán");
        System.out.println("Các thông tin của nhân viên");
        System.out.print("\t" + nhanVien + "\n");
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 0){
                integerList.add(i);
            }
        }
        System.out.println(integerList);
        BT5 bt5 = new BT5();
        bt5.CollectionJava();
    }
}

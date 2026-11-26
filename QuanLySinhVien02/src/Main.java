import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> danhSach = new ArrayList<>();
        danhSach.add(new Student("SV01", "Nguyen Van An", "15/05/2005"));
        danhSach.add(new Student("SV02", "Tran Thi Binh", "20/08/2005"));

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student sv : danhSach) {
            sv.hienThiThongTin();
        }
    }
}
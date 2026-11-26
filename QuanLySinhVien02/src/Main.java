import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Student timTheoMaSV(List<Student> danhSach, String maSV) {
        for (Student sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Student> danhSach = new ArrayList<>();
        danhSach.add(new Student("SV01", "Nguyen Van An", "15/05/2005"));
        danhSach.add(new Student("SV02", "Tran Thi Binh", "20/08/2005"));

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student sv : danhSach) {
            sv.hienThiThongTin();
        }

        System.out.println("=== TIM KIEM SV01 ===");
        Student ketQua = timTheoMaSV(danhSach, "SV01");
        if (ketQua != null) {
            ketQua.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }
}
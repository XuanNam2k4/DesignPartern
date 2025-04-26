package observer;

public class MainTiGia {
    public static void main(String[] args) {
        DichVuTiGia dvtg = new DichVuTiGia();
        NhaDauTu phuong = new NhaDauTuA("Phạm Văn Phương",dvtg);
        NhaDauTu hue = new NhaDauTuB("Kim Huệ",dvtg);
//        thực hiện cộng viẹc
        phuong.dangKy();
        hue.dangKy();
        dvtg.thongBao(5);
        hue.huyDangKy();
        dvtg.thongBao(-5);

    }
}

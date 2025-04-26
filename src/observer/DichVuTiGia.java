package observer;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
//    đau tien khai báo moối quan hệ số nhiều
    //mũi tên đi ra
    //mũi tên trong puml hướng vè chỗ nàoo là kiẻu dữ liệu
    List<ThayDoiTiGia> nhaDauTus = new ArrayList<>();
    void dangKy(ThayDoiTiGia ndt){
        nhaDauTus.add(ndt);
    }
    void huyDangKy(ThayDoiTiGia ndt){
        nhaDauTus.remove(ndt);
    }

//    notify
    void thongBao(float delta){
        for(var ndt:nhaDauTus){
            ndt.nhanThongBao(delta);
        }
    }
}

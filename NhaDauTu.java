package observer;

public abstract class NhaDauTu implements ThayDoiTiGia {
    String ten;
//    mũi tên đi tới dâu thì đó là kiẻu dữ liệu vd : mũi tên toi DVTIGIA còn lại là biến
    DichVuTiGia dvtg;

    public NhaDauTu(String ten, DichVuTiGia dvtg) {
        this.ten = ten;
        this.dvtg = dvtg;
//        còn muốn khoởi tạp đang ký lun có dong này  dvtg.dangKy(this);
    }

    public void dangKy(){
        dvtg.dangKy(this);
    }

    public void huyDangKy(){
        dvtg.huyDangKy(this);
    }

}

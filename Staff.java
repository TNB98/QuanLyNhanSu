public abstract class  Staff {

    //mã nhân viên, tên nhân viên, tuổi nhân viên, hệ số lương, ngày vào làm, bộ phận làm việc, số ngày nghỉ phép
    private String maNhanVien ;
    private String tenNhanVien ;
    private double heSoLuong;
    private String ngayVaoLam ;
    private String boPhanLamViec ;
    private int soNgayNghiPhep ;
    private double luong ;

    //seter and geter
    public void setLuong(double luong) { this.luong = luong; }
    public double getLuong() {
        return luong;
    }
    public  String getMaNhanVien() {
        return  maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getTenNhanVien() {
        return  tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public String getNgayVaoLam() {
        return ngayVaoLam;
    }
    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }
    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }
    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }
    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    //to string
    public abstract String displayInformation();

}

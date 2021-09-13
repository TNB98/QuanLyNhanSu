public class Manager extends Staff implements ICalculator{
    private String chucDanh;
    public Manager(String maNhanVien, String tenNhanVien, double heSoLuong, String ngayVaoLam, String boPhanLamViec,
                   int soNgayNghiPhep , String chucDanh ) {
        setMaNhanVien(maNhanVien);
        setTenNhanVien(tenNhanVien);
        setHeSoLuong(heSoLuong);
        setNgayVaoLam(ngayVaoLam);
        setBoPhanLamViec(boPhanLamViec);
        setSoNgayNghiPhep(soNgayNghiPhep);
        setChucDanh(chucDanh);
        quanLy();
        setLuong(quanLy());
    }

    //Hiển thị thông tin
    public String displayInformation() {
        return  String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-20s", getMaNhanVien(), getTenNhanVien(), getHeSoLuong(),
                getNgayVaoLam(), getBoPhanLamViec(),getSoNgayNghiPhep(),getChucDanh() );
    }

    //Hiển thị thông tin thêm lương
    public String displayInformationSalary() {
        return  String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-16s%-50f", getMaNhanVien(), getTenNhanVien(), getHeSoLuong(),
                getNgayVaoLam(), getBoPhanLamViec(),getSoNgayNghiPhep(),getChucDanh(),quanLy() );
    }
    @Override
    public double nhanVien() {
        return 0;
    }
    @Override
    public double quanLy() {
        double luong = 0;
        if(getChucDanh().equals("1")){
            luong =  getHeSoLuong()*5000000 + 8000000 ;//Business Leader = 8,000,000
            return luong;
        }
        if(getChucDanh().equals("2")){
            luong =  getHeSoLuong()*5000000 + 5000000 ;//Project Leader = 5,000,000
            return luong;
        }
        if(getChucDanh().equals("3")){
             luong =  getHeSoLuong()*5000000 + 6000000 ;//Technical Leader = 6,000,000
            return luong;
        }
        return luong;
    }

    //seter & geter
    public String getChucDanh() {
        return chucDanh;
    }
    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }
}

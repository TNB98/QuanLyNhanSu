public class Employee extends Staff implements ICalculator{
    private double soGioLamThem;

    public Employee(String maNhanVien, String tenNhanVien, double heSoLuong, String ngayVaoLam, String boPhanLamViec,
               int soNgayNghiPhep ,double soGioLamThem) {
        setMaNhanVien(maNhanVien);
        setTenNhanVien(tenNhanVien);
        setHeSoLuong(heSoLuong);
        setNgayVaoLam(ngayVaoLam);
        setBoPhanLamViec(boPhanLamViec);
        setSoNgayNghiPhep(soNgayNghiPhep);
        calculateSalary();
        setLuong(nhanVien());
        setSoGioLamThem(soGioLamThem);
    }
    //Công thức tính lương
    public double calculateSalary() {
        nhanVien();
        return nhanVien();
    }
    @Override
    public double nhanVien() {
        double luong = getHeSoLuong() * 3000000 + soGioLamThem * 200000;
        return luong;
    }
    @Override
    public double quanLy() {
        return 0;
    }

    //hiển thị thông tin nhân viên ra màn hình
    public String displayInformation() {
        return  String.format("%-15s%-15s%-15s%-15s%-15s%-20s", getMaNhanVien(), getTenNhanVien(), getHeSoLuong(),
                getNgayVaoLam(), getBoPhanLamViec(),getSoNgayNghiPhep() );
    }

    //hiển thị thông tin nhân viên và lương ra màn hình
    public String displayInformationSalary() {
        return  String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-20f", getMaNhanVien(), getTenNhanVien(), getHeSoLuong(),
                getNgayVaoLam(), getBoPhanLamViec(),getSoNgayNghiPhep(),nhanVien() );
    }

    //seter & geter
    public double getSoGioLamThem() {
        return soGioLamThem;
    }
    public void setSoGioLamThem(double soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
}




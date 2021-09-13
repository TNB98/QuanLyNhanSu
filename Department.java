public class Department {
    private int maBoPhan ;
    private String tenBoPHan ;
    private    int soLuongNhanVienHienTai ;
    //contructer Depatermnt
    public Department (int maBoPhan ,String tenBoPHan ,int soLuongNhanVienHienTai){
        setMaBoPhan(maBoPhan);
        setTenBoPHan(tenBoPHan);
        setSoLuongNhanVienHienTai(soLuongNhanVienHienTai);
    }

    //seter & geter
    public int getMaBoPhan() { return maBoPhan; }
    public void setMaBoPhan(int maBoPhan) { this.maBoPhan = maBoPhan; }
    public String getTenBoPHan() { return tenBoPHan; }
    public void setTenBoPHan(String tenBoPHan) { this.tenBoPHan = tenBoPHan; }
    public int getSoLuongNhanVienHienTai() { return soLuongNhanVienHienTai; }
    public void setSoLuongNhanVienHienTai(int soLuongNhanVienHienTai) { this.soLuongNhanVienHienTai = soLuongNhanVienHienTai; }


    //Hiển thị ra màn hình depatermnt
    public String toString() {
        return String.format("%-15s%-15s%-15d",getMaBoPhan(),getTenBoPHan(),getSoLuongNhanVienHienTai());
    }


}

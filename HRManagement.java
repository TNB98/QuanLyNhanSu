import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HRManagement {

    //chuan bi du lieu
    ArrayList<Department> depList = new ArrayList<>();
    ArrayList<Staff> staff = new ArrayList<>();

    public  void nhapDL () {

        Employee nv1 = new Employee("10", "Nguễn Văn A", 2, "12/02/2019", "QC", 4,20);
        Employee nv2 = new Employee("11", "Nguễn Văn B", 2, "17/12/2019", "QC", 6,50);
        Employee nv3 = new Employee("12", "Nguễn Văn C", 2.5, "14/05/2019", "QC", 7,60);
        Employee nv4 = new Employee("13", "Nguễn Văn E", 2.5, "11/2/2019", "QC", 8,40);
        Employee nv5 = new Employee("14", "Nguễn Văn F", 2, "01/2/2019", "QC", 10,30);
        Manager nv6 =  new Manager("15", "Tran Nhu C", 1.5, "12/2/2021", "PC", 11, "1");
        Manager nv7 = new Manager("16","Quoc Van Tai",1.3,"11/03/2006","PC",2,"3");
        staff.add(nv1);
        staff.add(nv2);
        staff.add(nv3);
        staff.add(nv4);
        staff.add(nv5);
        staff.add(nv6);
        staff.add(nv7);
        int soLuongNhanVienHienTai = 0;
        for (Staff D : staff ){
            if("QC".equals(D.getBoPhanLamViec())){
                soLuongNhanVienHienTai ++;
            }
        }
        Department dep1 = new Department(11, "QC", soLuongNhanVienHienTai);
        soLuongNhanVienHienTai = 0 ;
        for (Staff D : staff ){

            if("PC".equals(D.getBoPhanLamViec())){
                soLuongNhanVienHienTai ++;
            }

        }
        Department dep2 = new Department(12, "PC", soLuongNhanVienHienTai);
        depList.add(dep1);
        depList.add(dep2);
    }
    //Hiển thị thông tin nhân viên
    public void showAllStaffs(){
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
        "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep"));
        for (Staff staff : staff) {
            if (staff instanceof Employee) {
                System.out.println(staff.displayInformation());
            } else {
                System.out.println(staff.displayInformation());
            }
        }
    }

    //Hiển thị các bộ phận trong công ty
    public void showAllDepartments() {
        int soLuongNhanVienHienTai = 0;
        for (Staff D : staff ){
            if("QC".equals(D.getBoPhanLamViec())){
                soLuongNhanVienHienTai ++;
            }
        }
        Department dep1 = new Department(11, "QC", soLuongNhanVienHienTai);
        depList.remove(0);
        depList.remove(0);
        depList.add(dep1);
        soLuongNhanVienHienTai = 0 ;
        for (Staff D : staff ){

            if("PC".equals(D.getBoPhanLamViec())){
                soLuongNhanVienHienTai ++;
            }

        }
        Department dep2 = new Department(12, "PC", soLuongNhanVienHienTai);
        depList.add(dep2);

        for(Department department : depList) {
            System.out.println(String.format("%-15s%-15s%-15s", "Mã Bộ Phận", "Tên Bộ Phận", "Số Lượng Nhân Viên"));
                System.out.println(department.toString());
        }
    }

    //Hiển thị thông tin nhân viên
    public void showAllEmpoyeeDepartments(){
        for (Department department:depList) {
            System.out.println(department.getTenBoPHan());
            System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                    "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep"));
            for (Staff staff : staff) {
                if (department.getTenBoPHan().equals(staff.getBoPhanLamViec())) {
                    if (staff instanceof Employee) {
                        System.out.println(((Employee) staff).displayInformation());
                    } else {
                        System.out.println(((Manager) staff).displayInformation());
                    }
                }
            }
        }
    }

        //Thêm nhân viên mới vào công ty: bao gồm 2 loại
        public void addNewEmployee(){
        int yes;
        do {
            System.out.println("Nhập Thông Tin(1.Nhân Viên 2.Quản Lý)");
            Scanner sc = new Scanner(System.in);
            String choiceInput = sc.nextLine();
            int choice = Integer.parseInt(choiceInput);

                System.out.println("Nhập Mã Nhân Viên");
                String maNhanVien = sc.nextLine();
                System.out.println("Nhập Tên Nhân Viên");
                String tenNhanVien = sc.nextLine();
                System.out.println("Hệ Số Lương");
                String heSoLuong1 = sc.nextLine();
                double heSoLuong = Double.parseDouble(heSoLuong1);
                System.out.println("Ngày Vào Làm");
                String ngayVaoLam = sc.nextLine();
                System.out.println("Bô Phận Làm Việc");
                String boPhanLamViec = sc.nextLine();
                System.out.println("So Ngay Nghi Phep");
                String soNgayNghiPhep1 = sc.nextLine();
                int soNgayNghiPhep = Integer.parseInt(soNgayNghiPhep1);

            if(choice == 1 ){
                System.out.println("Nhập số giờ làm thêm:");
                double soGioLamThem = sc.nextDouble();
                Employee nv = new Employee(maNhanVien, tenNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep,soGioLamThem);
                staff.add(nv);
                System.out.println("Bạn đã thêm thành công 1 nhân viên!");
            }

            if (choice == 2){
                System.out.println("Chức Danh(1:Business Leader 2:Project Leader 3:Technical Leader)");
                String chucDanh = sc.nextLine();
                Manager nv = new Manager(maNhanVien,tenNhanVien,heSoLuong,ngayVaoLam,boPhanLamViec,soNgayNghiPhep,chucDanh);
                staff.add(nv);
                System.out.println("Bạn đã thêm thành công 1 nhân viên!");
            }

            System.out.println("Bạn có muốn nhập nữa không (yes = 1 , no = 2)");
            yes = sc.nextInt();
        }
        while (yes == 1);

        }

        //Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
        public void find() {
        System.out.println("Hãy Nhập Thông Tin Cần Tìm (Tên Nhân Viên hoặc Mã Nhân Viên)");
        int test = 0;
        do {
        Scanner sc = new Scanner(System.in);
        String thongTinNhap = sc.nextLine();

            for (Staff staff : staff) {
                if (staff.getTenNhanVien().contains(thongTinNhap)) {
                    System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                            "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep"));
                    System.out.println(((Employee) staff).displayInformation());
                    test = 1;
                } else if (staff.getMaNhanVien().equalsIgnoreCase(thongTinNhap)) {
                    System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                            "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep"));
                    System.out.println(((Employee) staff).displayInformation());
                    test = 1 ;
                }
            }
            if(test != 1){
                System.out.println("Hay nhap lai");
            }

        }
        while (test != 1);
        }


    //Hiển thị bảng lương của nhân viên toàn công ty
    public  void showQuantity() {
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep" ,"Lương"));
        for (Staff staff : staff){
            if (staff instanceof Employee) {
                System.out.println(((Employee) staff).displayInformationSalary());
            } else {
                System.out.println(((Manager) staff).displayInformationSalary());
            }
        }

    }

    //Hiển thị lương của nhân viên theo thứ tự giảm dần
    public void salaryDisplayDecrease(){
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep" ,"Lương"));
        Collections.sort(staff, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.getLuong() == o2.getLuong())
                    return 0;
                else if (o1.getLuong() < o2.getLuong())
                    return 1;
                else
                    return -1;
            }
        });
        for (Staff staff : staff){
            if (staff instanceof Employee) {
                System.out.println(((Employee) staff).displayInformationSalary());
            } else {
                System.out.println(((Manager) staff).displayInformationSalary());
            }
        }
    }
    //Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
    public void salaryDisplayIncremental(){
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-20s", "Ma Nhan Vien", "Ten Nhan Vien", "He So Luong",
                "Ngay Vao Lam", "Bo Phan Lam Viec", "  So Ngay Nghi Phep" ,"Lương"));
        Collections.sort(staff, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.getLuong() == o2.getLuong())
                    return 0;
                else if (o1.getLuong() > o2.getLuong())
                    return 1;
                else
                    return -1;
            }
        });
        for (Staff staff : staff){
            if (staff instanceof Employee) {
                System.out.println(((Employee) staff).displayInformationSalary());
            } else {
                System.out.println(((Manager) staff).displayInformationSalary());
            }
        }

    }

    }

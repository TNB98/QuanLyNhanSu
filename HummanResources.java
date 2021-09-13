import java.util.Scanner;


public class HummanResources {

        public static void main(String[] args) {
                HRManagement hr = new HRManagement();
                hr.nhapDL();
                int choie ;
                do{
                        Scanner sc = new Scanner(System.in);
                        System.out.println("1.Hiển thị thông tin nhân viên ");
                        System.out.println("2. Hiển thị các bộ phận trong công ty");
                        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
                        System.out.println("4. Thêm nhân viên mới vào công ty: bao gồm 2 loại");
                        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên ");
                        System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty ");
                        System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần ");
                        System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần ");
                        System.out.println("9. Thoát chương trình");
                        System.out.println("Nhập số để chọn chức năng :");

                        choie = sc.nextInt();

                        if(choie == 1 ){
                                hr.showAllStaffs();
                        }
                        if(choie == 2 ){
                                hr.showAllDepartments();
                        }
                        if(choie == 3 ){
                                hr.showAllEmpoyeeDepartments();
                        }
                        if(choie == 4 ){
                                hr.addNewEmployee();
                        }
                        if(choie == 5 ){
                                hr.find();
                        }
                        if(choie == 6 ){
                                hr.showQuantity();
                        }
                        if(choie == 7){
                                hr.salaryDisplayDecrease();
                        }
                        if(choie == 8 ){
                                hr.salaryDisplayIncremental();
                        }
                }
                while (choie != 9);

        }
}



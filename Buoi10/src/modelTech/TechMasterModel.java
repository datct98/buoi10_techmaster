package modelTech;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterModel {
    ClassModel classModel = new ClassModel();
    StudentModel studentModel = new StudentModel();
    public void inputTechMaster(Scanner sc){
        /*System.out.println("Mời b nhập giáo viện: ");
        String teacher = sc.nextLine();
        System.out.println("Mời b nhập quản lý: ");
        String manager = sc.nextLine();*/
        Class aClass = classModel.inputClass(sc);
        TechMaster techMaster = new TechMaster("Dat", "Huong", aClass);
        System.out.println(techMaster.toString());

        System.out.println("Mời b nhập thông tin học viên muốn thêm: ");
        Student student= studentModel.inputSTudent(sc);
        Class classes = techMaster.getaClass();
        ArrayList<Student>students = classes.getStudents();
        students.add(student);
        System.out.println(techMaster.toString());
    }
}

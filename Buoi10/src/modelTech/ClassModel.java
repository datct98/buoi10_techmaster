package modelTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassModel {
    StudentModel studentModel = new StudentModel();
    public Class inputClass(Scanner sc){
        System.out.println("Mời b nhập môn học: ");
        String subject = sc.nextLine();
        Student student1 = studentModel.inputSTudent(sc);
        Student student2 = studentModel.inputSTudent(sc);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2));
        Class classs= new Class(subject,students);
        return classs;
    }
}

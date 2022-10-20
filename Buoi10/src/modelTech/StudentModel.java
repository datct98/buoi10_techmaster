package modelTech;

import java.util.Scanner;

public class StudentModel {
    public Student inputSTudent(Scanner sc){
        System.out.println("Mời b nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời b nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời b nhập học lực: ");
        String classify = sc.nextLine();
        Student student = new Student(name, age, classify);
        return student;
    }


}

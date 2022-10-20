package modelTech;

import java.util.ArrayList;

public class Class {
    private String subject;
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Class(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}

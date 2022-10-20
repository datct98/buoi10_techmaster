package modelTech;

public class Student {
    private int id;
    private String name;
    private int age;
    private String classify;

    public Student(String name, int age, String classify) {
        this.name = name;
        this.age = age;
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classify='" + classify + '\'' +
                '}';
    }
}

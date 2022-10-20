package modelTech;

public class TechMaster {
    private String teacher;
    private String manager;
    private Class aClass;

    public Class getaClass() {
        return aClass;
    }

    public TechMaster(String teacher, String manager, Class aClass) {
        this.teacher = teacher;
        this.manager = manager;
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "teacher='" + teacher + '\'' +
                ", manager='" + manager + '\'' +
                ", aClass=" + aClass +
                '}';
    }
}

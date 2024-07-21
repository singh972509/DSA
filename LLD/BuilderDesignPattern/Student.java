package LLD.BuilderDesignPattern;

public class Student {
    int rollNo;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(StudentBuilder studentBuilder) {
        this.age=studentBuilder.age;
        this.name=studentBuilder.name;
        this.rollNo=studentBuilder.rollNo;
    }
}

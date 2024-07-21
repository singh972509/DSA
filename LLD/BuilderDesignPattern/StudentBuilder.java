package LLD.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String name;
    int age;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;return this;
    }
    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}

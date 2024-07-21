package LLD.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder  extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String> subs=new ArrayList<>();
        subs.add("OS");
        subs.add("DSA");
        subs.add("DBMS");
        this.subjects=subs;
        return this;
    }
}

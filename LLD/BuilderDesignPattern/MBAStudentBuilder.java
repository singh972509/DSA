package LLD.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String> subs=new ArrayList<>();
        subs.add("Finance");
        subs.add("Marketing");
        subs.add("HR");
        this.subjects=subs;
        return this;
    }
}

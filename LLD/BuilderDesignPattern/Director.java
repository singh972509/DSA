package LLD.BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    private Student createEngineeringStudent(){

        return studentBuilder.setAge(22).setName("sj").setSubjects().build();
    }
    private Student createMBAStudent(){

        return studentBuilder.setAge(24).setName("sj").setSubjects().build();

    }
    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

}

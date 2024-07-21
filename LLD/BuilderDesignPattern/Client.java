package LLD.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director director1=new Director(new EngineeringStudentBuilder());
        Director director2=new Director(new MBAStudentBuilder());
        Student engineering=director1.createStudent();
        Student mba=director2.createStudent();
        System.out.println(engineering.toString());
        System.out.println(mba.toString());
    }

}

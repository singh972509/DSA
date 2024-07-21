package LLD.FactoryPattern;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShape("circle");
        shape.draw();
    }
}

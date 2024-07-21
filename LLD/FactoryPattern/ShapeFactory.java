package LLD.FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch(input){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}

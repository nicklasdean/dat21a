package factory;

public class ShapeFactory {

    public Shape createShape(String whatShape, String color){
        switch(whatShape) {
            case "triangle":
                return new Triangle(color);
            case "square":
                return new Square(color);
            default:
                return new Triangle(color);
        }
    }
}

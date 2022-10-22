package home3.h1;

public abstract class AbstractFactory {
    public static Shape createShape(String type) throws UnSupportedShapeException {
        Shape shape;
        if ("圆形".equals(type)) {
            shape = new Round();
        }
        else if ("方形".equals(type)) {
            shape = new Square();
        }
        else if ("三角形".equals(type)) {
            shape = new Triangle();
        }
        else {
            throw new UnSupportedShapeException();
        }
        return shape;
    }

}

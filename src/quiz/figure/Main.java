package quiz.figure;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4);
        Circle circle = new Circle(5);

        ShapeProcessor.printShapeDetails(triangle);
        ShapeProcessor.printShapeDetails(circle);
        System.out.println("총합: " + ShapeProcessor.shapeCount);
    }
}

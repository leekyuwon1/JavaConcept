package quiz.figure;

public class ShapeProcessor {

    public static int shapeCount;

    public static void printShapeDetails(Shape shape) {
        shapeCount++;
        System.out.println(shape.calculateArea());
    }
}

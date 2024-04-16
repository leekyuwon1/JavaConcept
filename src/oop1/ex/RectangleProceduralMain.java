package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area); //넓이 계산
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter); // 둘레 계산

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}

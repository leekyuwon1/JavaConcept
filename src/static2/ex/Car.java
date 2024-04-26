package static2.ex;

public class Car {

    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }

    public String getName() {
        return name;
    }

}

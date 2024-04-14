package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("data = " + data.value);
        data = null;
        data.value = 20;
        System.out.println("data = " + data.value);
    }
}

package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;

        if (true) {
            int x = 10;
            m = 20;
            System.out.println("if x = " + x);
            System.out.println("m = " + m);

        }
        System.out.println("m = " + m);

    }
}

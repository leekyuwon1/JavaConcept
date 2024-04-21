package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // DefaultClass 이므로 다른 패키지에서 접근 할 수 없다.
//        DefaultClass1 defaultClass1 = new DefaultClass1();
    }
}


package access.a;

public class PublicClass {
    // public class 는 하나만 존재 해야 된다.
    public static void main(String[] args) {
            PublicClass publicClass = new PublicClass();
            DefaultClass1 class1 = new DefaultClass1();
            DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}

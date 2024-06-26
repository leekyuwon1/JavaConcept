package access.a;

public class AccessData {

    public int publicField;
    private int privateField;
    int defaultField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        privateField = 200;
        defaultField = 300;
        publicMethod();
        privateMethod();
        defaultMethod();
    }
}

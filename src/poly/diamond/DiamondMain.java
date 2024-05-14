package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
//        InterfaceA interfaceA = new InterfaceA();

        InterfaceA a = new Child(); // 부모는 자식을 담을 수 있다.
        InterfaceB b = new Child();
        a.methodA();
        a.methodCommon();
        b.methodB();

    }
}

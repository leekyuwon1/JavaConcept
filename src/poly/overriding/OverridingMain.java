package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();

        // 부모 변수가 자식 인스턴스 참조( 다형적 참조 )
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드는 오버라이딩 O / 오버라이딩이 되어 있는 상태라면 하위 타입인 오버라이딩이 우선 순위를 가진다.
    }
}

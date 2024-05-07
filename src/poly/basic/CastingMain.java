package poly.basic;

public class CastingMain {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조( 다형적 참조 )
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 해결 ( 다운 캐스팅 )
        Child child = (Child) poly; // 001
        System.out.println(poly.toString());
        System.out.println(child.toString());
        child.childMethod();

        int a = 10;
        System.out.println(a);
        double b = (double) a / 2 ;
        System.out.println(b);

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod();
    }
}

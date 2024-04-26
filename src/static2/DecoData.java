package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error

        /**
         * static 은 클래스 레벨, 하지만 인스턴스 변수, 인스턴스 메서드는 객체가 생성되어서 메모리에 할당이 되어야 참조값으로 찾아갈 수 있다.
         * */
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 클래스 변수
        staticMethod(); // 클래스 메서드
    }
    private void instanceMethod() {
        System.out.println("instanceMethod " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue " + staticValue);
    }
}

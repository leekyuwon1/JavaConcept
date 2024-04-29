 package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        ConstructInit constructInit1 = new ConstructInit(20); // 여기서는 참조값이 두개가 됐다. 그러므로 가능 001
        ConstructInit constructInit2 = new ConstructInit(10); // 002

        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value);
        System.out.println("fieldInit2 = " + fieldInit2.value);
        System.out.println("fieldInit3 = " + fieldInit3.value);

        // 상수
        System.out.println("fieldInit4 = " + FieldInit.CONST_VALUE);
    }

}

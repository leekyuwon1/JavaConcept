package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10; // final 로 사용하여 바로 초기화 할 시, 메모리 낭비가 된다.

//    public FieldInit(int value) { // 이미 변수에 초기화가 됐었으므로 안됨
//        this.value = value;
//    }
}

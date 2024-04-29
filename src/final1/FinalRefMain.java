package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data();

        // 참조 대상의 값은 변경 가능 왜? 현재 data의 변수에만 final 을 붙여서 고정으로 만들었다. 하지만 Data.value는 변동가능하다.
        data.value = 10;
        System.out.println("data = " + data.value);

        data.value = 20;
        System.out.println("data = " + data.value);




    }
}
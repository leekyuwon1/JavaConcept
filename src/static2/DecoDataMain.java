package static2;


import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData deco = new DecoData();
        deco.instanceCall();
    }
}

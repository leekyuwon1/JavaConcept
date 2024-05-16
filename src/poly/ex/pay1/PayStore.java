package poly.ex.pay1;

public abstract class PayStore {

    public static Pay getPay(String option) {
        // 하나의 덩어리가 기능으로 되어있어서 메서드/클래스로 뽑았음
        // 변하는 부분
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}

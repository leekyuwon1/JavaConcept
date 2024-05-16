package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount) {
        boolean result;

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        //ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {

            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        // ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ
        /**
         * 여기의 문제점.
         * 1.Pay 클래스들을 직접적으로 의존하는게 문제 ( 해결: 다형성 )
         * 2. if문 안에서 2가지 일을 하고있다.
         *  - 결제 방법을 선택하는 코드
         *  - 결제를 하는 코드 ( 중복 )*/


        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}

package poly.ex.pay1;

public class DefaultPay implements Pay{

    // Null Object 패턴
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

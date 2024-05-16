package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption1 = sc.nextLine();

            if(payOption1.equals("exit")){
                return;
            }
            System.out.print("금액을 입력하세요: ");
            int amount1 = sc.nextInt();
            payService.processPay(payOption1, amount1);
        }

    }
}

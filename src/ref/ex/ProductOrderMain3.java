package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + " 번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int productPrice = sc.nextInt();

            System.out.print("수량: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, productPrice, productQuantity);
        }


        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
//        for (int i = 0; i < orders.length; i++) {
//            total += orders[i].price * orders[i].quantity;
//        }
        return total;
    }
}

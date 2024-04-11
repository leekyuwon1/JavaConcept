package ref;

public class ProductOrderMain {

    public static void main(String[] args) {
        int total = 0;
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder dubu = new ProductOrder();

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cock = new ProductOrder();
        cock.productName = "콜라";
        cock.price = 1500;
        cock.quantity = 2;

        orders[0] = dubu;
        orders[1] = kimchi;
        orders[2] = cock;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            for (int i = 0; i < order.quantity; i++) {
                total += order.price;
            }
        }
        System.out.println("총 결제 금액: " + total + " 원");

    }
}

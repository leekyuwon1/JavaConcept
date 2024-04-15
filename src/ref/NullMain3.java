package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data); // instance를 하지 않음.

        System.out.println("bigData.data.value = " + bigData.data.value); // NullPointException 발생

    }
}

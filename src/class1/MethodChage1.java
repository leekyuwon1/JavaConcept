package class1;

public class MethodChage1 {

    public static void main(String[] args) {
        String a = "안녕하세요";
        System.out.println("method before a = " + a);
        chagePrimitive(a);
        System.out.println("method after a = " + a);
    }

    static String chagePrimitive(String x) {
        x = "반갑습니다.";
        return x;
    }
}

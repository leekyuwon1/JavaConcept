package class1;

public class MethodChage1 {

    public static void main(String[] args) {
        Data data = new Data();
        data.a = 10;
        System.out.println("method before a = " + data.a);
        chagePrimitive(data);
        System.out.println("method after a = " + data.a);
    }

    static void chagePrimitive(Data a) {
        Data.a = 20;
    }
}
class Data{
    static int a;
}
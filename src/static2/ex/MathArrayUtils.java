package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성을 막을 수 있다.
        // 인스턴스 생성을 제약을 걸고, 사용하는 입장에서 static임을 인지하게 만든다.
    }

    public static int sum(int[] arrays) {
        int total = 0;
        for (int array : arrays) {
            total += array;
        }
        return total;
    }

    public static double average(int[] arrays) {
        double total = 0;
        for (int array : arrays) {
            total += array;
        }
        return total / arrays.length;
    }

    public static int min(int[] arrays) {
        int min = arrays[0];
        for (int array : arrays) {
            if( min < array) {
                return min;
            }
            min = array;
        }
        return min;
    }

    public static int max(int[] arrays) {
        int max = arrays[0];
        for (int array : arrays) {
            if( max > array) {
                return max;
            }
            max = array;
        }
        return max;
    }


}

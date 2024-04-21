package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        count = 0;
        this.max = max;
    }

    // 숫자 증가 메서드
    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    // 지금까지 증가한 값을 반환
    public int getCount() {
        return count;
    }
}

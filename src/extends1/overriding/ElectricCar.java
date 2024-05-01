package extends1.overriding;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override // 애너테이션이 존재하는 이유: 컴파일 오류를 나타낸다
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}

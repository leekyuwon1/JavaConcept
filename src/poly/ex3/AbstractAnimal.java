package poly.ex3;

public abstract class AbstractAnimal { // 직접 인스턴스 생성 불가

    public abstract void sound(); // 추상 메서드가 하나라도 존재하면 추상 클래스로 만들어야 된다.

    public void move() { // 추상클래스라고 하더라도 상속하여 사용할 메서드는 만들 수 있다.
        System.out.println("동물이 움직입니다.");
    }
}

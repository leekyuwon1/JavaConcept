package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();

        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        /** 상속
         *  전기차와 휘발유 차 2대의 차가 있는데 같은 메서드를 사용하고 있다. 이때, 2대의 차는 차(Car) 라는 추상적인 의미가 내포되어있다.
         *  이런 추상적인걸 상속으로 묵은 다음, 구체적인 휘발유차, 전기차에 각각 다른 메서드를 내포 시키면 중복 코드가 사라진다.
         */

    }
}

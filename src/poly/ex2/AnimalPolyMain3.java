package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    //동물이 추가되어도 변경되지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}

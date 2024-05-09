package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if(parent instanceof Child) { // instanceOf : 원하는 타입으로 변경이 가능한지 여부 파악
            // 이 상황같은경우 parent1 같은 경우 인스턴스(객체)가 Parent 받았다 Child 객체를 모름
            // parent2 같은 경우 인스턴스(객체)가 Child 받았다. Parent는 상속
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}

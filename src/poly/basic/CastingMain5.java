package poly.basic;

public class CastingMain5 {

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
        // Child 인스턴스인 경우 childMethod(); 실행
        if(parent instanceof Child child) { // 자바 16부터 Pattern Matching for instanceof 사용가능
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}

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
            // Child c = new  Parent 이렇게 생각을 하자
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}

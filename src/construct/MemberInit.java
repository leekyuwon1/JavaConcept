package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    void initMember(MemberInit member, String name, int age, int grade) {
        // this. : 내 인스턴스를 가르킨다. 만약 this를 사용하지 않게 되면 스코프 범위 상 매개변수의 우선순위가 제일 높게 되므로 매개변수만 사용하게 된다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

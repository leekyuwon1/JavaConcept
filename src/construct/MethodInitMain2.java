package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        // 중복된 코드를 제거를 위한 메서드를 넣었으나 이 메서드의 내용이 전부 MemberInit의 데이터 기능이 담겨 있다.
        // 즉 객체 지향을 하려면 데이터와 그 데이터의 기능을 하나로 묶어야 된다.
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

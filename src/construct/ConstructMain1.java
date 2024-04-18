package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 멤버 필드가 메모리에 할당한 뒤 인스턴스 생성 후 즉시 생성자를 불러온다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct();

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}

package quiz.library;


public class MemberService {

    private Member[] members;
    private int count;

    public void addMember(Library library) {
        if (library instanceof Member member) {
            Member[] newMembers = new Member[count + 1];
            for (int i = 0; i < count; i++) {
                newMembers[i] = members[i];
            }
            newMembers[count] = member;
            members = newMembers;
            count++;
        }
    }
    public void displayMembers() {
        System.out.println("등록된 회원 조회:");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            member.findByAll(member);
        }
    }
}

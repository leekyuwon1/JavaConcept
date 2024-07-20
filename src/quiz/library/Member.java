package quiz.library;

public class Member implements Library {

    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    @Override
    public void findByAll(Library library) {
        System.out.println("이름: " + name + ", ID: " + memberId);
    }

//    public void findByMember() {
//        System.out.println("Library Members:");
//        for (int i = 0; i < members.length; i++) {
//            System.out.println("이름: " + members[i].getName() + ", 아이디: " + members[i].getMemberId());
//        }
//    }
}

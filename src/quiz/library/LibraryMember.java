package quiz.library;

public class LibraryMember {

    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMemberInfo() {
        System.out.println("이름: " + name + ", ID: " + memberId);
    }
}

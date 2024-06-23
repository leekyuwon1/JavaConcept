package quiz.library;

public class LibraryMember extends Library implements Add{

    private String name;
    private int memberId;
    private LibraryMember members;
    private int count;
    private int memberCount = 1;

//    public LibraryMember(String name, int memberId) {
//        this.name = name;
//        this.memberId = memberId;
//    }

//    public void addMember(LibraryMember member) {
//        LibraryMember[] newMembers = new LibraryMember[count + 1];
//        for (int i = 0; i < count; i++) {
//            newMembers[i] = members[i];
//        }
//
//        newMembers[count] = member;
//        members = newMembers;
//        count++;
//    }

//    public void displayMemberInfo() {
//        System.out.println("Library Member:");
//        for (LibraryMember member : members) {
//            System.out.println("이름: " + member.name + ", ID: " + member.memberId);
//        }
//    }

    @Override
    public void addMore(String name, int memberId) {
        members = new LibraryMember();
        Library library = new Library();
        members.name = name;
        members.memberId = memberId;

        library.members[count++] = members;

//        for (int i = 0; i < count; i++) {
//            library.members[i] = members;
//        }
//        library.members[count] = members;
//        count++;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}

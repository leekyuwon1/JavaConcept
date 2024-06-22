package quiz.library;

public class LibraryMember {

    private String name;
    private int memberId;
    private LibraryMember[] members;
    private int count;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        members = new LibraryMember[count + 1];

    }


    public void addMember(LibraryMember member) {
        members[count++] = member;
    }

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

    public void displayMemberInfo() {
        System.out.println("Library Member:");
        for (LibraryMember member : members) {
            System.out.println("이름: " + member.name + ", ID: " + member.memberId);
        }
    }

}

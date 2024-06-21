package quiz.library;

public class Library {

    private Book[] books;
    private LibraryMember[] members;
    private int count1;
    private int count2;

    public void addBook(Book book) {
        Book[] newBooks = new Book[count1 + 1];
        for (int i = 0; i < count1; i++) {
            newBooks[i] = books[i];
        }
        newBooks[count1] = book;
        books = newBooks;
        count1++;
    }

    public void addMember(LibraryMember member) {
        LibraryMember[] newMembers = new LibraryMember[count2 + 1];
        for (int i = 0; i < count2; i++) { // count2 == 0 때는 실행을 안한다.
            newMembers[i] = members[i];
        }

        newMembers[count2] = member;
        members = newMembers;
        count2++;
    }

    public void searchBookByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (!books[i].getTitle().equalsIgnoreCase(title)) {
                return;
            }
            books[i].displayInfo();
        }
    }

    public void displayBooks() {
        System.out.println("Library Book:");
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }
    }

    public void displayMembers() {
        System.out.println("Library Member:");
        for (int i = 0; i < members.length; i++) {
            members[i].displayMemberInfo();
        }
    }
}

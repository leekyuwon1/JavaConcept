package quiz.library;

public class LibrarySystem {
    private static LibraryService libraryService = new LibraryService();
    private static MemberService memberService = new MemberService();

    public static void main(String[] args) {

        Library book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Library book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        Library alice = new Member("Alice", 1);
        Library bob = new Member("Bob", 2);

        addMore(book1, book2, alice, bob);


        libraryService.displayBooks();
        memberService.displayMembers();

//        library.searchBookByTitle("Effective Java");

//        alice.borrowBook(book1);
//        bob.borrowBook(book2);
//
//        alice.returnBook(book1);
//        bob.returnBook(book2);
    }


    private static void addMore(Library book1, Library book2, Library alice, Library bob) {
        libraryService.addBook(book1);
        libraryService.addBook(book2);

        memberService.addMember(alice);
        memberService.addMember(bob);
    }
}

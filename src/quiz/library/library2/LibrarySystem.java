package quiz.library.library2;


public class LibrarySystem {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        // book 객체를 만들어서 Service안에 메서드에 던진다
        libraryService.addBook(book1);
        libraryService.addBook(book2);

//
//        LibraryMember libraryMember = new LibraryMember();
//        libraryMember.addMore("Alice", 1);
//        libraryMember.addMore("Bob", 2);


//        Add alice = new LibraryMember("Alice", 1);
//        LibraryMember bob = new LibraryMember("Bob", 2);

//        alice.addMember(alice);
//        bob.addMember(bob);

        libraryService.displayBooks();
//        libraryService.displayMembers();
//        alice.displayMemberInfo();

//        library.searchBookByTitle("Effective Java");

//        alice.borrowBook(book1);
//        bob.borrowBook(book2);
//
//        alice.returnBook(book1);
//        bob.returnBook(book2);
    }
}

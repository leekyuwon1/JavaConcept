package quiz.library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        library.addBook(book1);
        library.addBook(book2);

        LibraryMember alice = new LibraryMember("Alice", 1);
        LibraryMember bob = new LibraryMember("Bob", 2);


        alice.addMember(alice);
        bob.addMember(bob);

        library.displayBooks();
        alice.displayMemberInfo();

        library.searchBookByTitle("Effective Java");

//        alice.borrowBook(book1);
//        bob.borrowBook(book2);
//
//        alice.returnBook(book1);
//        bob.returnBook(book2);
    }
}

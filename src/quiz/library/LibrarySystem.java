package quiz.library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        library.addBook(book1);
        library.addBook(book2);

        Borrower alice = new Borrower("Alice", 1);
        Borrower bob = new Borrower("Bob", 2);

        library.addMember(alice);
        library.addMember(bob);

        library.displayBooks();
//        library.displayMembers();
//
//        alice.borrowBook(book1);
//        bob.borrowBook(book2);
//
//        alice.returnBook(book1);
//        bob.returnBook(book2);
    }
}

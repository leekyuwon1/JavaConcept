package quiz.library;

public class Library {

    private Book[] books;
    private LibraryMember[] members;
    private int count1;
    private int count2;

    public void addBook(Book book) {
        books = new Book[count1 + 1];
        books[0] = book;
    }

    public void addMember(LibraryMember member) {
        members = new LibraryMember[count2 + 1];

    }

    public void searchBookByTitle(String title) {

    }

    public void displayBooks() {
        System.out.println("Library Book:");
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }
    }
}

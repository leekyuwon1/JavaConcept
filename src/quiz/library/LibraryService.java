package quiz.library;

public class LibraryService {

    private Book[] books;
    private int count;
    private boolean Exist;

    public void addBook(Library library) {
        if (library instanceof Book book) {
            Book[] newBooks = new Book[count + 1];
            for (int i = 0; i < count; i++) {
                newBooks[i] = books[i];
            }
            newBooks[count] = book;
            books = newBooks;
            count++;
        }
    }

    public void displayBooks() {
        System.out.println("책 목록:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            book.findByAll(book);
        }
    }

}

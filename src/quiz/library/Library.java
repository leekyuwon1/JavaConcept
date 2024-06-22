package quiz.library;

public class Library {

    private Book[] books;
    private int count1;

    public void addBook(Book book) {
        Book[] newBooks = new Book[count1 + 1];
        for (int i = 0; i < count1; i++) {
            newBooks[i] = books[i];
        }
        newBooks[count1] = book;
        books = newBooks;
        count1++;
    }

    public void searchBookByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (!books[i].getTitle().equalsIgnoreCase(title)) {
                return;
            }
            books[i].findByBook(title);
        }
    }

    public void displayBooks() {
        System.out.println("Library Book:");
        for (int i = 0; i < books.length; i++) {
            books[i].findAllBooks();
        }
    }


}

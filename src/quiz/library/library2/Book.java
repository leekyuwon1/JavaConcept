package quiz.library.library2;

public class Book extends Library{
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void findAllBooks() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public void findByBook(String title) {
        System.out.println("책 찾기: " + title);
        System.out.println("Title: " + this.title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

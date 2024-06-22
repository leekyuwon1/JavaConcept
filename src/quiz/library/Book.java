package quiz.library;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void findAllBooks() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public void findByBook(String title) {
        System.out.println("책 찾기: " + title);
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

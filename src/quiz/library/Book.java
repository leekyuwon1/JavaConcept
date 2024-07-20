package quiz.library;

public class Book implements Library {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void findByAll(Library library) {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

//    public void findByBook(String title) {
//        System.out.println("책 찾기: " + title);
//        System.out.println("Title: " + this.title + ", Author: " + author + ", ISBN: " + isbn);
//    }
}

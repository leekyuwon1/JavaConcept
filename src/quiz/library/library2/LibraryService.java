package quiz.library.library2;

public class LibraryService {

    private Book[] books;
    private int count;

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
        System.out.println("Library Book:");
        for (int i = 0; i < books.length; i++) {
            books[i].findAllBooks();
        }
    }

//    public void displayMembers() {
//        System.out.println("Library Members:");
//        for (int i = 0; i < members.length; i++) {
//            System.out.println("이름: " + members[i].getName() + ", 아이디: " + members[i].getMemberId());
//        }
//    }
}

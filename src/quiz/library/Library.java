package quiz.library;

public class Library{

    private Book[] books;
    private int count1;
    LibraryMember[] members = new LibraryMember[10];


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

    public void displayMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < members.length; i++) {
            System.out.println("이름: " + members[i].getName() + ", 아이디: " + members[i].getMemberId());
        }
    }

}

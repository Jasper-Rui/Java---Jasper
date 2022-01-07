package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-06
 * Time: 23:14
 * Description:
 */
public class BookList {

    private Book[] books = new Book[10];
    private int usedsize;

    public BookList () {
        books[0] = new Book("java", "Jasper", 99, "story");
        books[1] = new Book("java1", "Jasperr", 999, "storyy");
        books[2] = new Book("java2", "Jasperrr", 9999, "storyyy");
        this.usedsize = 3;
    }

    public int getUsedsize() {
        return usedsize;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }

    public Book getPos (int pos) {
        return this.books[pos];
    }

    public void setBook (int pos, Book book) {
        this.books[pos] = book;
    }


}

package Operation;

import Book.Book;
import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:35
 * Description:
 */
public class DisplayOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Display book");
        for(int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getPos(i); // it is not an array, we can't use booklist[i]
            System.out.println(book);
        }
    }
}

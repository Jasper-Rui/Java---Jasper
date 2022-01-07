package Operation;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:35
 * Description:
 */
public class DeleteOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Delete book");
    }
}

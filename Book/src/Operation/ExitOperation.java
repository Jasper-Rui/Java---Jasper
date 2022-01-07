package Operation;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:36
 * Description:
 */
public class ExitOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Exit system");
        System.exit(0);
    }
}

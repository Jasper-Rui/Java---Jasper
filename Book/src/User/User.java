package User;

import Book.BookList;
import Operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:49
 * Description:
 */
public abstract class User {
    public String userName;
    protected IOperation[] iOperations;

    public User(String userName) {
        this.userName = userName;
    }

    public abstract int menu();

    public void doWork (int choice, BookList bookList) {
        iOperations[choice].word(bookList);
    }

}

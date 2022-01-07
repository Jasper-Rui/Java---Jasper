package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:35
 * Description:
 */
public class FindOperation implements IOperation{

    public void word (BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search book");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("The book doesn't exist");
    }
}

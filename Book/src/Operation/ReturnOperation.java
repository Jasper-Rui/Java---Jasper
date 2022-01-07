package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:36
 * Description:
 */
public class ReturnOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Return book");
        System.out.println("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())) {
                book.setBorrowed(false);
                System.out.println("Return successfully");
                System.out.println(book);
                return;
            }
        }
        System.out.println("The book doesn't exist");
    }
}

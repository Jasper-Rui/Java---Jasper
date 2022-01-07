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
public class AddOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Add new book");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter the type: ");
        String type = scanner.nextLine();
        System.out.println("Please enter the price: ");
        int price = scanner.nextInt();


        Book book = new Book(name, author, price, type);
        bookList.setBook(bookList.getUsedsize(), book);
        bookList.setUsedsize(bookList.getUsedsize() + 1);
        System.out.println("Successfully added!");
    }

}

package Operation;
import Book.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:35
 * Description:
 */
public class RemoveOperation implements IOperation{

    public void word (BookList bookList) {
        System.out.println("Remove book");
        System.out.println("Please enter the name of book:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index = 0;
        for(int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                index = i;
                //bookList.setBook(i, null);
                //return;
                break;
            }
        }

        if(index >= bookList.getUsedsize()) {
            System.out.println("The book doesn't exist");
            return;
        }

        for (int i = index; i < bookList.getUsedsize() - 1; i++) {
            System.out.println(bookList.getUsedsize() - 1);
            Book book = bookList.getPos(i + 1);
            bookList.setBook(i, book);
        }
        bookList.setBook(bookList.getUsedsize(), null);
        bookList.setUsedsize(bookList.getUsedsize() - 1);
        System.out.println("Deleted successfully");
    }
}

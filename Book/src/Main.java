import Book.BookList;
import User.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 12:13
 * Description:
 */
public class Main {

    public static User login () {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter your identity, 1 Admin, 0 Normal User");
        int choice = scanner.nextInt();

        if(choice == 1) {
            return new AdminUser(name);
        }
        else {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login(); // upcasting
        //which type of user will be depended on the return type
        while (true) {
            int choice = user.menu(); // dynamic casting
            //base on choice, decide which step to move forward
            user.doWork(choice, bookList);
        }

    }
}

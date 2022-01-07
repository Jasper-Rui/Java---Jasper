package User;

import Operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:49
 * Description:
 */
public class AdminUser extends User{

    public AdminUser (String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new RemoveOperation(),
                new DisplayOperation()
        };
    }

    public int menu () {
        System.out.println("============= Admin menu =============");
        System.out.println("Hello " + this.userName + " Welcome");
        System.out.println("1. Search Book");
        System.out.println("2. Create new Book");
        System.out.println("3. Delete Book");
        System.out.println("4. Display Book");
        System.out.println("0. Exit system");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}

package User;

import Operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-07
 * Time: 11:50
 * Description:
 */
public class NormalUser extends User{

    public NormalUser (String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new DisplayOperation()
        };
    }

    public int menu () {
        System.out.println("============= User menu =============");
        System.out.println("Hello " + this.userName + " Welcome");
        System.out.println("1. Search Book");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.println("4. Display Book");
        System.out.println("0. Exit system");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}

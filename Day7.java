import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-27
 * Time: 19:39
 * Description:
 */
public class Day7 {

    public static boolean chkParenthesis(String A, int n) {
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == '(' || A.charAt(i) == ')') {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }




    public static int change_to_fibonacci(int input) {

        int f0 = 0;
        int f1 = 1;
        int f2;
        while (input > f0 + f1) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        return Math.min(input - f1, f0 + f1 - input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(change_to_fibonacci(input));
    }
}

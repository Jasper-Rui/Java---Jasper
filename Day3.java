import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-22
 * Time: 20:41
 * Description:
 */

class Person {
    private String name = "a";
    int age = 0;
}
class student extends Person {
    public String grade;
}


public class Day3 {

    public static void longest_subString (String input) {
        int[] index = new int[2];
        int length = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 48 && input.charAt(i)<= 57) {
                int start = i, end = i;
                while (end < input.length() && input.charAt(end) >= 48 && input.charAt(end)<= 57) {
                    end++;
                }

                if(end - start > length) {
                    length = end - start;
                    index[0] = start;
                    index[1] = end;
                }
                i = end;
            }
        }
        System.out.println(input.substring(index[0], index[1]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        longest_subString(input);
    }


}

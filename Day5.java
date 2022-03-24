import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-24
 * Time: 15:08
 * Description:
 */
public class Day5 {

    public static long question2 (int [] input) {
        long max_sum = input[0];
        long current_sum = max_sum;

        for(int i = 0; i < input.length; i++) {

            current_sum = Math.max(input[i] + current_sum, input[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int [] input = new int[size];
        int i = 0;
        while (scanner.hasNextInt()) {
            input[i++] = scanner.nextInt();
        }

        System.out.println(question2(input));

    }


    public static int question1 (String input1, String input2) {

        int count = 0;
        for(int i = 0; i < input1.length(); i++) {
            if(helper(input1.substring(0, i) + input2 + input1.substring(i))){
                count++;
            }
        }

        return count;
    }

    public static boolean helper (String input1) {
        int start = 0;
        int end = input1.length() - 1;

        while (start < end) {
            if(input1.charAt(start) != input1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(question1(input1, input2));
    }
}

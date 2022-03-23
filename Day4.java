import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-23
 * Time: 13:16
 * Description:
 */
public class Day4 {

    public static String convert (int input, int bit) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean is_negative = false;
        if(input < 0) {
            is_negative = true;
            input = -input;
        }

        while (input != 0) {
            int reminder = input % bit;
            char c;
            if(reminder <= 9) {
                c = (char) (reminder + '0');
            }
            else{
                c = (char) (reminder - 10 + 'A');
            }

            stringBuilder.append(c);
            input /= bit;
        }

        if(is_negative) {
            stringBuilder.append('-');
            return stringBuilder.reverse().toString();
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int bit = scanner.nextInt();
        if(input == 0) System.out.println('0');
        else System.out.println(convert(input, bit));
    }

    public static String questions1(int a, int b, int c, int d) {
        int A = 0;
        int B = 0;
        int C = 0;

        if((a + c) % 2 == 0){
            A = (a + c) / 2;
        }
        else{
            return "No";
        }

        if((b + d) % 2 == 0) {
            B = (b + d) / 2;
        }
        else{
            return "No";
        }

        C = d - B;

        if(c >= 0) {
            return A + " " + B + " " + C;
        }
        else{
            return "No";
        }
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(c < 0 || d < 0) System.out.println("No");
        else System.out.println(questions1(a, b, c, d));
    }
}

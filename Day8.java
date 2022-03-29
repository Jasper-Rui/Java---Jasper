import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-28
 * Time: 16:01
 * Description:
 */
public class Day8 {



    public static void question1 (int size, String[] input) {
        if(question1_helper1(input) && question1_helper2(input)){
            System.out.println("both");
        }
        else if(question1_helper1(input) && !question1_helper2(input)) {
            System.out.println("lengths");
        }
        else if(!question1_helper1(input) && question1_helper2(input)) {
            System.out.println("lexicographically");
        }
        else{
            System.out.println("none");
        }
    }

    public static boolean question1_helper1(String[] strings) {
        for(int i = 0; i < strings.length - 1; i++) {
            if(strings[i].length() > strings[i + 1].length()) {
                return false;
            }
        }
        return true;
    }

    public static boolean question1_helper2(String[] strings) {
        for(int i = 0; i < strings.length - 1; i++) {
            if(strings[i].compareTo(strings[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] input = new String[size];
        int index = 0;
        while (scanner.hasNextLine()) {
            String temp = scanner.nextLine();
            System.out.println(temp);
            input[index++] = temp;
        }
        question1(size, input);
    }


    public static long question2_version1 (int input1, int input2) {
        int temp1 = input1;
        int temp2 = input2;
        long result = 1;
        for(int i = 2; i <= Math.min(input1, input2); i++) {
            while(temp1 % i == 0 && temp2 % i == 0) {
                temp1 /= i;
                temp2 /= i;
                result *= i;
            }
        }
        return temp1 * temp2 * result;
        //return result;
    }

    public static int question2_version2 (int input1, int input2) {
        for(int i = 2; i <= input1 * input2; i++) {
            if(input1 % i == 0 && input2 % i == 0) {
                return i;
            }
        }

        return input1 * input2;
    }



    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        System.out.println(question2_version1(input1, input2));
    }
}

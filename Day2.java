import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-21
 * Time: 19:56
 * Description:
 */
public class Day2 {

    public static int question1(int size,int[] input) {
        if(input.length == 1) return 1;

        int count = 0;

        int index = 0;
        while (index < input.length - 1) {
            if(input[index] == input[index + 1]) {
                ;
            }
            else if(input[index] < input[index + 1]) {
                while (input[index] < input[index + 1]) {
                    index++;
                }
                count++;
                index++;
            }
            else{
                while (input[index] > input[index + 1]) {
                    index++;
                }
                count++;
                index++;
            }
        }

        return count;
    }


    public static void question2(String[] input) {
        for(int i = input.length - 1; i >= 0 ; i--) {
            System.out.print(input[i]);
            if(i > 0) System.out.print(" ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        question2(input);
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];
        int index = 0;
        while (scanner.hasNextInt()) {
            array[index++] = scanner.nextInt();
        }

        System.out.println(question1(size, array));
    }

}

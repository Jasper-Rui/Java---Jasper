import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-04-02
 * Time: 12:19
 * Description:
 */
public class Day12 {
    public int res = 5;
    //res = res + 5;

    public void add (int x, int y, int z) {


    }

    public void add (int x, int y) {}

    public int add (int x, int y, float z) { return 0;}

    /*public int add (int x, int y, int z) {
        return 0;
    }*/

    /*public static void getCustomerID() {
        try {
            int[] array = new int[10];
            System.out.println(array[11]);
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        catch (java.io.IOException e) {
            System.out.println("IOException");
        }
        catch (java.lang.Exception e) {
            System.out.println("Exception");
        }

    }*/


    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        int count = 0;
        while (j <= i && m > 0) {
            System.out.println(m);
            if((m >> count & 1) == 1) {
                n += Math.pow(2, j);
            }
            count++;
            j++;
        }

        return n;
    }


    public static void min_two_prime(int input) {

        int start = input / 2, end = input / 2;

        while (start >= 1 && end < input) {
            if(is_prime(start) && is_prime(end)) {
                System.out.println(start);
                System.out.println(end);
                break;
            }
            start--;
            end++;
        }
    }

    public static boolean is_prime (int input) {

        int temp = (int) Math.sqrt(input);

        for(int i = 2; i <= temp; i++) {
            if(input % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        //getCustomerID();

        //System.out.println(binInsert(1024, 19, 2, 6));
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        min_two_prime(input);
    }





}

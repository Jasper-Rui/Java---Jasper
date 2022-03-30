/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-29
 * Time: 19:13
 * Description:
 */
public class Day9 {

    public static int addAB(int A, int B) {
        // write code here
        //return Math.addExact(A, B)

        while(B != 0) {
            int temp = A ^ B;
            B = (A & B) << 1;
            A = temp;
        }
        return A;
    }

    public static int question2(int n, int m) {

        return 0;
    }



    public static void main(String[] args) {

    }
}

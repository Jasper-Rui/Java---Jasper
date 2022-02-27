/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-26
 * Time: 8:55 p.m.
 * Description:
 */
public class Reflection {

    public static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }




    public static void main(String[] args) {


    }
}

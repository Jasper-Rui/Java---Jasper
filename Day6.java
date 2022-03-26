/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Haorui Yang
 * Date: 2022-03-25
 * Time: 16:48
 * Description:
 */
public class Day6 {

    public static int StrToInt(String str) {
        boolean is_negative = false;
        long result = 0;

        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == '-') {
                is_negative = true;
            }
            else if(str.charAt(i) == '+') {
                continue;
            }
            else if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                result += (str.charAt(i) - '0') * (Math.pow(10, str.length() - i - 1));
            }
            else{
                return 0;
            }
        }

        if(result > Integer.MAX_VALUE) {
            return 0;
        }

        if(is_negative) {
            return ( -1 * (int)result);
        }

        return (int)result;
    }



    public static void main(String[] args) {
        //int other = (int) true;

        long test = 012;
        double b = 0x12345678;
        float f = -128;
        //byte a = 128;


    }
}

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-21
 * Time: 12:41 p.m.
 * Description:
 */

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void func (String expect, String actual) {
        expect = expect.toUpperCase();
        actual = actual.toUpperCase();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < actual.length(); i++) {
            set.add(actual.charAt(i));
        }

        Set<Character> res = new HashSet<>();
        for(int i = 0; i < expect.length(); i++) {
            if(!set.contains(expect.charAt(i)) && !res.contains(expect.charAt(i))) {
                res.add(expect.charAt(i));
                sb.append(expect.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        String expect = scanner.nextLine();
        String actual = scanner.nextLine();
        func(expect, actual);
    }
}
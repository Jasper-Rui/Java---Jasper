import java.util.*;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-20
 * Time: 2:38 p.m.
 * Description:
 */

public class MyMap {



    public static Map<Integer, Integer> func1(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        char c = 'a';

        for(int temp : array) {
            if(!map.containsKey(temp)) {
                map.put(temp,1);
            }
            else {
                map.put(temp, map.get(temp) + 1);
            }
        }

        return map;
    }

    public static Set<Integer> func2(int[] array) {
        Set<Integer> map = new HashSet<>();

        for(int x: array) {
            map.add(x);
        }

        return map;
    }

    public static int func3(int[] array) {
        Set<Integer> map = new HashSet<>();
        for(int arr: array) {
            if(map.contains(arr)) return arr;
            map.add(arr);
        }
        return -1;
    }




   public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    }

    public static void main7(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jasper", 3);
        map.put("Jasper1", 2);
        map.put("Jasper2", 1);
        map.put("Jasper3", 0);

        Set<String> set = map.keySet();
        System.out.println(set);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static void main1(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jasper", 3);
        map.put("Jasper1", 2);
        map.put("Jasper2", 1);
        map.put("Jasper3", 0);
        System.out.println(map);

        int ret = map.get("Jasper");
        System.out.println(ret);
        System.out.println(map.getOrDefault("Jasperrr", 0));

        Integer rem = map.remove("Jasper");
        System.out.println(rem);
    }
}

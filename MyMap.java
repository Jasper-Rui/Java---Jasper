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

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(b));

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        priorityQueue.add(a);
        priorityQueue.add(b);
        priorityQueue.add(c);
        System.out.println(priorityQueue.peek());
    }

    public List<String> topKFrequent(String[] words, int k) {

        //1.
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
                continue;
            }

            map.put(word, 1);
        }

        //2.
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue() - o2.getValue();
            }
        });


        //3.
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(minHeap.size() < k) {
                minHeap.offer(entry);
            }
            else{
                if(minHeap.peek().getValue().compareTo(entry.getValue()) == 0) {
                    if(minHeap.peek().getKey().compareTo(entry.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }
                else {
                    if(minHeap.peek().getValue().compareTo(entry.getValue()) < 0){
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }
            }
        }

        List<String> ret = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            Map.Entry<String, Integer> top = minHeap.poll();
            ret.add(top.getKey());
        }
        Collections.reverse(ret);
        return ret;
    }



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


    public static void main11(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println(priorityQueue.peek());

    }

   public static void main9(String[] args) {
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

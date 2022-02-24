import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-23
 * Time: 2:02 p.m.
 * Description:
 */

class Test {
    public void test() {
        System.out.println("Print something here");
    }
}


public class MyOutClass2 {
    public int data1 = 9999;
    private int data2 = 2;
    public static int data3 = 3;

    static class InnerClass2 {
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public InnerClass2 () {
            System.out.println("Constructor without parameter");
        }

        public void func(){
            System.out.println(new MyOutClass2().data1);
            System.out.println(new MyOutClass2().data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println("Outclass func");
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println(priorityQueue.peek());

        new Test() {
            @Override
            public void test() {
                System.out.println("print nothing");
            }
        }.test();
    }

    public static void main1(String[] args) {
        MyOutClass2.InnerClass2 innerClass2 = new MyOutClass2.InnerClass2();
        innerClass2.func();
    }
}

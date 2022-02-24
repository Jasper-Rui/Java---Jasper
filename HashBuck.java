import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-23
 * Time: 10:13 p.m.
 * Description:
 */
public class HashBuck {

    public static final double DEFAULT_LOAD_FACTOR = 0.75;

    static class Node {
        public int key;
        public int val;
        public Node next;

        public Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }


    public Node[] array;
    public int usedSize;

    public HashBuck () {
        this.array = new Node[10];
    }

    public void put (int key, int val) {
        int index = key % this.array.length;
        Node cur = this.array[index];

        while (cur != null) {
            if(cur.key == key) {
                cur.key = key;
                //update if we find a same key
            }
            cur = cur.next;
        }

        //if key does not exist
        Node node = new Node(key, val);
        node.next = this.array[index];
        this.array[index] = node;
        this.usedSize++;

        //check load factor

        if(loadFactor() >= DEFAULT_LOAD_FACTOR) {
            //resize array
            resize();
        }
    }

    private void resize() {
        Node[] new_Array = new Node[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            Node cur = this.array[i];
            while (cur != null) {
                int index = cur.key % new_Array.length;
                Node curNext = cur.next;
                cur.next = new_Array[index];
                new_Array[index] = cur;
                cur = curNext;
            }
        }
        this.array = new_Array;
    }

    private double loadFactor () {
        return 1.0 * this.usedSize / array.length;
    }

    public int get (int key) {
        int index = key % this.array.length;
        Node cur = this.array[index];

        while (cur != null) {
            if(cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }

        return -1;
    }


    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        hashBuck.put(1, 1);
        hashBuck.put(2, 2);
        hashBuck.put(3, 3);
        hashBuck.put(4, 4);
        hashBuck.put(5, 5);
        hashBuck.put(6, 6);
        hashBuck.put(7, 7);
        hashBuck.put(8, 8);
        hashBuck.put(9, 9);
        hashBuck.put(10, 10);
        hashBuck.put(11, 11);
        System.out.println(hashBuck.get(11));



    }
}

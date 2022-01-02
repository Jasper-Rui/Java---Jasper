/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2021-12-30
 * Time: 22:38
 * Description:
 */
class Node {
    public int val;
    public Node next;
    public Node prev;

    public Node (int val) {
        this.val = val;
    }
}
public class MyDoubleLinkedList {
    public Node head;
    public Node last;
    //add first
    public void addFirst(int data){
        Node node = new Node(data);
        if(size() == 0) {
            this.head = node;
            this.last = node;
        }
        else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //add last
    public void addLast(int data){
        Node node = new Node(data);
        if(size() == 0) {
            this.head = node;
            this.last = node;
        }
        else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //insert at index
    public boolean addIndex(int index,int data){
        if(size() == 0) return false;
        return true;
    }

    //check key
    public boolean contains(int key){
        Node node = this.head;

        while (node != null) {
            if(node.val == key) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //delete key
    public void remove(int key){}

    //remove all keys
    public void removeAllKey(int key){}

    //get size
    public int size(){
        int count = 0;
        Node node = this.head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public void display(){
        Node node = this.head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public void clear(){

    }

}

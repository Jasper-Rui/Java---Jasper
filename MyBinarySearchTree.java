/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-22
 * Time: 9:16 a.m.
 * Description:
 */

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node (int val) {
        this.val = val;
    }
}


public class MyBinarySearchTree {
    public Node root;

    public Node search (int key) {
        Node target = root;
        while (target != null) {
            if(key < target.val) {
                target = target.left;
            }
            else if(key > target.val){
                target = target.right;
            }
            else {
                return target;
            }
        }
        return null;
    }

    public boolean insert (int val) {
        if(this.root == null) {
            this.root = new Node(val);
            return true;
        }

        Node temp = this.root;
        Node parent = temp;

        while (temp != null) {
            parent = temp;
            if(val > temp.val) {
                temp = temp.right;
            }
            else if(val < temp.val) {
                temp = temp.left;
            }
            else {
                return false;
            }
        }

        if(val > parent.val) {
            parent.right = new Node(val);
        }
        else {
            parent.left = new Node(val);
        }
        return true;
    }


    public void remove (int val) {
        Node cur = this.root;
        Node parent = null;
        while (cur != null) {
            if(cur.val == val) {
                removeNode(cur, parent);
                break;
            }
            else if(val > cur.val) {
                parent = cur;
                cur = cur.right;
            }
            else{
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(Node cur, Node parent) {
        if(cur.left == null) {
            if(cur == this.root) {
                this.root = cur.right;
            }
            else if(cur == parent.left) {
                parent.left = cur.right;
            }
            else {
                //cur == parent.right
                parent.right = cur.right;
            }
        }
        else if(cur.right == null) {
            if(cur == this.root) {
                this.root = cur.left;
            }
            else if(cur == parent.left) {
                parent.left = cur.left;
            }
            else {
                parent.right = cur.left;
            }
        }
        else {
            //find the largest of cur.left or smallest of cur.right

            //smallest
            Node temp = cur.right;
            Node par = null;
            while(temp != null) {
                par = temp;
                temp = temp.left;
            }

            cur.val = temp.val;

            if(temp == par.left) {
                par.left = temp.right;
            }
            else {
                par.right = temp.right;
            }
        }
    }

    public void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }


    public static void main(String[] args) {

        int[] array = {10,8,19,3,9,4,7};
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }
        binarySearchTree.inOrder(binarySearchTree.root);

        System.out.println(binarySearchTree.insert(3));
        binarySearchTree.remove(7);
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.root);
    }
}

import java.util.*;
public class verticalTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static void vertical(Node root,TreeMap<Integer,Integer> m)
    {
        
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
       // root.left.right=new Node(40);
       // root.left.left.right=new Node(18);
       // root.left.left.left=new Node(7);
        root.right.right=new Node(40);
        root.right.left=new Node(16);
        TreeMap<Integer,Integer> h=new TreeMap<Integer,Integer>();
    }

}
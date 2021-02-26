import java.util.*;
public class checkAVLtreeORNot {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    public static void main(String[] args) {
     Node root =new Node(1);
     root.left=new Node(2);
     root.left.left=new Node(3);
     root.right=new Node(4);
     
    }
}
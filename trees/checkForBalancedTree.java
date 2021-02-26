import java.util.*;
public class checkForBalancedTree {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static boolean balanced(Node root)
      {
          if(root==null)
          return true;
          int l=height(root.left);
          int r=height(root.right);
          return (Math.abs(l-r)<=1&&balanced(root.left)&&balanced(root.right));

      }
      static int height(Node root)
      {
          if(root==null)
          return 0;
          return 1+Math.max(height(root.left),height(root.right));
      }
          public static void main(String[] args) {
        Node root=new Node(3);                            //          10
        root.left=new Node(4);                            //     8         2
        root.left.left=new Node(5);                       //  4    4     1    1
        root.left.right=new Node(6);                      
        root.right=new Node(8);                           //inorder-> 3,2,4,1,6,5,7
        //root.right.left=new Node(1);
        root.right.right=new Node(7);
        root.right.right.right=new Node(6);
        if(balanced(root))
        System.out.println("True");
        else
        System.out.print("False");
    }
}
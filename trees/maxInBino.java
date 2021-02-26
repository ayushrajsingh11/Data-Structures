import java.util.*;
public class maxInBino {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static int max(Node root)
      {
         if(root==null)
         return 0;
         else
         return Math.max(root.data,Math.max(max(root.left),max(root.right)));

      }
    public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2         5
        root.left.left=new Node(90);                       //  3    4     6    7
        root.left.right=new Node(4);                      
        root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(80);
        System.out.println(max(root));
    }
}
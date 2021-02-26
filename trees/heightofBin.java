import java.util.*;
public class heightofBin {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static int height(Node root)
      {
          if(root==null)
          return 0;
          else
          return 1+Math.max(height(root.left),height(root.right));
      }
   public static void main(String[] args) {
    Node root=new Node(1);                            //          1
    root.left=new Node(8);                            //     2         5
    root.left.left=new Node(30);                       //  3    4     6    7
    root.left.right=new Node(4);                      
    root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
    root.right.left=new Node(6);
    root.right.right=new Node(80);
    root.right.right.right=new Node(8);
    System.out.println(height(root));

   }
}
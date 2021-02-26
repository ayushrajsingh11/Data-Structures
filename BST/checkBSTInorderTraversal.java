import java.util.*;
public class checkBSTInorderTraversal {
   // static ArrayList<Integer> a=new ArrayList<>();

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static int prev=Integer.MIN_VALUE;
    static boolean bst(Node root)
    {
          if(root==null)
             return true;
             if(bst(root.left)==false)
             return false;
             if(root.data<=prev)
              return false;
             prev=root.data;
             return bst(root.right);

    }
   
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(30);
       // root.left.right=new Node(40);
       // root.left.left.right=new Node(18);
       // root.left.left.left=new Node(7);
        root.right.right=new Node(35);
        root.right.left=new Node(22);
        if(bst(root))
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
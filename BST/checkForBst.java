import java.util.*;
public class checkForBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static boolean bst(Node root)
    {
         if(root==null)
         return true;
         
       int m=max(root.left);
       int mi=min(root.right);
       System.out.print(m+" "+mi);
       if(root.data>m&&root.data<mi)
       return true;
       return false;
    }
    static int max(Node root)
    {
        if(root!=null)
        {
            return Math.max(max(root.left),max(root.right));
        }
        else
        return -1;
    }                                           //THIS IS On2
    static int min( Node root)
    {
        if(root!=null)
        {
          
       
            int j=min(root.left);
            int k=min(root.right);
            return Math.min(j,k);
        }
        else return -1;
        
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
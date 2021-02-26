import java.util.*;
public class kthSmallest {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static int c=0;
    static void kth(Node root,int k)
    {
       
       if(root!=null)
        {
            
            kth(root.left,k);
            c++;
            if(c==k)
            System.out.print(root.data);
            kth(root.right,k);
        }
        
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
       // root.left.right=new Node(40);
       // root.left.left.right=new Node(18);
       // root.left.left.left=new Node(7);
        root.right.right=new Node(30);
        root.right.left=new Node(12);
        kth(root,2);
    }
}
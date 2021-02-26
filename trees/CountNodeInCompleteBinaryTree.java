import java.util.*;
import java.io.*;
public class CountNodeInCompleteBinaryTree {
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
     static int c=0;
      static  int Nodes(Node root)
      {
          int lh=0;
          int rh=0;
         if(root==null)
         return 0;
         
       // int lh=height(root.left);
       // int rh=height(root.right);
        // int res=0;
        Node cur=root;
        while(cur!=null)
        {
        lh++;
        cur=cur.left;
        }
         cur=root;
        while(cur!=null)
        {
        rh++;
        cur=cur.right;
        }
         if(lh==rh)
         return (int)Math.pow(2,lh)-1;//condition for complete binary tree
         return 1+Math.max(Nodes(root.left),Nodes(root.right));
         
      }
      static int height(Node root)
      {
          if(root==null)
          return 0;
          return 1+Math.max(height(root.left),height(root.right));
      }
    public static void main(String[] args) {
 // Root node of the tree 
 Node root = new Node(20); 
  
 root.left = new Node(8); 
 root.right = new Node(22); 

 root.left.left = new Node(4); 
 root.left.right = new Node(12); 

 root.right.left = new Node(10); 
 root.right.right = new Node(25);
         System.out.println(Nodes(root));
        

    }
}
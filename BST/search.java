import java.util.*;

public class search{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }

   static boolean searc(Node root,int key)
   {
     if(root==null)
     return false;
     else if(key==root.data)
     return true;
     else if(key<root.data)
     return searc(root.left,key);
     else 
     return searc(root.right,key);
   }
   static Node insert(Node root,int k)
   {
       if(root==null)
       return new Node(k);
           
           if(k>root.data)
           root.left=insert(root.left,k);
           else
           root.right=insert(root.right,k);
       
       return root;
   }
   static void print(Node root)
   {
       if(root==null)
       return;
       System.out.println(root.data);
       print(root.left);
       print(root.right);
   }
   static Node delete(Node root,int k)
   {
       if(root==null)
       return null;
       if(root.data<k)
       root.right=delete(root.right,k);
       else if(root.data>k)
       root.left= delete(root.left,k);
       else
       {
           if(root.left==null)
           return root.right;
           else if(root.right==null)
           return root.left;
           else
           {
               Node temp=getSucc(root.right);
                root.data=temp.data;
                root.right=delete(root.right,temp.data);//main step
           }
       }
return root;
   }
   static Node getSucc(Node root)
   {
      Node cur=root;
      while(cur!=null&&cur.left!=null)
      {
           cur=cur.left;
      }
      return cur;

   }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.right=new Node(40);
       // root.left.left.right=new Node(18);
       // root.left.left.left=new Node(7);
        root.right.right=new Node(80);
        root.right.left=new Node(60);
        //root.right.right.right=new Node(50);
       // root.right.right.right.right=new Node(80);
       // System.out.println(searc(root,40));
      // Node r=insert(root,20);
      Node r=delete(root,50);
       print(r);
      // System.out.println();
    }
}
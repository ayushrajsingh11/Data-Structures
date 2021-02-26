import java.util.*;
public class floor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static Node floor(Node root,int k)
    {int l=0;
        Node cur=null;
        while(root!=null)
        {   
            if(root.data==k)
            return root;
           else if(root.data>k)
            {
                root=root.left;
            }
            else 
            {
            cur=root;
            root=root.right;
            }
            
        }
return cur;
    }
    static Node ceil(Node root,int k)
    {
        Node cur=null;
        while(root!=null)
        {
            if(root.data==k)
            return root;
            else if(root.data<k)//15<14?
            {
            root=root.right;
           
            }
            else
            {cur=root;
                
                 root=root.left;
                
            }
        }
     return cur;
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
        System.out.println(ceil(root,14).data);
        System.out.println(floor(root,14).data);
    }
}
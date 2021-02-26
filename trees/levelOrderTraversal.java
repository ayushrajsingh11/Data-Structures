import java.util.*;
public class levelOrderTraversal {
    static class Node{
      int data;
      Node left;Node right;
      Node(int d)
      {
      data=d;
      }
    }
    static void left(Node root)
    {if(root==null)
        return;
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      int c=0;
      while(q.isEmpty()==false)
      {
        Node  cur=q.poll();
        //c++;
         System.out.print(cur.data);
        // System.out.println();
         if(cur.left!=null)
         q.add(cur.left);
         if(cur.right!=null)
         q.add(cur.right);
         
    }
    System.out.println();
    }
    public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2         5
        root.left.left=new Node(3);                       //  3    4     6    7
        root.left.right=new Node(4);                      
        root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        left(root);
    }
}
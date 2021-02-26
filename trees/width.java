import java.util.*;
public class width {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
    static void widt(Node root)
    {
        if(root==null)
         return;
         Queue<Node> q=new LinkedList<>();
         q.add(root);
         int r=0;
         while(q.isEmpty()==false)
         {
             int c=q.size();
             r=Math.max(r, c);
             for(int i=0;i<c;i++)
             {
                 Node cur=q.poll();
                 if(cur.left!=null)
                 q.add(cur.left);
                 if(cur.right!=null)
                 q.add(cur.right);

             }
         }
         System.out.println(r);

    }
        public static void main(String[] args) {
            Node root=new Node(10);                            //          10
            root.left=new Node(20);                            //     8         2
            root.left.left=new Node(40); 
            root.left.left.left=new Node(40);                 //  4         1    1
            //root.left.right=new Node(6);                   // 5 
            root.right=new Node(30);                           //inorder-> 3,2,4,1,6,5,7
            root.right.left=new Node(1);
            root.right.right=new Node(7);
            //root.right.right.right=new Node(6);
            widt(root);
    }
}
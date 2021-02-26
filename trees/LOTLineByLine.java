import java.util.*;
public class LOTLineByLine {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static void line(Node root)
      {if(root==null)
        return;
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       while(q.size()>1)
       {
           Node cur=q.poll();
          
           if(cur==null)
           {
           System.out.println();
           q.add(null);
           continue;
           }
           System.out.print(cur.data+" ");
          
           if(cur.left!=null)
           q.add(cur.left);
           if(cur.right!=null)
           q.add(cur.right);
       }

      }
     
        public static void main(String[] args) {
            Node root=new Node(1);                            //          1
            root.left=new Node(2);                            //     2         5
            root.left.left=new Node(3);                       //  3    4     6    7
            root.left.right=new Node(4);                      
            root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            line(root);
      }
}
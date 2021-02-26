import java.util.*;
public class LeftViewOfBinaryTree {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static void left(Node root)

      {
          Queue<Node> q=new LinkedList<>();
          q.add(root);
          while(q.isEmpty()==false)
          {
              int c=q.size();
              for(int i=0;i<c;i++)
              {
                  Node cur=q.poll();
                  if(i==0)
                  System.out.println(cur.data+" ");
                  if(cur.left!=null)
                  q.add(cur.left);
                  if(cur.right!=null)
                  q.add(cur.right);
              }
          }
      }
    public static void main(String[] args) {
        Node root = new Node(10); 
        root.left = new Node(12); 
        root.right =new Node(3); 
        root.left.right = new Node(4); 
        root.right.left = new Node(5); 
        root.right.left.right = new Node(6); 
        root.right.left.right.left = new Node(18); 
        root.right.left.right.right = new Node(7); 
        left(root);
    }
}
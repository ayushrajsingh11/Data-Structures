import java.util.*;
public class traversalSpiral {
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static void spiral(Node root)
      {
          if(root==null)
          return;
          Queue<Node> q=new LinkedList<>();
          q.add(root);
          Stack<Integer> s=new Stack<>();
          boolean rev=false;
          while(q.isEmpty()==false)
          {
              int c=q.size();
              for(int i=0;i<c;i++)
            {
             Node cur=q.poll();
             if(rev)
             {
                 s.push(cur.data);
             }
             else
             System.out.println(cur.data+" ");
             if(cur.left!=null)
             q.add(cur.left);
             if(cur.right!=null)
             q.add(cur.right);
            
            }
            if(rev)
            {
                while(s.isEmpty()==false)
                System.out.println(s.pop()+" ");
            }
            rev=!rev;
        }
        //System.out.println();
      }
    public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2          3
        root.left.left=new Node(4);                       //  4    5      6   7
        root.left.left.left=new Node(8);                //  8   9        10
        root.left.left.right=new Node(9);                 
        //root.left.right=new Node(6);                   
        root.right=new Node(3);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(10);
        spiral(root);
    }
}
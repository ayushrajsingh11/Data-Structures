import java.util.*;
public class DiaOfBinary{
   static int res=0;
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static int height(Node root)
      {

          if(root==null)
          return 0;
          int lh=height(root.left);
          int rh=height(root.right);
          res=Math.max(res,1+lh+rh);//height ke sath sath diameter bhi nikal lia aur last me bs maximum nial lia
          return 1+Math.max(lh,rh);
      }
      static int   diameter(Node root)
      {
       if(root==null)
       return 0;
       int d=height(root);
       return d;
      }
     
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
         System.out.print(diameter(root));

    }
}
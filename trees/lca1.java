import java.util.*;

public class lca1 {
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static Node lca(Node root,int n1,int n2)
      {
          
          ArrayList<Node> a1=new ArrayList<>();
          ArrayList<Node> a2=new ArrayList<>();
          if(pathfind(root,a1,n1)==false||pathfind(root,a2,n2)==false)
          {
             return null;
          }
          int i;
          for( i=0;(i<a1.size()-1)&&(i<a2.size()-1);i++)
           if(a1.get(i+1)!=a2.get(i+1))
               break;
               return a1.get(i);
          

             
        
      }
     static boolean pathfind(Node root,ArrayList<Node> a1,int n1)
     {
        if(root==null)
        return false;
        a1.add(root);
        if(root.data==n1)
        return true;
        if(pathfind(root.left,a1,n1)||pathfind(root.right,a1,n1))
        {
           return true;
        }
         a1.remove(a1.size()-1);
         return false;
     }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        System.out.print(lca(root,4,7).data);
    }
}
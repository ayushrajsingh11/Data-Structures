import java.util.*;
public class serilizeAndDeserilize {
    static ArrayList<Integer> a=new ArrayList<>();
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static void serialize(Node root)
      {
     if(root==null)
     {a.add(-1);
     return ;
     }
     a.add(root.data);
     serialize(root.left);
     serialize(root.right);
     

      }
      static void  deserilize(ArrayList<Integer> a)
      {
       //maintain index znd easy
      }
     static void print()
      {
           for(Integer b:a)
           {
               System.out.println(b);
           }
      }
      public static void main(String[] args) {
          
        Node root = new Node(10); 
  
        root.left = new Node(20); 
        root.right = new Node(30); 
       
       
        serialize(root);
        print();
      }
}